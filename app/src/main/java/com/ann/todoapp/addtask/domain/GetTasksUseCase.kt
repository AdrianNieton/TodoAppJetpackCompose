package com.ann.todoapp.addtask.domain

import com.ann.todoapp.addtask.data.TaskRepository
import com.ann.todoapp.addtask.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository){

    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}