package com.example.mvvmcleanarchitecture.Data.Mapper

import com.example.mvvmcleanarchitecture.Data.remote.ModelDTO
import com.example.mvvmcleanarchitecture.Domain.AppModel.Model
import kotlin.String

fun ModelDTO.toModel(): Model {
    return Model(
        body = this.body,
        title = this.title,
        userId = this.userId
    )
}