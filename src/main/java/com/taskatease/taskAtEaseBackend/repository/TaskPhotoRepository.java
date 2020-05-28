package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskatease.taskAtEaseBackend.model.TaskPhoto;

public interface TaskPhotoRepository extends JpaRepository<TaskPhoto, Long>{

	List<TaskPhoto> findAllByWorker(Long worker);
}
