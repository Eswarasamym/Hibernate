package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		Car c1 = em.find(Car.class, 1);
		System.out.println(c1.getBrand());
		System.out.println(c1.getCost());
		
		Engine e1 = c1.getEng();
		System.out.println(e1.getEngId());
		System.out.println(e1.getType());
		System.out.println(e1.getCc());

	}

}