package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Order;

public class client {
	public static void main(String[] args) {
		
		Order o1=new Order();
		o1.setOid(202);
		o1.setDate("30-3-2017");
		o1.setProducts("Laptop");
		o1.setAmount(27000);
		//transient state
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(o1);
		//persistent state
		
		Transaction tx=s.beginTransaction();
		tx.commit();
		//database state
		
		s.evict(o1);
		//detached state
		//gc can collect the object
		
		sf.close();
		//close the SessionFactory
		
	}

}
