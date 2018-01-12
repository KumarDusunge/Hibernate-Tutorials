package client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Stud;
import beans.Student;

public class TestStud {
	public static void main(String[] args) {
		
		Stud stud = new Stud();
		stud.setId(1);
		stud.setName("dk");
		stud.setEmail("dk@gmail.com");
		stud.setMarks(500);
		
		Stud student = new Stud();
		student.setId(2);
		student.setName("Dk");
		student.setEmail("dk@gmail.com");
		student.setMarks(550);
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		s.save(stud);
		s.save(student);
		
		s.beginTransaction().commit();
		s.evict(stud);
		s.evict(student);
		
		sf.close();
	}

}
