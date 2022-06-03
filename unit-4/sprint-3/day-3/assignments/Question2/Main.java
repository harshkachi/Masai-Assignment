package Question2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		EmployeeBonus eb = new EmployeeBonus();
		
		System.out.println("Please enter your joining in DD/MM/YYYY");
		String doj = scn.next();
		
		try {
			
			double bonus =  eb.getBonus(doj);
			
			System.out.println("Your Bonus Amount is : " + bonus);
		} 
		catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			scn.close();
		}
		
	}

}
