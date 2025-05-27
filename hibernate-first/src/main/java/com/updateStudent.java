package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		student st=em.find(student.class,102);
		st.setName("eswar");
		st.setMarks(96.00);
		
		et.begin();
		em.merge(st);
		et.commit();

	}

}
