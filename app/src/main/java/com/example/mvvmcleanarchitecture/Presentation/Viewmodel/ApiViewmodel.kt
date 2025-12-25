package com.example.mvvmcleanarchitecture.Presentation.Viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmcleanarchitecture.Data.RepositoryImpl.ApiResopositoryImpl
import com.example.mvvmcleanarchitecture.Domain.Repository.ApiRespository
import com.example.mvvmcleanarchitecture.Domain.UserCase.FetchApiUserCase

import com.example.mvvmcleanarchitecture.Presentation.States.ApiStates
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ApiViewmodel : ViewModel() {

    val repoInterface: ApiRespository= ApiResopositoryImpl()
    val fetchUseCase= FetchApiUserCase(repoInterface)
    val _states = MutableStateFlow<ApiStates>(ApiStates.Loading)
    val states: StateFlow<ApiStates> = _states

    fun showResponse() {
        try {
            viewModelScope.launch {
                _states.value = ApiStates.Success( fetchUseCase.getResponseUseCase() )
            }
        } catch (e: Exception) {
            _states.value = ApiStates.Error("Error Occurred")
        }
    }

}