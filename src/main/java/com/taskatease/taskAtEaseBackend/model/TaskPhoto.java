package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@Column(name = "tskphoto")
	private String tskphoto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="task", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	private Task taskobj;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="worker", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	private User userobj;
	
	
	public TaskPhoto() {
		super();
	}


	//getters
	
	public long getId() {
		return id;
	}


	public long getWorker() {
		return worker;
	}


	public long getTask() {
		return task;
	}


	public String getTskphoto() {
		return tskphoto;
	}


	public Task getTaskobj() {
		return taskobj;
	}


	public User getUserobj() {
		return userobj;
	}

	
}
