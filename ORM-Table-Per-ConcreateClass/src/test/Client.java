package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;
import beans.HardwarEmployee;
import beans.SoftwarEmployee;
import beans.admin;

public class Client {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		SoftwarEmployee e = new SoftwarEmployee(1, "Dk", "dk@gmail.com", 6000, "Soft");
		
		HardwarEmployee e1 = new HardwarEmployee(2, "Mrf", "mrf@gmail.com", 5500, 8);
		admin e2 = new admin(3, "Shan", "shan@gmail.com", 30000, "HR");
		
		s.save(e);
		s.save(e1);
		s.save(e2);
		
		s.beginTransaction().commit();
		s.clear();
		s.close();
		sf.close();
	}
}
