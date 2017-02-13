package com.androidbuts.api;

import com.androidbuts.api.response.Result;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


/**
 * @author Pratik Butani on 23/4/16.
 */
public interface ApiService {


    @Multipart
    @POST("upload/")
    @Headers({
            "Accept: application/json",
    })

    Call<List<Result>> uploadFile(@Part MultipartBody.Part file, @Part("description") RequestBody name);

}
