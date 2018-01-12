package client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import beans.Student;

public class SelectMultipulColumn {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		Projection p = Projections.property("name");
		Projection p1 = Projections.property("email");
		
		ProjectionList pl = Projections.projectionList();
		pl.add(p);
		pl.add(p1);
		
		c.setProjection(pl);
		
		List<Object> l = c.list();
		for(Object st:l)
		{
			Object stud[] = (Object[])st;
			System.out.println("=================");
			System.out.println("Student Name = " +stud[0]);
			System.out.println("Student Email = "+stud[1]);
			
		}
		
		s.beginTransaction().commit();
		
	}

}
