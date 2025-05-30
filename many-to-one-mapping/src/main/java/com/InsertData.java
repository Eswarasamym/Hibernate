package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b1=new Bank();
		b1.setbId(2);
		b1.setBname("hdfc");
		b1.setBranch("chennai");
		
		Account a1=new Account();
		a1.setaId(201);
		a1.setAname("pruma");
		a1.setaNum(3468653237876L);
		a1.setBalance(3000.0);
		
		Account a2=new Account();
		a2.setaId(202);
		a2.setAname("yuvasri");
		a2.setaNum(34686532368966L);
		a2.setBalance(3600.0);
		
		Account a3=new Account();
		a3.setaId(203);
		a3.setAname("kavi");
		a3.setaNum(3468653289453L);
		a3.setBalance(35.0);
		
		a1.setBank(b1);
		a2.setBank(b1);
		a3.setBank(b1);
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(b1);
		et.commit();
		
		
	}

}
