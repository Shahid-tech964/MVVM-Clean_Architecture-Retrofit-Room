package com.example.mvvmcleanarchitecture.Data.local

import androidx.room.Entity
import androidx.room.PrimaryKey




@Entity(tableName = "Record_Table")
data class Record(@PrimaryKey(autoGenerate = true)  val id:Int=0, val title:String, val content:String)