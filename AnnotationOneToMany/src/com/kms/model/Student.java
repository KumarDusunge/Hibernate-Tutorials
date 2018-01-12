package com.kms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int sId;
	
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Address> addresList;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getAddresList() {
		return addresList;
	}

	public void setAddresList(Set<Address> addresList) {
		this.addresList = addresList;
	}
	
}
