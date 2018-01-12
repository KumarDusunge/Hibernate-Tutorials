package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Purchess;

public class Client {
	public static void main(String[] args) {
		
		Purchess p1=new Purchess();
		p1.setPid(302);
		p1.setPurchessItem("laptop");
		p1.setDate("29-03-2017");
		p1.setAmount(26500.75);
		//transient state
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfj.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(p1);
		//persistent state
		
		Transaction tx=s.beginTransaction();
		tx.commit();
		//database state
		
		s.evict(p1);
		//detached state
		//gc can collect the object
		
		sf.close();
		//close the SessionFactory
		
	}

}
