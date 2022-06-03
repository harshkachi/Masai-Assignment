package com.Question3;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank)
	{
		
		
		// 1st
		if(bank.equalsIgnoreCase("axis")) {
			Scanner scn = new Scanner(System.in);
			AxisBank a1 = new AxisBank();
			
			System.out.println("----------------- Axis Bank Deatils ---------------------");
			
			System.out.println("Enter Branch Name : ");
			String nam = scn.nextLine();
			a1.setBranchName(nam);
			
			
			System.out.println("Enter IFSC code :");
			String code = scn.next();
			a1.setIfscCode(code);
			
			System.out.println("Enter Rate Of Interest :");
			double inte = scn.nextDouble();
			a1.setRateOfInterest(inte);
		
			
			
			scn.close();
			return a1;
			
		}
		
		//2nd
		else if(bank.equalsIgnoreCase("icici")) {
			Scanner scn = new Scanner(System.in);
			ICICIBank i1 = new ICICIBank();
			
			System.out.println("----------------- ICICI Bank Deatils ---------------------");
			
			System.out.println("Enter Branch Name : ");
			String nam = scn.nextLine();
			i1.setBranchName(nam);
			
			
			System.out.println("Enter IFSC code :");
			String code = scn.next();
			i1.setIfscCode(code);
			
			System.out.println("Enter Rate Of Interest :");
			double inte = scn.nextDouble();
			i1.setRateOfInterest(inte);
			
			
			scn.close();
			
			return i1;
			
		}
		
		else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Bank Name: ");	
		String bnam = scn.next();
		
		Bank ans = Demo.getBank(bnam);
		
		System.out.println("-------xxxxxxxxxxxxxxx-------------");
		
		if( ans instanceof AxisBank) {
			ans.displayDetails();
			((AxisBank) ans).getCreditCard();
		}
		else if( ans instanceof ICICIBank) {
			ans.displayDetails();
		}
		else {
			System.out.println("Invalid Bank");
		}
		
		scn.close();
		
		
		
		
	}

}
