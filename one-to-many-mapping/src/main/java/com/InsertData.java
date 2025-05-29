package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		shop s=new shop();
		s.setsId(2);
		s.setSname("xyz mart");
		s.setAddress("mumbai");
		
		product p1=new product();
		p1.setpId(201);
		p1.setPname("fruit");
		p1.setPprice(120.0);
		
		product p2=new product();
		p2.setpId(202);
		p2.setPname("ice-cream");
		p2.setPprice(140.0);
		
		product p3=new product();
		p3.setpId(203);
		p3.setPname("chips");
		p3.setPprice(120.0);
		
		List<product> list=new ArrayList<product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		s.setProducts(list);
		
		et.begin();
		em.persist(s);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
		

	}

}
