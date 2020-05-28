package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.model.Skill;
import com.taskatease.taskAtEaseBackend.repository.SkillRepository;

@RestController
@RequestMapping("/tae_api/v1")

public class SkillController {
	
	@Autowired
	private SkillRepository skillRepository;
	
	@GetMapping("/skill")
	public List<Skill> getAllSkill(Model model) {
		
	return this.skillRepository.findAll();
	
	}


}