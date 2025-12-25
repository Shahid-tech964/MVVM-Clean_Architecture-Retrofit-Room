package com.example.mvvmcleanarchitecture.Domain.Repository

import com.example.mvvmcleanarchitecture.Domain.AppModel.AppRecord
import kotlinx.coroutines.flow.Flow

interface RoomReposittory {
    suspend fun  addItemRepo(appRecord: AppRecord)
    suspend fun deleteItemRepo(id:Int)
  fun getItemRepo(): Flow<List<AppRecord>>
}