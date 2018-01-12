package com.kms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue
	private int pId;
	private String name;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="nursepatient", joinColumns={@JoinColumn(name="pId")} ,inverseJoinColumns={@JoinColumn(name="nId")})
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
