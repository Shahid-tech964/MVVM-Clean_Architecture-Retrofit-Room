package com.example.mvvmcleanarchitecture.Data.RepositoryImpl

import com.example.mvvmcleanarchitecture.Data.Mapper.toModel
import com.example.mvvmcleanarchitecture.Data.remote.ApiInterface
import com.example.mvvmcleanarchitecture.Domain.AppModel.Model
import com.example.mvvmcleanarchitecture.Domain.Repository.ApiRespository
import com.example.mvvmcleanarchitecture.Data.remote.ApiService


class ApiRepository {
//    lateinit var data: List<modelItem>
//
//    suspend fun getResponse() {
//        val response = ApiService.apiInterface.getResponse()
////        if (response.isSuccessful) {
////            data = response.body()!!
////        } else {
////            throw Exception("Please try again !")
////        }
//
//
//    }



}

class  ApiResopositoryImpl: ApiRespository{

    override suspend fun getResposneRepo(): List<Model> {
     return ApiService.apiInterface.getResponse().body()?.map { it.toModel() } ?:
     listOf(
         Model("hello  this side","Hello",1)
     )
    }

}


