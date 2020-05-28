package com.taskatease.taskAtEaseBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skill {

@Id
@GeneratedValue
@Column(name = "id")
private long id;

@Column(name = "skill")
private String skill;


public Skill() {
	super();
	
}

public long getId() {
	return id;
}

public String getSkill() {
	return skill;
}


}
