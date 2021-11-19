package com.ibm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.ibm.entity.Passport;
import com.ibm.entity.Person;


public class TestPeople {
	@Test
	public void testSavePerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		txn.begin();
		Person p1 = new Person();
		p1.setName("sweety");
		p1.setAge(24);
		
		mgr.persist(p1);
		txn.commit();
		
		mgr.close();
		emf.close();
	}
	
	@Test
	public void testGetPerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		Person p = mgr.find(Person.class, 4);
		System.out.println(p.getName() + "\t" +p.getAge());
		
		mgr.close();
		emf.close();
	}
	
	@Test
	public void testSavePassport() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction(); //commit or role back
		
		txn.begin();
		Passport pp = new Passport();
		pp.setPassportNo(123123879);
		pp.setCountry("India");
		
		Person p = mgr.find(Person.class, 2);
		pp.setCitizen(p);
		
		mgr.persist(pp); //CRUD operation 
		txn.commit(); //save
		
		mgr.close();//closing manager
		emf.close();//closing factory
		
	}
	
	@Test
	public void testGetPassport() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		
		Passport p = mgr.find(Passport.class, 123123123);
		System.out.println(p.getCitizen() + "\t" + p.getPassportNo()  + "\t" + p.getCountry());
		
		mgr.close();//closing manager
		emf.close();//closing factory
	}

}
