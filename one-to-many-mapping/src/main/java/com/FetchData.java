package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select sh from shop sh");
		List<shop> list=query.getResultList();
		for(shop s:list) {
			System.out.println(s.getsId()+" "+s.getSname()+" "+s.getAddress());
			List<product> products=s.getProducts();
			
			for(product p:products) {
				System.out.println(p.getpId()+" "+p.getPname()+" "+p.getPprice());
				
			}
		}
		

	}

}
