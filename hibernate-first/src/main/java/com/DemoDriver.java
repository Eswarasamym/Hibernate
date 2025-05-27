package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoDriver {
	public static void main(String[] args) {
		/*3 steps/objects we need to create 
		 *all three interfaces present in java.persistence pkg
		 *EntityManagerFactory
		 *EntityManager
		 *EntityTransaction
		  */
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		// whatever changes is done save in the database so we use commit 
		et.commit();
		System.out.println("Data base created");
		
	}

}
