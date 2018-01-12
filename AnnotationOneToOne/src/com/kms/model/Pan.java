package com.kms.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Pan {

	@Id
	@GeneratedValue
	@GenericGenerator(name="newGenretor", strategy="foreign", parameters={@Parameter(name="person", value="property")})
	private int panId;
	private String panNumber;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="panId")
	private Person person;
	
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
