package com.kms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.kms.model.Address;
import com.kms.model.Student;

public class Test {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure("com/kms/resources/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Student student = new Student();
		student.setName("Dk");
		
		Address address = new Address();
		address.setAddressLine("Pune");
		
		Address address1 = new Address();
		address1.setAddressLine("Nagar");
		
		Set<Address> addressList = new HashSet<Address>();
		addressList.add(address);
		addressList.add(address1);
		
		student.setAddresList(addressList);
		
		address.setStudent(student);
		address1.setStudent(student);
		
		session.save(student);
		
		session.beginTransaction().commit();
		
	}
	
}
