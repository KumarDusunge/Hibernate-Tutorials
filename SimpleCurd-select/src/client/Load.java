package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Load {
public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setId(1);
		stud.setName("kumar");
		stud.setEmail("dk@gmail.com");
		stud.setMarks(550);
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Object o = s.load(Student.class, 1);
		
		Student student = (Student)o;
		System.out.println("Student Id = "+student.getId());
		System.out.println("Student Name = "+student.getName());
		System.out.println("Student Email = "+student.getEmail());
		System.out.println("Student Mark = "+student.getMarks());
	}


}
