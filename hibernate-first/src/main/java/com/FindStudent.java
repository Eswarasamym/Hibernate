package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		student st=em.find(student.class, 101);
		System.out.println(st.getName());
		System.out.println(st.getMarks());
		System.out.println(st.getPhno());
	}

}
