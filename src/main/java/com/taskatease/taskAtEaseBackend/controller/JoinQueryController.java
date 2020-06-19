package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskDto;
import com.taskatease.taskAtEaseBackend.service.JoinQueryService;


@RestController
@RequestMapping("/tae_api/v1")

public class JoinQueryController {

	@Autowired
	private JoinQueryService joinQueryService;
	
	@GetMapping("/photojointask")
	public ResponseEntity<List<PhotoInnerJoinTaskDto>>getPhotoTaskInnerJoin() {
		return new ResponseEntity<List<PhotoInnerJoinTaskDto>>(joinQueryService.getPhotoTaskInnerJoin(), HttpStatus.OK);
	}
}
