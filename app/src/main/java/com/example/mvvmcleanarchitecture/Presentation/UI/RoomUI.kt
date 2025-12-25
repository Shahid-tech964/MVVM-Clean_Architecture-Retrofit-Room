package com.example.mvvmcleanarchitecture.Presentation.UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvvmcleanarchitecture.Presentation.Viewmodel.RoomViewmodel
@Composable
fun todo(viewmodel: RoomViewmodel) {
    var title by remember {
        mutableStateOf("")
    }

    var content by remember {
        mutableStateOf("")
    }

    val data by viewmodel.items.collectAsState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = title,
            onValueChange = { title = it },
            label = { Text("Enter text") }
        )

        Spacer(Modifier.height(10.dp))

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = content,
            onValueChange = { content = it },
            label = { Text("Enter text") }

        )
        Spacer(Modifier.height(15.dp))

        IconButton(onClick = {
            viewmodel.adddata(title, content)
        }) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                Modifier.size(60.dp)
            )
        }



        Spacer(Modifier.height(15.dp))



        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(data) { it ->
                ListItem(
                    modifier = Modifier.fillMaxWidth(),
                    headlineContent = { Text(it.title) },
                    supportingContent = { Text(it.content) },
                    trailingContent = {
                        IconButton(onClick = {
                            viewmodel.deletedata(it.id)
                        }) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = null,
                                Modifier.size(60.dp)
                            )
                        }
                    }

                )

            }
        }


    }


}