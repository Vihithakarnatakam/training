package com.ibm.Person;
public class Passport extends person {
	
    private int passno;
    private String country;

	public Passport() {
		
	}

	public Passport(String name, int age,int passno,String country) {
		super(name, age);
		this.passno=passno;
		this.country=country;
	}
	
	public void print()
	{
		super.print();
		System.out.println("passport number: "+passno);
		System.out.println("passport country: "+country);
	}
	

}
