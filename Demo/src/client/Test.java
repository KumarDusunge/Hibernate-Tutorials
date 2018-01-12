package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Department;
import beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("kumar");
		e1.setSalary(30000.50);
		e1.setDid(2);
		
		Department d1=new Department();
		d1.setDid(1);
		d1.setDname("it");
		d1.setEid(101);
		
		//transient state
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(e1);
		s.save(d1);
		
		//persistent state
		
		Transaction tx=s.beginTransaction();
		tx.commit();
		
		//database state
		
		s.evict(e1);
		s.evict(d1);
		
		//detached state
		//gc can collect the object
		
		sf.close();
		//close the SessionFactory
		
	}
	
}
