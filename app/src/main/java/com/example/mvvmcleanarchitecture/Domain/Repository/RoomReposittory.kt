package com.example.mvvmcleanarchitecture.Domain.Repository

import com.example.mvvmcleanarchitecture.Domain.AppModel.EntityModel
import kotlinx.coroutines.flow.Flow

interface RoomReposittory {
    suspend fun  addItemRepo(appRecord: EntityModel)
    suspend fun deleteItemRepo(id:Int)
  fun getItemRepo(): Flow<List<EntityModel>>
}