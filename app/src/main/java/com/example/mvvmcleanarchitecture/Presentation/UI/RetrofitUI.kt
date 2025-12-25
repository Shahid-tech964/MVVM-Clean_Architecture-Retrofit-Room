package com.example.mvvmcleanarchitecture.Presentation.UI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.mvvmcleanarchitecture.Presentation.States.ApiStates
import com.example.mvvmcleanarchitecture.Presentation.Viewmodel.ApiViewmodel

@Composable
fun DataList(viewmodel: ApiViewmodel) {

    LaunchedEffect(Unit) {
        viewmodel.showResponse()
    }
    val state by viewmodel.states.collectAsState()

    when (state) {
        is ApiStates.Error -> {
            val error = (state as ApiStates.Error).error

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(error, fontSize = 20.sp)
            }

        }

        ApiStates.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.Green)
            }
        }

        is ApiStates.Success -> {
            val datalist = (state as ApiStates.Success).message

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(datalist) { item ->
                    ListItem(
                        headlineContent = { Text(item.title) },
                        supportingContent = { Text(item.body) },

                        )
                }
            }

        }

    }

}