package client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class TestStudent {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		List<Student> list = c.list();
		for(Student stud:list){
			System.out.println("==========================");
			System.out.println("Student Id = "+stud.getId());
			System.out.println("Student Name = "+stud.getName());
			System.out.println("Student Email = "+stud.getEmail());
			System.out.println("Student Marks = "+stud.getMarks());
		}
		
		s.beginTransaction().commit();
		
	}

}
