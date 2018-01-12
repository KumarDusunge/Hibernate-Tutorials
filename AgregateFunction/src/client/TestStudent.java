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
		
		/*Query q = s.createQuery("select count(name) from Student");*/
		/*Query q = s.createQuery("select max(id) from Student");*/
		Query q = s.createQuery("select avg(marks) from Student");
		
		Object ob = q.uniqueResult();
		System.out.println("no. of Name = "+ob);
		
		s.beginTransaction().commit();
		
	}

}
