package com.arun.taskkingslab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecAdapter extends RecyclerView.Adapter<RecAdapter.PostViewHolder> {

        Context context;
        List<Data> postList;

        RecAdapter(Context context,List<Data> postList){
            this.context = context;
            this.postList = postList;
        }


        @NonNull
        @Override
        public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
            return new PostViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
            Data post = postList.get(position);
            holder.email.setText("id : " + post.getEmail());
            holder.name.setText("userId : " + post.getClientName());
            holder.phno.setText("title :" + post.getPhoneNumber());

        }

        @Override
        public int getItemCount() {
            return postList.size();
        }

        public class PostViewHolder extends RecyclerView.ViewHolder {

            TextView phno , email , name ;
            public PostViewHolder(@NonNull View itemView) {
                super(itemView);

                phno = itemView.findViewById(R.id.id_phNo);
                email = itemView.findViewById(R.id.id_email);
                name = itemView.findViewById(R.id.user_iname);
            }
        }
}
