package client;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import beans.Student;

public class AgregateFunction {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		/*Projection p = Projections.avg("marks");*/
		Projection p = Projections.max("id");
		c.setProjection(p);
		
		/*Double i = (Double)c.uniqueResult();*/
		int i = (int)c.uniqueResult();
		System.out.println(i);
	}

}
