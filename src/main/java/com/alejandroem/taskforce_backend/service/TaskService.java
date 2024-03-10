package com.alejandroem.taskforce_backend.service;

import java.util.List;
import com.alejandroem.taskforce_backend.entity.Task;

public interface TaskService {
	public List<Task> findAllTasks();
	public Task addTask(Task task);
	public Task findTaskById(long id);
}