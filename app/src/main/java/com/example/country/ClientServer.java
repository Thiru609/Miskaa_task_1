package com.example.country;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientServer {
    public static final String BASE_URL = "https://restcountries.eu/rest/v2/region/";
    private static Retrofit retrofit = null;

    public static Retrofit getClientServer() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}