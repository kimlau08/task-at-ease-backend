package com.taskatease.taskAtEaseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskInnerJoinUserDto;
import com.taskatease.taskAtEaseBackend.service.JoinQueryService;


@RestController
@RequestMapping("/tae_api/v1")

public class JoinQueryController {

	@Autowired
	private JoinQueryService joinQueryService;
	
	@GetMapping("/photojointaskjoinuser")
	public ResponseEntity<List<PhotoInnerJoinTaskInnerJoinUserDto>>getPhotoTaskUserInnerJoin() {
		return new ResponseEntity<List<PhotoInnerJoinTaskInnerJoinUserDto>>(joinQueryService.getPhotoTaskUserInnerJoin(), HttpStatus.OK);
	}
}
