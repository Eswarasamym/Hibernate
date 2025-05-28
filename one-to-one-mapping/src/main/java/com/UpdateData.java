package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Engine e2 = em.find(Engine.class, 101);
		e2.setCc(10);
		
		Car c2 = em.find(Car.class, 1);
		c2.setBrand("audi");
		
		
		c2.setEng(e2);
		
		et.begin();
		
		em.merge(c2);
		
		et.commit();
	}

}