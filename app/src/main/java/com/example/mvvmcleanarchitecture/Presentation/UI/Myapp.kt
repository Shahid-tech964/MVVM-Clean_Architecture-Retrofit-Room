package com.example.mvvmcleanarchitecture.Presentation.UI

import android.app.Application
import androidx.room.Room
import com.example.mvvmcleanarchitecture.Data.local.mydatabase

class Myapp : Application() {
    companion object {
        lateinit var database: mydatabase

    }
    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, mydatabase::class.java, "MyDatabase").build()
    }

}