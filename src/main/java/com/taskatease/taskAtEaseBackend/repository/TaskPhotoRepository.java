package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskDto;
import com.taskatease.taskAtEaseBackend.model.TaskPhoto;

public interface TaskPhotoRepository extends JpaRepository<TaskPhoto, Long>{

	List<TaskPhoto> findAllByWorker(Long worker);
	
	@Query("SELECT new com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskDto(p.worker, p.task, p.tskphoto, " + 
	"       t.owner, t.owneremail, t.kind, t.status, t.details, " + 
	"		 t.skill1, t.skill2, t.skill3," + 
	"		 t.hours )" + 
	"FROM TaskPhoto p INNER JOIN p.taskobj t " +
	"ORDER BY p.worker ")
	List<PhotoInnerJoinTaskDto> fetchPhotoTaskInnerJoin();
}