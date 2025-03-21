package com.android.projectnhom;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("authenticate/")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
}
