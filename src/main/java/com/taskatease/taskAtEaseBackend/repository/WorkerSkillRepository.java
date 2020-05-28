package com.taskatease.taskAtEaseBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskatease.taskAtEaseBackend.model.WorkerSkill;

public interface WorkerSkillRepository extends JpaRepository<WorkerSkill, Long>{

	List<WorkerSkill> findAllByWorker(Long worker);
	
	List<WorkerSkill> findAllBySkill(String skill);
}
