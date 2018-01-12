package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movie;

public class Client {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Actor a = new Actor();
		a.setAid(1);
		a.setName("Dk");
		
		Movie m1 = new Movie();
		m1.setMid(1);
		m1.setName("pk");
		m1.setActor(a);
		
		Movie m2 = new Movie();
		m2.setMid(2);
		m2.setName("ok");
		m2.setActor(a);
		
		s.save(a);
		s.save(m1);
		s.save(m2);
		
		s.beginTransaction().commit();
		s.clear();
		s.close();
		sf.close();
	}

}
