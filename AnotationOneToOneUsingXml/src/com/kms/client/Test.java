package com.kms.client;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.kms.model.Pan;
import com.kms.model.Person;

public class Test {
	
	public static void main(String[] args) {
		
		Session session = new Configuration().configure("com/kms/resources/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Person person = new Person();
		person.setName("Dk");
		
		Person person1 = new Person();
		person1.setName("Mrf");
		
		Person person2 = new Person();
		person2.setName("Shan");
		
		Pan pan = new Pan();
		pan.setPanNumber("Dk22Dk");
		
		Pan pan1 = new Pan();
		pan1.setPanNumber("Mfr25Mrf");
		
		Pan pan2 = new Pan();
		pan2.setPanNumber("Shan20Shan");
		
		session.save(person);
		session.save(person1);
		session.save(person2);
		
		session.beginTransaction().commit();
		
	}

}
