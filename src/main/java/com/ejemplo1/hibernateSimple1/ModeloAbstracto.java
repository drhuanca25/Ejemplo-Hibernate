package com.ejemplo1.hibernateSimple1;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class ModeloAbstracto<T> {
	private Class<T>entidad;
	protected SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public ModeloAbstracto(Class<T> entidad) {
		super();
		this.entidad = entidad;
	}
	
	public T obtener(Object id) {
		T resultado = null;
		Session sesion = null;
		Transaction tx= null;
		try {
			sesion = sf.openSession();
			tx = sesion.beginTransaction();
			resultado =(T)sesion.get(entidad, (Serializable)id);
			tx.commit();
			System.out.println("Exito");  
		}catch(Exception e) {
			if(tx!=null)
				tx.rollback();
		}
		finally {
			sesion.close();
		}
		return resultado;
	}
	
	public boolean crear(T entidad) {
		System.out.println("Crear");  
		boolean resultado = true;
		Session sesion = null;
		Transaction tx= null;
		
		System.out.println("sesion1 :"+sesion);
		try {
			sesion = sf.openSession();
			System.out.println("sesion2 :"+sesion);
			tx = sesion.beginTransaction();
			sesion.save(entidad);
			tx.commit();
			System.out.println("Exito");  
		}catch(Exception e) {
			System.out.println("dentro del catch");
			e.printStackTrace();
			//if(tx!=null)
				tx.rollback();
		}
		finally {
			sesion.close();
		}
		return resultado;
	}
	
	public List<T> obtenerTotal() {
		List <T> resultado = null;
		Session sesion = null;
		Transaction tx= null;
		try {
			sesion = sf.openSession();
			tx = sesion.beginTransaction();
			resultado =sesion.createQuery("FROM "+entidad.getName()).list();
			tx.commit();
			System.out.println("Exito");  
		}catch(Exception e) {
			if(tx!=null)
				tx.rollback();
		}
		finally {
			sesion.close();
		}
		return resultado;
	}
}
