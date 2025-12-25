package com.example.mvvmcleanarchitecture.Presentation.Viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmcleanarchitecture.Data.RepositoryImpl.RoomRepositoryImplt
import com.example.mvvmcleanarchitecture.Domain.AppModel.EntityModel
import com.example.mvvmcleanarchitecture.Domain.Repository.RoomReposittory
import com.example.mvvmcleanarchitecture.Domain.UserCase.TodoUseCases

import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class RoomViewmodel : ViewModel() {

     val repo: RoomReposittory= RoomRepositoryImplt()
      val todoUseCases= TodoUseCases(repo)

    //    get data from table which we have stored
    val items: StateFlow<List<EntityModel>> = todoUseCases.getitemUsecase().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    //    passing  title ,content  to repository class for add data
    fun adddata(title: String, content: String) {

        viewModelScope.launch {
           todoUseCases.AddItemUseCase(title,content)
        }
    }

    //    passing  title ,content  to repository class for delete data
    fun deletedata(id:Int) {

        viewModelScope.launch {
            todoUseCases.deleteItemUseCase(id)
        }
    }


}