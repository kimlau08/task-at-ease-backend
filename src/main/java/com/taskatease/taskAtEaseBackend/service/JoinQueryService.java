package com.taskatease.taskAtEaseBackend.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.taskatease.taskAtEaseBackend.dto.TaskInnerJoinOwnerForWorkerDto;
import com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskInnerJoinUserDto;
import com.taskatease.taskAtEaseBackend.dto.TaskLeftJoinWorkerForOwnerDto;
import com.taskatease.taskAtEaseBackend.repository.TaskPhotoRepository;
import com.taskatease.taskAtEaseBackend.repository.TaskRepository;

@Service
public class JoinQueryService {
	
	@Resource
	private TaskRepository taskRepository;
	
	@Resource
	private TaskPhotoRepository taskPhotoRespository;
	
	
	public List<PhotoInnerJoinTaskInnerJoinUserDto> getPhotoTaskUserInnerJoin() {
		List<PhotoInnerJoinTaskInnerJoinUserDto> list = taskPhotoRespository.fetchPhotoTaskUserInnerJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}
	
	public List<TaskLeftJoinWorkerForOwnerDto> getTaskWorkerJoinForOwner(Long owner) {
		List<TaskLeftJoinWorkerForOwnerDto> list = taskRepository.fetchTaskWorkerJoinForOwner(owner);
		list.forEach(l -> System.out.println(l));
		return list;
	}
	
	
	public List<TaskInnerJoinOwnerForWorkerDto> getOwnerTaskJoinForWorker(Long worker) {
		List<TaskInnerJoinOwnerForWorkerDto> list = taskRepository.fetchTaskOwnerJoinForWorker(worker);
		list.forEach(l -> System.out.println(l));
		return list;
	}
}
