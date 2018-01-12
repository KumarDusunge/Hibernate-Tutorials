package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Course;
import beans.Faculty;

public class Client {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("Java");
		c1.setFee(2500);
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname(".Net");
		c2.setFee(2500);
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("C#");
		c3.setFee(2500);
		
		Set<Course> cset1 = new HashSet<Course>();
		cset1.add(c1);
		cset1.add(c2);
		
		Set<Course> cset2 = new HashSet<Course>();
		cset2.add(c2);
		cset2.add(c3);
		
		Faculty f1 = new Faculty();
		f1.setFid(1);
		f1.setFname("Soft");
		f1.setCourse(cset1);
		
		Faculty f2 = new Faculty();
		f2.setFid(2);
		f2.setFname("Lang");
		f2.setCourse(cset2);
		
		Faculty f3 = new Faculty();
		f3.setFid(3);
		f3.setFname("Prog");
		f3.setCourse(cset1);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(f1);
		s.save(f2);
		s.save(f3);
		
		s.beginTransaction().commit();
		s.clear();
		s.close();
		sf.close();
	}
}
