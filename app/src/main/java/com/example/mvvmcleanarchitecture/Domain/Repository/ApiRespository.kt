package com.example.mvvmcleanarchitecture.Domain.Repository

import com.example.mvvmcleanarchitecture.Domain.AppModel.Model

interface ApiRespository {

    suspend fun getResposneRepo(): List<Model>

}