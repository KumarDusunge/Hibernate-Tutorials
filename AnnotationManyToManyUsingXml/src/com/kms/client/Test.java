package com.kms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kms.model.Nurse;
import com.kms.model.Patient;

public class Test {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure("com/kms/resources/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Patient patient = new Patient();
		patient.setName("Dk");
		
		Patient patient1 = new Patient();
		patient1.setName("Mrf");
		
		Patient patient2 = new Patient();
		patient2.setName("Shan");
		
		Nurse nurse = new Nurse();
		nurse.setName("SSS");
		
		Nurse nurse1 = new Nurse();
		nurse1.setName("aaa");
		
		Nurse nurse2 = new Nurse();
		nurse2.setName("DDD");
		
		Set<Nurse> nurseList = new HashSet<Nurse>();
		nurseList.add(nurse);
		nurseList.add(nurse1);
		nurseList.add(nurse2);
		
		Set<Nurse> nurseList1 = new HashSet<Nurse>();
		nurseList1.add(nurse);
		nurseList1.add(nurse1);
		
		Set<Nurse> nurseList2 = new HashSet<Nurse>();
		nurseList2.add(nurse);
		nurseList2.add(nurse2);
		
		Set<Patient> patientList = new HashSet<Patient>();
		patientList.add(patient);
		patientList.add(patient1);
		patientList.add(patient2);

		Set<Patient> patientList1 = new HashSet<Patient>();
		patientList1.add(patient);
		patientList1.add(patient1);

		Set<Patient> patientList2 = new HashSet<Patient>();
		patientList2.add(patient);
		patientList2.add(patient2);
		
		session.save(patient);
		session.save(patient1);
		session.save(patient2);
		
		/*session.save(nurse);
		session.save(nurse1);
		session.save(nurse2);*/
		
		session.beginTransaction().commit();		
	}
	
}
