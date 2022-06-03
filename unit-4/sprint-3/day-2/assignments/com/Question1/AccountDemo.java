package com.Question1;

public class AccountDemo {
	
	
	public static void main(String[] args) {
		
		Account a1 = new Account(123456, 1000);
		
		// Add the amount
		a1.deposit(1000);

		//System.out.println(a1.balance);
		
		
		try {
			a1.withdraw(200);
			a1.withdraw(500);
			a1.withdraw(2500);
			
			System.out.println("Blance After Withdrawl is : " + a1.balance+" Rs.");
			
		} 
		
		catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			InsufficientFundsException i1 = new InsufficientFundsException();
			
			i1.InsufficientFundException();
		}
		
		
		
	}

}
