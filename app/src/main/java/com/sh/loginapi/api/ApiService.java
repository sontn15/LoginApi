package com.sh.loginapi.api;


import com.sh.loginapi.model.LoginRequest;
import com.sh.loginapi.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("TokenAuth/Authenticate")
    Call<LoginResponse> login(@Body LoginRequest request);
}
