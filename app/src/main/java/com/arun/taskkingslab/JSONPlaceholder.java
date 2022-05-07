package com.arun.taskkingslab;

import com.google.gson.JsonElement;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JSONPlaceholder {

    @PUT("clientenquirylist/6/0")
    Call<ResponesData> getData(@Body SampleBody post);

}
