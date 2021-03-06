package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.model.TaskPhoto;
import com.taskatease.taskAtEaseBackend.repository.TaskPhotoRepository;

@RestController
@RequestMapping("/tae_api/v1")
@CrossOrigin
public class TaskPhotoController {

	@Autowired
	private TaskPhotoRepository taskPhotoRepository;
	
	//find all photo
	
	@GetMapping("/taskphoto")
	public List<TaskPhoto> getAllTaskPhoto(Model model) {
		
	return this.taskPhotoRepository.findAll();
		
	}
	
	//find all by worker
	
	@GetMapping("/taskphoto/{worker}")
	public List<TaskPhoto> getTaskPhotoByWorker(@PathVariable(value="worker") Long worker){
		
	return this.taskPhotoRepository.findAllByWorker(worker);
		
	}
}
