package com.gopal.gopalonnetsystemtest.API;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientApi {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://174.138.120.69:83/subscriber/")
            .client(getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static Api getService() {
        return retrofit.create(Api.class);
    }

    private static OkHttpClient getClient() {
        TokenInterceptor tokenInterceptor = new TokenInterceptor();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(tokenInterceptor).
                connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        return client;
    }

}
