package com.example.mvvmcleanarchitecture.Domain.UserCase

import com.example.mvvmcleanarchitecture.Domain.AppModel.Model
import com.example.mvvmcleanarchitecture.Domain.Repository.ApiRespository

class FetchApiUseCase(val apiRepository: ApiRespository) {

    suspend fun  getResponseUseCase(): List<Model>{
        return apiRepository.getResposneRepo()
    }

}