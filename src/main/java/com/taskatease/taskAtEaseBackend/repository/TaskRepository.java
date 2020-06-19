package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskatease.taskAtEaseBackend.dto.TaskInnerJoinPhotoDto;
import com.taskatease.taskAtEaseBackend.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	Optional<Task> findById(Long task);

	List<Task> findAllByOwner(Long owner);

	List<Task> findAllByWorker(Long worker);
	
	List<Task> findAllByStatus(String status);
	
//	@Query("SELECT new com.taskatease.taskAtEaseBackend.dto.TaskInnerJoinPhotoDto(p.worker, p.task, p.photo, " + 
//			"       t.owner, t.owneremail, t.kind, t.status, t.details, " + 
//			"		 t.skill1, t.skill2, t.skill3," + 
//			"		 t.hours )" + 
//			"FROM Task t INNER JOIN t.taskphoto p ")
//	List<TaskInnerJoinPhotoDto> fetchTaskPhotoInnerJoin();
}
