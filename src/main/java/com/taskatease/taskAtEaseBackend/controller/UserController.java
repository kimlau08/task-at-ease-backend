package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.exception.ResourceNotFoundException;
import com.taskatease.taskAtEaseBackend.model.User;
import com.taskatease.taskAtEaseBackend.repository.UserRepository;

@RestController
@RequestMapping("/tae_api/v1")
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepository userRepository;

	//get all user 

	@GetMapping("/user")
	public List<User> getAllUser(Model model) {
		
	return this.userRepository.findAll();
	
	}
	
	//get a user by id

	@GetMapping("/userbyid/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id)
	    throws ResourceNotFoundException {
	    User user = userRepository.findById(id)
	      .orElseThrow(() -> new ResourceNotFoundException("User not found. Id :: " + id));
	    return ResponseEntity.ok().body(user);
	}

	//get a user by email

	@GetMapping("/user/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable(value = "email") String email)
	    throws ResourceNotFoundException {
	    User user = userRepository.findByEmail(email)
	      .orElseThrow(() -> new ResourceNotFoundException("User not found. Email :: " + email));
	    return ResponseEntity.ok().body(user);
	}
	
}
