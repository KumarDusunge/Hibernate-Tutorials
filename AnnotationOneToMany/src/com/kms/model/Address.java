package com.kms.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int aId;
	
	private String addressLine;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="sId", insertable=false, updatable=false)
	private Student student;
	/*private int sId;*/
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	/*public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}*/
	
}
