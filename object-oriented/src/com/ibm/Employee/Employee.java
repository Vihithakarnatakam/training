package com.ibm.Employee;

public abstract class Employee {
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String empname ;
	private int empno;
	private double salary;
	
	private static int counter;
	
	static {
		System.out.println("Employee class loaded");
		counter = 101;
	}

	public Employee() {
		
	}

	public Employee(String empname, double salary) {
		
		this.empname = empname;
		this.empno = counter++;
		this.salary = salary;
	}
	

	public void payslip()

{
		System.out.println("Employee name:" +empname);
		System.out.println("Employee number:" +empno);
		System.out.println("Employee salary:" +salary);
		}
	
	public double salary()
	{
		return salary;
	}
}
