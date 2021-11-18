package com.ibm.Banks;

public interface Bank implements throwable  {

	 int INIT_ACCOUNT_NO = 12345;
	double  MIN_SAVING_BALANCE=1000;
	 double INIT_CURRENT_NO=2000;
	 double MIN_CURRENT_BALANCE=0;
	 double OVERDRAFT_LIMIT=10000;
	
	
	void summery();
	void deposite(double amount);
	void withdraw(double amount) throws BalanceException ;
	double getBalance();
}
