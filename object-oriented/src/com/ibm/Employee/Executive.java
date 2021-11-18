package com.ibm.Employee;

public class Executive extends Employee {
	
	private int incentive;

	public Executive() {
		super();
	}

	public Executive(String empname, double salary, int incentive) {
		super(empname, salary);
		this.incentive= incentive;
		
	}

	@Override
	public void payslip() {
		
		super.payslip();
		System.out.println("Insentive: "+ incentive);
	}
	

}
