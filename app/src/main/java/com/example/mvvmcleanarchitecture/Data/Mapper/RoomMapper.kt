package com.example.mvvmcleanarchitecture.Data.Mapper

import com.example.mvvmcleanarchitecture.Data.local.Record
import com.example.mvvmcleanarchitecture.Domain.AppModel.AppRecord


// converts room model to app model
fun Record.toAppRecord(): AppRecord {

    return AppRecord(id = this.id, title = this.title, content = this.content)

}

// converts app model to room model
fun AppRecord.toRecord(): Record {

    return Record( title = this.title, content = this.content)

}