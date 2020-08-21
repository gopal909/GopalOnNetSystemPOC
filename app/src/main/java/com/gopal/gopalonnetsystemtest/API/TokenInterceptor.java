package com.gopal.gopalonnetsystemtest.API;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        //rewrite the request to add bearer token
        Request newRequest=chain.request().newBuilder()
                .header("Authorization","Bearer "+ "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFuZHJha2FudGguZGNAZ21haWwuY29tIiwicm9sZXMiOlt7ImlkIjoiNWRhMDBhMTJlMmY3NWMxYmJjNWNkOTY3Iiwicm9sZSI6IlVzZXIifV0sImlhdCI6MTU5NzkyNTI4MywiZXhwIjoxNTk4NTMwMDgzfQ.oempyZG86rRKoPqqCwqFHHNwVe5DeeFlUkfiQG83o8I")
                .build();

        return chain.proceed(newRequest);
    }
}