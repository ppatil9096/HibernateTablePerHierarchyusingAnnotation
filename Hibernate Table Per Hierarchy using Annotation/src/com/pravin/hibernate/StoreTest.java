package com.pravin.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreTest {
    public static void main(String[] args) {
	Session session = new AnnotationConfiguration().configure("hibernate.cgf.xml")
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();
	Employee e1 = new Employee();
	e1.setName("pravin");

	Regular_Employee e2 = new Regular_Employee();
	e2.setName("Vijay Chavan");
	e2.setSalary(50000);
	e2.setBonus(5);

	Contract_Employee e3 = new Contract_Employee();
	e3.setName("Arun Gondhali");
	e3.setPay_per_hour(1000);
	e3.setContract_duration("15 hours");

	session.persist(e1);
	session.persist(e2);
	session.persist(e3);

	transaction.commit();
	session.close();
	System.out.println("SUCCESS!");
    }
}
