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
		
		Bank b2 = em.find(Bank.class, 1);
		b2.setBranch("kk nagar");
		
		Account c2 = em.find(Account.class, 101);
		c2.setBalance(5000.0);
		
		
		c2.setBank(b2);
		
		et.begin();
		
		em.merge(c2);
		
		et.commit();
	}

}
