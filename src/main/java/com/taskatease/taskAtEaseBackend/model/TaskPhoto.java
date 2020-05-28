package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taskphoto")
public class TaskPhoto {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "worker")
	private long worker;	

	@Column(name = "task")
	private long task;	
	
	@Column(name = "photo")
	private String photo;

	
	public TaskPhoto() {
		super();
	}


	public long getId() {
		return id;
	}


	public long getWorker() {
		return worker;
	}


	public long getTask() {
		return task;
	}


	public String getPhoto() {
		return photo;
	}

	
}
