package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		//hql--->select ref-var from classname ref-var
		//select stu from Student stu
		Query qu=em.createQuery("select stu from student stu");
		List <student> list=qu.getResultList();
		//for(int i=0;i<list.size();i++) {
		//	System.out.println(list.get(i));
		
		for(student s:list) {
			System.out.println(s.getStuId()+" "+s.getName()+" "+s.getMarks()+" "+s.getPhno());
		}
	}

}
