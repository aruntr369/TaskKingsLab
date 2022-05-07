package com.arun.taskkingslab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.JsonElement;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
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

        SampleBody bodyS =new SampleBody();
        bodyS.login_user_id = "615";
        bodyS.company_id ="6";
        bodyS.S_CustromerCompany = "";
        bodyS.S_enquirystatus = "";
        bodyS.S_email = "";
        bodyS.S_comment = "";
        bodyS.S_FollowUpDate ="";
        bodyS.S_FollowUpDate_Sort_By = "";
        bodyS.S_ORDERBY = "lastupdate_date desc";
        bodyS.S_Updated_Sort_By = "";
        bodyS.S_Client_type = new ArrayList<>();
        bodyS.S_region = new ArrayList<>();
        bodyS.S_branch = new ArrayList<>();
        bodyS.S_assigned = new ArrayList<>();
        bodyS.dynamicdd1 = new ArrayList<>();
        bodyS.dynamicdd2 = new ArrayList<>();
        bodyS.S_FromDate = "";
        bodyS.S_ToDate = "";
        bodyS.save_search_sort_code = "lastupdate_date";
        bodyS.sort_type = "desc";
        bodyS.S_grid_search =0;




              //  "login_user_id\":\"615\",\"company_id\":\"6\",\"S_CustromerCompany\":\"\",\"S_enquirystatus\":\"\",\"S_email\":\"\",\"S_comment\":\"\",\"S_FollowUpDate\":\"\",\"S_FollowUpDate_Sort_By\":\"\",\"S_ORDERBY\":\"lastupdate_date desc\",\"S_Updated_Sort_By\":\"\",\"S_Client_type\":[],\"S_region\":[],\"S_branch\":[],\"S_assigned\":[],\"dynamicdd1\":[],\"dynamicdd2\":[],\"S_FromDate\":\"\",\"S_ToDate\":\"\",\"save_search_sort_code\":\"lastupdate_date\",\"sort_type\":\"desc\",\"S_grid_search\":0}\n";
       // ModelValues valuess = new ModelValues("615","6", "", "","","","","","lastupdate_date desc","", "", "","lastupdate_date","desc",0);


        Call<ResponesData> call = jsonPlaceholder.getData(bodyS);
        //Call<JsonElement> call = jsonPlaceholder.getData(bodyS);
        Log.d(TAG, "getDataa: calling");
        call.enqueue(new Callback<ResponesData>() {
            @Override
            public void onResponse(Call<ResponesData> call, Response<ResponesData> response) {
                Log.d(TAG, "onResponse: calling" +response.body());
                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                ResponesData postList = response.body();
                RecAdapter postAdapter = new RecAdapter(MainActivity.this,postList.data);
                recyclerView.setAdapter(postAdapter);
            }

            @Override
            public void onFailure(Call<ResponesData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed ", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onFailure: failed" + t.getMessage());

            }
        });
    }

}