package client;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import beans.Student;

public class Select1Row {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		SimpleExpression cr =  Restrictions.lt("id", 3);
		SimpleExpression cr1 =  Restrictions.eq("name", "Kumar");
		
		c.add(cr);
		c.add(cr1);
		
		Student stud = (Student) c.uniqueResult();
			System.out.println("==========================");
			System.out.println("Student Id = "+stud.getId());
			System.out.println("Student Name = "+stud.getName());
			System.out.println("Student Email = "+stud.getEmail());
			System.out.println("Student Marks = "+stud.getMarks());
		
		s.beginTransaction().commit();
		
	}

}
