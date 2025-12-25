package com.example.mvvmcleanarchitecture.Data.remote

import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    suspend fun getResponse(): retrofit2.Response<List<ModelDTO>>
}