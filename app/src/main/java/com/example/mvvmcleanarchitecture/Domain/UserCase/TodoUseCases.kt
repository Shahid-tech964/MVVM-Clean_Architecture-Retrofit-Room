package com.example.mvvmcleanarchitecture.Domain.UserCase

import android.util.Log
import com.example.mvvmcleanarchitecture.Domain.AppModel.EntityModel
import com.example.mvvmcleanarchitecture.Domain.Repository.RoomReposittory
import kotlinx.coroutines.flow.Flow

class TodoUseCases(val roomReposittory: RoomReposittory) {
    suspend fun AddItemUseCase(title:String,content: String){

        if (title.isNotEmpty()&&content.isNotEmpty())
         roomReposittory.addItemRepo(EntityModel(0,title,content))

        else{
            Log.d("Check validation", " Please provide tiitle and content ")
            print("Please provide tiitle and content")
        }
    }

    suspend fun deleteItemUseCase(id:Int){
        roomReposittory.deleteItemRepo(id)
    }

    fun getitemUsecase(): Flow<List<EntityModel>>{
        return  roomReposittory.getItemRepo()
    }


}