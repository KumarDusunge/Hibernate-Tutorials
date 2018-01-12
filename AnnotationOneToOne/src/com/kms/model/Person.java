package com.kms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
	@GeneratedValue
	private int Pid;
	private String name;
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int Pid) {
		this.Pid = Pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
