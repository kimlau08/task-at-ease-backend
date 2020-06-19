package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "owner")
	private long owner;

	@Column(name = "ownername")
	private String ownername;

	@Column(name = "owneremail")
	private String owneremail;
	
	@Column(name = "kind")
	private String kind;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "skill1")
	private String skill1;
	
	@Column(name = "skill2")
	private String skill2;
	
	@Column(name = "skill3")
	private String skill3;
	
	@Column(name = "hours")
	private long hours;
	
	@Column(name = "worker")
	private long worker;
	


	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getOwner() {
		return owner;
	}


	public void setOwner(long owner) {
		this.owner = owner;
	}


	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	public String getOwneremail() {
		return owneremail;
	}


	public void setOwneremail(String owneremail) {
		this.owneremail = owneremail;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public String getSkill1() {
		return skill1;
	}


	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}


	public String getSkill2() {
		return skill2;
	}


	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}


	public String getSkill3() {
		return skill3;
	}


	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}


	public long getHours() {
		return hours;
	}


	public void setHours(long hours) {
		this.hours = hours;
	}


	public long getWorker() {
		return worker;
	}


	public void setWorker(long worker) {
		this.worker = worker;
	}


	public Task() {
		super();
		
	}
	

}

