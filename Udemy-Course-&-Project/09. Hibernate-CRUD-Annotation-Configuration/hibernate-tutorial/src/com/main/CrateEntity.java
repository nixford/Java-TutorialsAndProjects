package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class CrateEntity {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		
		try {		
			// create student object
			Student student = new Student("Tom", "Jerry", "tom@java.com");
			
			// start transaction
			session.beginTransaction();
			
			// save the student object
			session.save(student);			
			
			// commit transaction
			session.getTransaction();
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
