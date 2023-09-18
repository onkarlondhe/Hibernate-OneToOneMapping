package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();  
		
		Employee emp = new Employee(1, "Sham", 60000, new Address("Solapur", "Maharastra", 413410));
		System.out.println(emp);
		
		 
		
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(emp);
		 
		
		t.commit();
		s.close();
		
		
	}

}
       