package com.kms.model;

import java.util.Set;

public class Patient {

	private int pId;
	private String name;
	private Set<Nurse> nurseList;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Nurse> getNurseList() {
		return nurseList;
	}
	public void setNurseList(Set<Nurse> nurseList) {
		this.nurseList = nurseList;
	}
	
	
}
