package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskatease.taskAtEaseBackend.model.Task;

public interface TaskRespository extends JpaRepository<Task, Long>{
	
	Optional<Task> findById(Long task);

	List<Task> findAllByOwner(Long owner);

	List<Task> findAllByWorker(Long worker);
	
	List<Task> findAllByStatus(String status);
}
