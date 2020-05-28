package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.taskatease.taskAtEaseBackend.model.Task;

public interface TaskRespository extends JpaRepository<Task, Long>{

	List<Task> findAllByOwner(Long owner);
}
