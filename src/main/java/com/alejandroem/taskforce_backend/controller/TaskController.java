package com.alejandroem.taskforce_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandroem.taskforce_backend.entity.Task;
import com.alejandroem.taskforce_backend.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:5173/")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping()
	public List<Task> findAllBooks() {
		return taskService.findAllTasks();
	}
	
	@GetMapping("/{id}")
	public Task findBookById(@PathVariable long id) {
		return taskService.findTaskById(id);
	}
	
	@PostMapping()
	public Task addBook(@RequestBody Task task) {
		return taskService.addTask(task);
	}
}