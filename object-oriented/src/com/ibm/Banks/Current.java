package com.ibm.Banks;

public class Current extends Accounts {
	private double overdraft;

	public Current() {
		super();
		
	}

	public Current(String holder) {
		super(holder,1000);
		
		overdraft=10000;
	}

	@Override
	public void summery() {
		
		super.summery();
		System.out.println("Overdraft : "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft = overdraft + amount;
		
		if(overdraft<10000)
			//balance = balance + overdraft-10000;
		//else
			setBalance(getBalance() + amount);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		
	
	
	}
}
