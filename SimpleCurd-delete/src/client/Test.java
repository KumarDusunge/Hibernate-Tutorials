package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setId(2);
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
				
		s.delete(stud);
		
		s.beginTransaction().commit();
		s.evict(stud);
	}

}
