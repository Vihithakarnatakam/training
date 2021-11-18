package com.ibm.CurrencyExchange;
public class CurrencyConvertor 
{

	public double convert(double amount, Currency source_currency, Currency target_currency)
	{
		double rate = target_currency.dollarValue() / source_currency.dollarValue();
		return rate * amount;
		
		
	}

}