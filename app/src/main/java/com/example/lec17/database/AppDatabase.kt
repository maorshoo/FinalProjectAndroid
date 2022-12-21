package com.example.lec17.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lec17.database.dao.PeopleDao
import com.example.lec17.models.Person


const val DB_NAME = "AppDatabase"
const val DB_VERSION = 1

@Database(entities = [Person::class], version = DB_VERSION)
abstract  class AppDatabase:RoomDatabase() {

    abstract fun peopleDao():PeopleDao

    companion object{
        fun create(context:Context):AppDatabase=
             Room.databaseBuilder(context,AppDatabase::class.java, DB_NAME).
                 fallbackToDestructiveMigration()
                 .build()
    }
}