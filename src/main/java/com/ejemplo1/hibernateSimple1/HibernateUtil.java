package com.ejemplo1.hibernateSimple1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = construirSessionFactory();

	private static SessionFactory construirSessionFactory() {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		try {
			System.out.println("try ");
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {	}
		return sf;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
