package com.kms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kms.model.Pan;
import com.kms.model.Person;



public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/kms/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Person person = new Person();
		person.setName("Dk");
		
		Pan pan = new Pan();
		pan.setPanNumber("Dk22Dk");
		pan.setPerson(person);
		
		session.save(pan);
		session.beginTransaction().commit();
	}
}
