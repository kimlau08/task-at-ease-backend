package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.exception.ResourceNotFoundException;
import com.taskatease.taskAtEaseBackend.model.Task;
import com.taskatease.taskAtEaseBackend.repository.TaskRespository;

@RestController
@RequestMapping("/tae_api/v1")

public class TaskController {

	@Autowired
	private TaskRespository taskRepository;

	//get all task

	@GetMapping("/task")
	public List<Task> getAllTask(Model model) {
		
	return this.taskRepository.findAll();
	
	}

	//get tasks by owner

	@GetMapping("/task/{owner}")
	public List<Task> getTaskByOwner(@PathVariable(value = "owner") Long owner) {
		
	return this.taskRepository.findAllByOwner(owner);
	
	}
	
	//  save new task 
	  
	  @PostMapping("/task")
	  public Task createTask(@Valid @RequestBody Task task) {
		  return taskRepository.save(task);
	  }



	

}
