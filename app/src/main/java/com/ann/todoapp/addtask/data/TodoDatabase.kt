package com.ann.todoapp.addtask.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ann.todoapp.addtask.ui.model.TaskEntity

@Database(entities = [TaskEntity::class] , version = 1)
abstract class TodoDatabase : RoomDatabase(){
    //DAO

    abstract fun taskDao(): TaskDao
}