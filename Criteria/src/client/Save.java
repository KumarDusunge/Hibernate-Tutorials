package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Save {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Student s1 = new Student(1,"Kumar","dk@gmail.com",500);
		Student s2 = new Student(2,"Mukteshwar","mrf@gmail.com",550);
		Student s3 = new Student(3,"Shanur","shan@gmail.com",600);
		
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
		s.beginTransaction().commit();
		s.evict(s1);
		s.evict(s2);
		s.evict(s3);
		
		sf.close();
		
	}
}
