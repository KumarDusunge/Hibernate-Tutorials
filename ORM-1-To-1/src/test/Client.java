package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Vote;
import beans.Voter;

public class Client {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Voter v = new Voter();
		v.setVid(1);
		v.setVname("Dk");
		v.setVage(21);
		
		Vote vt = new Vote();
		vt.setPname("kms");
		vt.setCdate(new Date());
		vt.setVoter(v);
		
		s.save(v);
		s.save(vt);
		
		s.beginTransaction().commit();
		s.clear();
		s.close();
		sf.close();
	}
}
