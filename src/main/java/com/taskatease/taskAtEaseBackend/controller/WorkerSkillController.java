package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.model.WorkerSkill;
import com.taskatease.taskAtEaseBackend.repository.WorkerSkillRepository;

@RestController
@RequestMapping("/tae_api/v1")
@CrossOrigin
public class WorkerSkillController {

	
	@Autowired
	private WorkerSkillRepository workerSkillRepository;
	
	@GetMapping("/workerskill")
	public List<WorkerSkill> getAllWorkerSkill(Model model) {
		
	return this.workerSkillRepository.findAll();
	
	}

	//find by skill

	@GetMapping("/workerskill/{skill}")
	public List<WorkerSkill> getAllBySkill(@PathVariable(value = "skill") String skill) {
		
	return this.workerSkillRepository.findAllBySkill(skill);
	
	}
	
	//find by worker

	@GetMapping("/workerskillbyworker/{worker}")
	public List<WorkerSkill> getAllByWorker(@PathVariable(value = "worker") Long worker) {
		
	return this.workerSkillRepository.findAllByWorker(worker);
	
	}
	
}
