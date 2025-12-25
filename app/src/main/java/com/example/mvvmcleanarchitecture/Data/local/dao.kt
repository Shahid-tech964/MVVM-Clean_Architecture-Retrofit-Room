package com.example.mvvmcleanarchitecture.Data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface  Dao2{
    @Insert
    suspend fun  additem(record: Record)


    @Query("DELETE FROM Record_Table WHERE id = :id")
    suspend fun deleteById(id: Int)



    @Query("select * from Record_Table")
    fun getitems(): Flow<List<Record>>

}