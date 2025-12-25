package com.example.mvvmcleanarchitecture.Data.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Record::class], version = 1)
abstract class mydatabase : RoomDatabase() {

    abstract fun getdao(): Dao2

}