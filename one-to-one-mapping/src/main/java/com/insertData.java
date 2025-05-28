package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Engine e1=new Engine();
		e1.setEngId(102);
		e1.setType("Descel");
		e1.setCc(1500);
		
		Car c1=new Car();
		c1.setCarid(2);
		c1.setBrand("tata");
		c1.setCost(19.0);
		c1.setEng(e1);
		
		et.begin();
		em.persist(e1);
		em.persist(c1);
		et.commit();
	}


}
