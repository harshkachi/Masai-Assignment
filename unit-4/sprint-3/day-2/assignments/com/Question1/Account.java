package com.Question1;

public class Account {

	int accountNumber;
	int balance;
	
	public Account(int accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

	public void deposit(int amount) {
		
		balance += amount;
		
	}
	
	public double withdraw(int amount) throws InsufficientFundsException  {
		
		if(balance > amount) {
			int with = balance - amount;
			
			balance = with;
			
			return with;
		}
		
		else {
			InsufficientFundsException e1 = new InsufficientFundsException();
			
			throw e1;
		}
		
	}

}
