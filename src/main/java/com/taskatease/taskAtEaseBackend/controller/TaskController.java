package com.taskatease.taskAtEaseBackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.exception.ResourceNotFoundException;
import com.taskatease.taskAtEaseBackend.model.Task;
import com.taskatease.taskAtEaseBackend.repository.TaskRepository;

@RestController
@RequestMapping("/tae_api/v1")
@CrossOrigin
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	//get all task

	@GetMapping("/task")
	public List<Task> getAllTask(Model model) {
		
	return this.taskRepository.findAll();
	
	}

	//get a task by id

	@GetMapping("/task/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long taskId)
	    throws ResourceNotFoundException {
	    Task task = taskRepository.findById(taskId)
	      .orElseThrow(() -> new ResourceNotFoundException("Task not found. id :: " + taskId));
	    return ResponseEntity.ok().body(task);
	}
	
	
	//get tasks by owner

	@GetMapping("/taskbyowner/{owner}")
	public List<Task> getTaskByOwner(@PathVariable(value = "owner") Long owner) {
		
	return this.taskRepository.findAllByOwner(owner);
	
	}

	//get tasks by worker

	@GetMapping("/taskbyworker/{worker}")
	public List<Task> getTaskByWorker(@PathVariable(value = "worker") Long worker) {
		
	return this.taskRepository.findAllByWorker(worker);
	
	}

	//get tasks by status

	@GetMapping("/taskbystatus/{status}")
	public List<Task> getTaskByStatus(@PathVariable(value = "status") String status) {
		
	return this.taskRepository.findAllByStatus(status);
	
	}
	
	
	//  save new task 
	  
	  @PostMapping("/task")
	  public Task createTask(@Valid @RequestBody Task task) {
		  return taskRepository.save(task);
	  }

	  //  Delete task 
	  
	  @DeleteMapping("/task/{id}")
	  public Map<String, Boolean> deletedTask(@PathVariable(value = "id") Long taskId)
				      throws ResourceNotFoundException {
				      Task task = taskRepository.findById(taskId)
				    		  .orElseThrow(()-> new ResourceNotFoundException("Task not found. Task id :: " + taskId));
	  
				      taskRepository.delete(task);
				      Map<String, Boolean> response = new HashMap<>();
				      
				      //ack msg 
				      response.put("task deleted", Boolean.TRUE);
				      
				      return response;
	  
	  }


		//  Update task
		  
		  @PutMapping("/task/{id}")
		  public ResponseEntity<Task> updateTask(@PathVariable(value = "id") Long taskId,
				    @Valid @RequestBody Task taskDetails)
				    throws ResourceNotFoundException {
			  		Task task = taskRepository.findById(taskId)
			    		  .orElseThrow(()-> new ResourceNotFoundException("Task not found. Task id :: " + taskId));
			      
			      
			  		task.setOwner(taskDetails.getOwner()); 
			  		task.setOwnername(taskDetails.getOwnername());
			  		task.setOwneremail(taskDetails.getOwneremail());
			  		task.setKind(taskDetails.getKind());
			  		task.setStatus(taskDetails.getStatus());
			  		task.setDetails(taskDetails.getDetails());
			  		task.setSkill1(taskDetails.getSkill1());
			  		task.setSkill2(taskDetails.getSkill2());
			  		task.setSkill3(taskDetails.getSkill3());
			  		task.setHours(taskDetails.getHours());
			  		task.setWorker(taskDetails.getWorker());
			     
			     
			     final Task updatedTask = taskRepository.save(task);
			     
			     
			     return ResponseEntity.ok(updatedTask);
			      
	      }

}
