package test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		
		Movie m1 = new Movie();
		m1.setMid(1);
		m1.setName("pk");
		
		Movie m2 = new Movie();
		m1.setMid(2);
		m1.setName("ok");
		
		Set<Movie> set = new HashSet<Movie>();
		set.add(m1);
		set.add(m2);
			
		Actor a = new Actor();
		a.setAid(1);
		a.setName("Dk");
		a.setMovie(set);
		
		s.save(m1);
		s.save(m2);
		s.save(a);
		
		s.beginTransaction().commit();
		s.clear();
		s.close();
		
		sf.close();
		
	}

}
