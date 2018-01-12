package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Student s1=new Student();
		Address a1=new Address();
		a1.setAreaName("karve nagar");
		a1.setCityName("pune");
		s1.setName("sajan");
		s1.setRoll(12);
		s1.setAddress(a1);
		session.save(s1);
		
		Transaction tr=session.beginTransaction();
		tr.commit();
		session.evict(s1);
		sf.close();
	}

}
