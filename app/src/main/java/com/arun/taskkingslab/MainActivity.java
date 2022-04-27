package com.arun.taskkingslab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONPlaceholder jsonPlaceholder;
    private static final String TAG = "MainTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://crm.todomor.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceholder = retrofit.create(JSONPlaceholder.class);

        getDataa();
    }
    private void getDataa() {
        String bodyS ="{\"login_user_id\":\"615\",\"company_id\":\"6\",\"S_CustromerCompany\":\"\",\"S_enquirystatus\":\"\",\"S_email\":\"\",\"S_comment\":\"\",\"S_FollowUpDate\":\"\",\"S_FollowUpDate_Sort_By\":\"\",\"S_ORDERBY\":\"lastupdate_date desc\",\"S_Updated_Sort_By\":\"\",\"S_Client_type\":[],\"S_region\":[],\"S_branch\":[],\"S_assigned\":[],\"dynamicdd1\":[],\"dynamicdd2\":[],\"S_FromDate\":\"\",\"S_ToDate\":\"\",\"save_search_sort_code\":\"lastupdate_date\",\"sort_type\":\"desc\",\"S_grid_search\":0}\n";
        Call<List<Data>> call = jsonPlaceholder.getData(bodyS);
        Log.d(TAG, "getDataa: calling");
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                Log.d(TAG, "onResponse: calling");
                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                List<Data> postList = response.body();
                RecAdapter postAdapter = new RecAdapter(MainActivity.this,postList);
                recyclerView.setAdapter(postAdapter);
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {

            }
        });
    }

}