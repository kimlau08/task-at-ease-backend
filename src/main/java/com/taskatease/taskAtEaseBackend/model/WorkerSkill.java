package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workerskills")
public class WorkerSkill {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	
	@Column(name = "worker")
	private long worker;
	
	@Column(name = "skill")
	private String skill;
	
	
	
	public WorkerSkill() {
		super();
	}
	
	
	
	public long getId() {
		return id;
	}
	
	
	public long getWorker() {
		return worker;
	}
	
	
	public String getSkill() {
		return skill;
	}


}
