package com.example.mvvmcleanarchitecture.Presentation.UI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider

import com.example.mvvmcleanarchitecture.Presentation.Viewmodel.RoomViewmodel

class MainActivity : ComponentActivity() {
    lateinit var viewmodel: RoomViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {

        viewmodel = ViewModelProvider(this).get(RoomViewmodel::class.java)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            todo(viewmodel)
        }
    }
}