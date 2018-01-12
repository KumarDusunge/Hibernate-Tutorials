package client;

import java.util.List;

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
		
		/*Query q = s.createQuery("select name from Student where id = 1");
		
		Object ob = q.uniqueResult();
		System.out.println("Student Name = "+ob);*/
		
		/*Query q = s.createQuery("from Student where id = 1");
		
		Student stud = (Student)q.uniqueResult();
		System.out.println("Student Id = "+stud.getId());
		System.out.println("Student Name = "+stud.getName());
		System.out.println("Student Email = "+stud.getEmail());
		System.out.println("Student Marks = "+stud.getMarks());
		*/
		
		Query q = s.createQuery("select name,email from Student");
		
		List<Object> l = q.list();
		for(Object st:l)
		{
			Object stud[] = (Object[])st;
			System.out.println("=================");
			System.out.println("Student Id = " +stud[0]);
			System.out.println("Student Name = "+stud[1]);
			
		}
		
		/*Query q = s.createQuery("from Student");
		
		List<Object> l = q.list();
		for(Object ob:l)
		{
			Student stud = (Student)ob;
			System.out.println("=================");
			System.out.println("Student Id = " +stud.getId());
			System.out.println("Student Name = "+stud.getName());
			System.out.println("Student Email = "+stud.getEmail());
			System.out.println("Student Marks = "+stud.getMarks());
			
		}*/
		
		s.beginTransaction().commit();
		
	}

}
