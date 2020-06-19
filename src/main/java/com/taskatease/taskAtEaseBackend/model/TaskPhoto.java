package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="task", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	private Task taskobj;
	
	
	public TaskPhoto() {
		super();
	}

	//getters and setters
	
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

	public Task getTaskobj() {
		return taskobj;
	}
	
}
