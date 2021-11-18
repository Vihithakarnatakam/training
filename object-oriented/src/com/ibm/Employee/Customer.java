package com.ibm.Employee;

public class Customer {
	
	private String custname;
	private int custid;
	private double creditlimit;

	public Customer() {
		
	}

	public Customer(String custname, int custid, double creditlimit) {
		super();
		this.custname = custname;
		this.custid = custid;
		this.creditlimit = creditlimit;
	}
	
	public void display()
	{
		System.out.println("Customer name: " +custname);
		System.out.println("Customer id: " +custid);
		System.out.println("Credit Limit: " +creditlimit);
	}

}
