package com.ibm.Employee;
public class Manager extends Employee {
	
	private int comission;

	public Manager() {
		super();
	}

	public Manager(String empname, double salary, int comission) {
		super(empname, salary);
		this.comission=comission;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payslip() {
		
		super.payslip();
		System.out.println("comission: "+comission);
	}
	
	
	
	

}
