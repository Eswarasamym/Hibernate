package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Engine e1=em.find(Engine.class,102);
		Car c1=em.find(Car.class,2);
		
		et.begin();
		em.remove(e1);
		em.remove(c1);
		et.commit();

	}


}
