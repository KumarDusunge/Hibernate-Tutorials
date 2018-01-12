package client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		//Query q = s.createQuery("update Student set id = 3 where id = 1");
		Query q = s.createQuery("delete Student where id = 3");
		
		int i = q.executeUpdate();
		System.out.println(i+" Row's Affected");
		
		s.beginTransaction().commit();
		
	}

}
