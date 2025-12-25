package com.example.mvvmcleanarchitecture.Presentation.States

import com.example.mvvmcleanarchitecture.Domain.AppModel.Model


sealed class ApiStates {
    object  Loading :ApiStates()
    data class Success(val message: List<Model>): ApiStates()
    data class Error(val  error:String): ApiStates()
}