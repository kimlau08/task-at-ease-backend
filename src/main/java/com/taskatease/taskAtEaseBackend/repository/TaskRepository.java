package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.taskatease.taskAtEaseBackend.dto.TaskInnerJoinOwnerForWorkerDto;
import com.taskatease.taskAtEaseBackend.dto.TaskLeftJoinWorkerForOwnerDto;
import com.taskatease.taskAtEaseBackend.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	Optional<Task> findById(Long task);

	List<Task> findAllByOwner(Long owner);

	List<Task> findAllByWorker(Long worker);
	
	List<Task> findAllByStatus(String status);

	@Query("SELECT new com.taskatease.taskAtEaseBackend.dto.TaskLeftJoinWorkerForOwnerDto(" +
	"		u.name, u.email, u.free, u.city, u.st, u.zip, u.photo, " +
	"       t.id, t.owner, t.ownername, t.owneremail, t.kind, t.status, t.details, " + 
	"		 t.skill1, t.skill2, t.skill3," + 
	"		 t.hours, t.worker ) " + 
	"FROM Task t " +
	"LEFT JOIN User u ON t.worker = u.id " +
	"WHERE t.owner = :owner " )
	List<TaskLeftJoinWorkerForOwnerDto> fetchTaskWorkerJoinForOwner(@Param("owner") Long owner);
	

	@Query("SELECT new com.taskatease.taskAtEaseBackend.dto.TaskInnerJoinOwnerForWorkerDto(" +
	"		u.name, u.email, u.free, u.city, u.st, u.zip, u.photo, " +
	"       t.id, t.owner, t.ownername, t.owneremail, t.kind, t.status, t.details, " + 
	"		 t.skill1, t.skill2, t.skill3," + 
	"		 t.hours, t.worker ) " + 
	"FROM Task t " +
	"INNER JOIN User u ON t.owner = u.id " +
	"WHERE t.worker = :worker " )
	List<TaskInnerJoinOwnerForWorkerDto> fetchTaskOwnerJoinForWorker(@Param("worker") Long worker);
}
