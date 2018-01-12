package com.kms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.kms.model.Nurse;
import com.kms.model.Patient;

public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = new Configuration().configure("com/kms/resources/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Nurse nurse = new Nurse();
		nurse.setName("Laura");
		
		Nurse nurse1 = new Nurse();
		nurse1.setName("Kathy");
		
		Nurse nurse2 = new Nurse();
		nurse2.setName("Saira");
		
		
		Patient p = new Patient();
		p.setName("Sadiq");
		

		Patient p1 = new Patient();
		p1.setName("Salman");
		
		Patient p2 = new Patient();
		p2.setName("john");
		
		Set<Patient> patientList = new HashSet<Patient>();
		patientList.add(p);
		patientList.add(p1);
		patientList.add(p2);
		
		Set<Patient> patientList1 = new HashSet<Patient>();
		patientList1.add(p);
		patientList1.add(p1);
		
		Set<Patient> patientList2 = new HashSet<Patient>();
		patientList2.add(p);
		patientList2.add(p2);
		
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
		
		/*nurse.setPatientList(patientList);
		nurse1.setPatientList(patientList1);
		nurse2.setPatientList(patientList2);*/
		
		p.setNurseList(nurseList);
		p1.setNurseList(nurseList1);
		p2.setNurseList(nurseList2);
		
		session.save(p);
		session.save(p1);
		session.save(p2);
		
		session.beginTransaction().commit();
		
	}

}
