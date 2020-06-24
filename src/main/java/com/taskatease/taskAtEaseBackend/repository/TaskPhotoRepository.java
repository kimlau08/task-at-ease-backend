package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskInnerJoinUserDto;
import com.taskatease.taskAtEaseBackend.model.TaskPhoto;

public interface TaskPhotoRepository extends JpaRepository<TaskPhoto, Long>{

	List<TaskPhoto> findAllByWorker(Long worker);
	
	@Query("SELECT new com.taskatease.taskAtEaseBackend.dto.PhotoInnerJoinTaskInnerJoinUserDto(" +
	"		u.name, u.email, u.free, u.city, u.st, u.zip, u.photo, " +
	"		p.worker, p.task, p.tskphoto, " + 
	"       t.owner, t.ownername, t.owneremail, t.kind, t.status, t.details, " + 
	"		 t.skill1, t.skill2, t.skill3," + 
	"		 t.hours ) " + 
	"FROM TaskPhoto p " + 
	"INNER JOIN p.taskobj t ON p.worker = t.worker " +
	"INNER JOIN p.userobj u ON u.id = p.worker " +
	"ORDER BY p.worker ")
	List<PhotoInnerJoinTaskInnerJoinUserDto> fetchPhotoTaskUserInnerJoin();
}