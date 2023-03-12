package com.ann.todoapp.addtask.data

import androidx.room.*
import com.ann.todoapp.addtask.ui.model.TaskEntity
import com.ann.todoapp.addtask.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item: TaskEntity)

    @Update
    suspend fun updateTask(item: TaskEntity)

    @Delete
    suspend fun deleteTask(item: TaskEntity)
}