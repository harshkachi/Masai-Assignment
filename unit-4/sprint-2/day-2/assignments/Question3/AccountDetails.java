package com.Question3;

import java.util.Scanner;

public class AccountDetails {
	
	public static void main(String[] args) {
		
		AccountDetails faccount = new AccountDetails();
		
		faccount.getAccountDetails();
	}
	
	public Account getAccountDetails() {
		
		Account acc = new Account();
		
		Scanner scn = new Scanner(System.in);
		
		//1
		System.out.println("Enter Account Type :");
		String atype = scn.next();
		acc.setAccountType(atype);
		
		//2
		System.out.println("Enter account id :");
		int id = scn.nextInt();
		acc.setAccountId(id);
		
		//3
		System.out.println("Enter Balance :");
		int bal = scn.nextInt();
		
		while(bal<=0) {
			
			System.out.println("Please Enter the amount greater than zero");
			System.out.println("Enter Balance :");
			bal = scn.nextInt();
			
		}
		
		acc.setBalance(bal);
		
		//4
		
		int tp = getWithdrawAmount();
		acc.withdraw(tp);
		
		scn.close();
		
		return acc;
	}
	
	public int getWithdrawAmount(){
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("Enter amount to be withdrawn :");
		int withd = scn1.nextInt();
		
		if(withd<0) {
			while(withd<0) {
				System.out.println("Amount should be positive");
				withd = scn1.nextInt();
			}
		}
		scn1.close();
		return withd;
	}
}
