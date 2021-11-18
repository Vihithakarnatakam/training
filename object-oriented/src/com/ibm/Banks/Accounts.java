package com.ibm.Banks;
/**
 * This is detail of bank account
 * @author Vihitha
 *@version 1.0
 */
public abstract class Accounts implements Bank {
	
	

	public Accounts() {
		
	}
	private int accntno;
	private String holder;
	private double balance;
	private static int counter=INIT_ACCOUNT_NO;
	
	

	public Accounts(String holder, double balance) {
		super();
		this.accntno = counter++;
		this.holder = holder;
		this.balance = balance;
	}
	
	/**
	 * This gives summery of account
	 */
	
	public void summery()
	{
		System.out.println("account number"+ accntno);
		System.out.println("account holder"+ holder);
		System.out.println("account balance"+ balance);
		
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public abstract void withdraw(double amount) throws BalanceException;

	public int getAccntno() {
		return accntno;
	}

	public void setAccntno(int accntno) {
		this.accntno = accntno;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
