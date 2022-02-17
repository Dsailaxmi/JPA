package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainLogic {

	public static void main(String[] args) {

		Student s=new Student();
		s.setSid(1);
		s.setSname("laxmi");
		s.setTechnology("python");
		//search 
//		Student s=em.find(Student.class,1);
//		System.out.println(s);
		
		//createing two objects EntityManagerFactory,EntityManager
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sai"); // persistence-unit name
		EntityManager em= emf.createEntityManager();

		em.getTransaction().begin();//before saving to start the transaction
		em.persist(s);//to save 
		System.out.println(s);

		em.getTransaction().commit();



	}

}