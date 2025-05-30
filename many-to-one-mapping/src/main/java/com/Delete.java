package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Bank b2 = em.find(Bank.class, 2);
			
			
			Account c2 = em.find(Account.class, 103);
			et.begin();
			em.remove(c2);
		   
			et.commit();
	}

}
