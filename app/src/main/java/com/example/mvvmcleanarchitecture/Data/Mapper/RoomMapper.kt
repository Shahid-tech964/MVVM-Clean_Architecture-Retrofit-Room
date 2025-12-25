package com.example.mvvmcleanarchitecture.Data.Mapper

import com.example.mvvmcleanarchitecture.Data.local.Record
import com.example.mvvmcleanarchitecture.Domain.AppModel.EntityModel


// converts room model to app model
fun Record.toAppRecord(): EntityModel {

    return EntityModel(id = this.id, title = this.title, content = this.content)

}

// converts app model to room model
fun EntityModel.toRecord(): Record {

    return Record( title = this.title, content = this.content)

}