package com.taskatease.taskAtEaseBackend.dto;

public class PhotoInnerJoinTaskInnerJoinUserDto {

	private String name;
	private String email;
	private String free;
	private String city;
	private String st;
	private String zip;
	private String photo;

	private long worker;
	private long task;
	private String tskphoto;
	
	private long owner;
	private String ownername;
	private String owneremail;
	private String kind;
	private String status;
	private String details;
	private String skill1;
	private String skill2;
	private String skill3;
	private long hours;
	
	public PhotoInnerJoinTaskInnerJoinUserDto(

			String name,
			String email,
			String free,
			String city,
			String st,
			String zip,
			String photo,

			long worker,
			long task,
			String tskphoto,
			
			long owner,
			String ownername,
			String owneremail,
			String kind,
			String status,
			String details,
			String skill1,
			String skill2,
			String skill3,
			long hours  )
		{
			this.name = name;
			this.email = email;
			this.free = free;
			this.city = city;
			this.st = st;
			this.zip = zip;
			this.photo = photo;

			this.worker = worker;
			this.task = task;
			this.tskphoto = tskphoto;
			
			this.owner = owner;
			this.ownername = ownername;
			this.owneremail = owneremail;
			this.kind = kind;
			this.status = status;
			this.details = details;
			this.skill1 = skill1;
			this.skill2 = skill2;
			this.skill3 = skill3;
			this.hours = hours;
		}
	


	@Override
	public String toString() {

		return "PhotoInnerJoinTaskInnerJoinUserDto [ "+
								" name = " + name +
								" email = " + email +
								" free = " + free + 
								" city = " + city +
								" st = " + st + 
								" zip = " + zip + 
								" photo = " + photo +

								" worker=" + worker +
								" task =" + task +
								" tskphoto =" + tskphoto +
								
								" owner =" + owner +
								" owneremail =" + owneremail +
								" kind =" +  kind +
								" status =" + status +
								" details =" + details +
								" skill1 =" + skill1 +
								" skill2 =" + skill2 +
								" skill3 =" + skill3 +
								" hours =" + hours +
								"]" ;
	}


	//getters 

	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}



	public String getFree() {
		return free;
	}



	public String getCity() {
		return city;
	}



	public String getSt() {
		return st;
	}



	public String getZip() {
		return zip;
	}



	public String getPhoto() {
		return photo;
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



	public long getOwner() {
		return owner;
	}



	public String getOwnername() {
		return ownername;
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
			
	
	
}
