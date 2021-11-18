package com.ibm.Person;

import java.lang.reflect.Constructor;

public class person {

	private String name;
	private int age;
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof person )
		{
			person p =(person) obj;
			if(this.name == p.name && this.age == p.age)
				return true;
		}
		
		return false;
		
		}
	
	//constructor chaining:calling another constructor on the same object
	public person() {
		this("ankitha",23);
	}
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

public void print()
{
	System.out.println("Name:"+ name + "\tAge:"+ age);
}


	@Override
public String toString() {
	
	return "Name:"+ name + "\tAge:"+ age;
}
		
	
	public static void main(String[] args) {
		
person p1= new person("thanu", 23);
//p1.print();
person p= new person("thanu", 23);

person p2=new person();
//p2.print();

Passport pr = new Passport("manase",736476,3344774,"india");
//pr.print();

System.out.println(p1);
System.out.println(p1.hashCode());
System.out.println(p);
System.out.println(p.hashCode());
System.out.println(p.equals(p1));



	}

	
	

}
