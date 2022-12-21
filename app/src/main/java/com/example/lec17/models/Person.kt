package com.example.lec17.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "people")
data class Person (
    val name: String,
    @PrimaryKey
    val personId: String = UUID.randomUUID().toString(),
)
