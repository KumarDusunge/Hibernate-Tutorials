package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setId(1);
		stud.setName("Dk");
		stud.setEmail("dk@gmail.com");
		stud.setMarks(550);
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		System.out.println("After open session");
		s.save(stud);
		
		System.out.println("After save");
		s.beginTransaction().commit();
		
		System.out.println("After commit");
		s.evict(stud);
		
		System.out.println("After evict");
	}

}
