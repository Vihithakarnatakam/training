package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

@Entity
public class Customer {
	@Id
	@Column(name = "cid")
	private int custId;
	@Column(name = "cname", length =30)
	private String cusName;
	@Column(length=15)
	private String city;
	
	@Test
	public void testGetCustomer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("first-jpa");
		EntityManager mgr = emf.createEntityManager();
		
		Customer c = mgr.find(Customer.class, 1);
		System.out.println(c.getCustName() + "\t" + c.getClass());
		
		mgr.close();
		emf.close();
	}

	private String getCustName() {
		return null;
	}

	

}
