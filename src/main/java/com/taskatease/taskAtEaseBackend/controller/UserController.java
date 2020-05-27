package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.model.User;
import com.taskatease.taskAtEaseBackend.repository.UserRepository;

@RestController
@RequestMapping("/tae_api/v1")


public class UserController {

@Autowired
private UserRepository userRepository;

@GetMapping("/user")
public List<User> getAllCustomers(Model model) {
	
return this.userRepository.findAll();

}

	
}
