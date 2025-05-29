package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		shop b2 = em.find(shop.class, 1);
		b2.setSname("mart");
		
		product p2 = em.find(product.class, 101);
		p2.setPprice(500.0);
		List<product> products = b2.getProducts();
		
		et.begin();
		
		em.merge(p2);
		
		et.commit();
	}

}
