package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	student s=new student();
	s.setStuId(102);
	s.setName("rose");
	s.setMarks(95.00);
	s.setPhno(7654479787L);
	et.begin();
	em.persist(s);
	et.commit();
	}

}
