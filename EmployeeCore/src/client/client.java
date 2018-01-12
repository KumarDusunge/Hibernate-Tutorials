package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class client {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Shanur");
		e1.setAddr("Pune");
		e1.setSalary(30000);
		//transient state
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(e1);
		//persistent state
		
		Transaction tx=s.beginTransaction();
		tx.commit();
		//database state
		
		s.evict(e1);
		//detached state
		//gc can collect the object
		
		sf.close();
		//close the SessionFactory
		
	}

}
