package com.example.mvvmcleanarchitecture.Data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiService {
//    url->https://jsonplaceholder.typicode.com

    val retrofit =
        Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()

    val apiInterface = retrofit.create(ApiInterface::class.java)
}


