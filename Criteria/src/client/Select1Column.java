package client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import beans.Student;

public class Select1Column {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		Projection p = Projections.property("name");
		c.setProjection(p);
		
		List<String> list = c.list();
		for(String stud:list){
			System.out.println("==========================");
			System.out.println("Student Name = "+stud);
		}
		
		s.beginTransaction().commit();
	}

}
