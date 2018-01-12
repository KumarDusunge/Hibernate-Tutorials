package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setId(1);
		stud.setName("abc");
		stud.setEmail("abc@gmail.com");
		stud.setMark(500);
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		s.save(stud);
		s.beginTransaction().commit();
		s.evict(stud);
		sf.close();
		
		System.out.println("Succesful......");
	}

}
