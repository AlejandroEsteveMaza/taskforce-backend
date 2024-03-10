package com.alejandroem.taskforce_backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandroem.taskforce_backend.entity.Task;
import com.alejandroem.taskforce_backend.exception.TaskNotFoundException;
import com.alejandroem.taskforce_backend.repository.TaskRepository;
import com.alejandroem.taskforce_backend.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> findAllTasks(){
		return this.taskRepository.findAll();
	}
	@Override
	public Task addTask(Task task){
		return this.taskRepository.save(task);
	}
	@Override
	public Task findTaskById(long id){
		return this.taskRepository.findById(id).orElseThrow(()-> new TaskNotFoundException("Task not found: " + id));
	}
}