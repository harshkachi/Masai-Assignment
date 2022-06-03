package com.Question4;

import java.util.Scanner;

public class Employee {
	
	public static double calculateAverage(int[] age) {
		
		double sum = 0;
		
		for(int i=0; i<age.length; i++) {
			sum += age[i];
		}
		
		double avg = sum / age.length;
		
		return avg;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Total No.of Employees: ");
		int empt = scn.nextInt();
		
		
		if(empt < 2)
			System.out.println("Please enter a valid employee count");
		
		else {
			
			int[] age = new int[empt];
			
			System.out.println("--------------xxxxxxxxxxxxxxxxxxx-----------------");
			
			System.out.println("Enter " + empt + " Employees Age Details");
			
			for(int i = 0; i < empt; i++)
			{
				
				System.out.println(i+1 + ".Employee Age : ");
				int empAge = scn.nextInt();
		
				if(empAge >= 28 && empAge <= 40)
					age[i] = empAge;
				
				else
				{
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println("Invalid Age encountered!");
					return;
				}
			}
			
			
			double averageAge = calculateAverage(age);
			System.out.println("===============Result======================");
			System.out.println("The average age is "+averageAge);
			
		}
		
		
		scn.close();
				
		
	}
	

}
