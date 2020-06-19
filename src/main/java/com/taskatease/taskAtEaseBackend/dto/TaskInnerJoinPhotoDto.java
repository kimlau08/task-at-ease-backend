package com.taskatease.taskAtEaseBackend.dto;

public class TaskInnerJoinPhotoDto {
	
	private long worker;
	private long task;
	private String photo;
	
	private long owner;
	private String owneremail;
	private String kind;
	private String status;
	private String details;
	private String skill1;
	private String skill2;
	private String skill3;
	private long hours;
	
	public TaskInnerJoinPhotoDto(
			 long worker,
			 long task,
			 String photo,
			
			 long owner,
			 String owneremail,
			 String kind,
			 String status,
			 String details,
			 String skill1,
			 String skill2,
			 String skill3,
			 long hours
			) 
	{
		
		this.worker = worker;
		this.task = task;
		this.photo = photo;
		
		this.owner = owner;
		this.owneremail = owneremail;
		this.kind = kind;
		this.status = status;
		this.details = details;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.hours = hours;
	}

	//getters and setters
	
	public long getWorker() {
		return worker;
	}

	public long getTask() {
		return task;
	}

	public String getPhoto() {
		return photo;
	}

	public long getOwner() {
		return owner;
	}

	public String getOwneremail() {
		return owneremail;
	}

	public String getKind() {
		return kind;
	}

	public String getStatus() {
		return status;
	}

	public String getDetails() {
		return details;
	}

	public String getSkill1() {
		return skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public long getHours() {
		return hours;
	}
	

	@Override
	public String toString( ) {
		return "TaskInnerJoinPhotoDto [ worker=" + worker +
								"task =" + task +
								"photo =" + photo +
								"owner =" + owner +
								"owneremail =" + owneremail +
								"kind =" +  kind +
								"status =" + status +
								"details =" + details +
								"skill1 =" + skill1 +
								"skill2 =" + skill2 +
								"skill3 =" + skill3 +
								"hours =" + hours +
								"]" ;
	}
}
