package com.arun.taskkingslab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecAdapter extends RecyclerView.Adapter<RecAdapter.PostViewHolder> {

        Context context;
    List<ResponesData.Datum> data ;

        RecAdapter(Context context, List<ResponesData.Datum>  postList){
            this.context = context;
            this.data = postList;
        }


        @NonNull
        @Override
        public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
            return new PostViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
            ResponesData.Datum post = data.get(position);
            holder.email.setText("Email : " + post.client_email);
            holder.name.setText("Name : " + post.client_name);
            holder.phno.setText("Phone Number :" + post.client_mobile_number);

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, ""+post.client_name, Toast.LENGTH_SHORT).show();

                }
            });

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public class PostViewHolder extends RecyclerView.ViewHolder {

            TextView phno , email , name ;
            CardView cardView;
            ConstraintLayout constraintLayout;
            public PostViewHolder(@NonNull View itemView) {
                super(itemView);

                phno = itemView.findViewById(R.id.id_phNo);
                email = itemView.findViewById(R.id.id_email);
                name = itemView.findViewById(R.id.user_iname);
                cardView =  itemView.findViewById(R.id.cardView);
                constraintLayout = itemView.findViewById(R.id.layout_hidden);

            }
        }
}
