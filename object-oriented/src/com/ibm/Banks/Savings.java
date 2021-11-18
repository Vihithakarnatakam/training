package com.ibm.Banks;

public class Savings extends Accounts {
public Savings() {
	
}

public Savings(String holder) {
	super(holder,1000);
	
}
@Override
public void withdraw(double amount) throws BalanceException {
if(amount <= getBalance() - 1000)
{
	//s.getBalance() = balance+amount;
}
else 
{
	System.out.println("insufficient balance");
}



}

}
