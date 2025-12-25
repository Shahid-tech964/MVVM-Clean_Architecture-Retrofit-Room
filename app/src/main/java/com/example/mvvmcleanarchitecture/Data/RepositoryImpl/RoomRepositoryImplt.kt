package com.example.mvvmcleanarchitecture.Data.RepositoryImpl

import com.example.mvvmcleanarchitecture.Data.Mapper.toAppRecord
import com.example.mvvmcleanarchitecture.Data.Mapper.toRecord

import com.example.mvvmcleanarchitecture.Domain.AppModel.EntityModel
import com.example.mvvmcleanarchitecture.Domain.Repository.RoomReposittory
import com.example.mvvmcleanarchitecture.Presentation.UI.Myapp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class RoomRepositoryImplt: RoomReposittory {
    val dao  = Myapp.database.getdao()

    override suspend fun addItemRepo(appRecord: EntityModel) {
        val record =appRecord.toRecord()
        dao.additem(record)
    }

    override suspend fun deleteItemRepo(id:Int) {
         dao.deleteById(id)
    }

    override  fun getItemRepo(): Flow<List<EntityModel>> {
         return dao.getitems().map {list->
             list.map { it.toAppRecord() }
         }
    }
}