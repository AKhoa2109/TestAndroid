package com.android.projectnhom;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Appclient {
    private static Retrofit retrofit;
    public static synchronized Retrofit getRetrofit() { // Sửa tên phương thức
        if (retrofit == null) {


            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.larntech.net/") // Kiểm tra lại URL
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static UserService getService(){
        UserService userService = getRetrofit().create(UserService.class);
        return userService;
    }
}
