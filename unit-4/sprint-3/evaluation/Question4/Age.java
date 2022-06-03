package com.Question4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your Date of Birth");
		
		String date = scn.next();
		
		try {
			
			DateTimeFormatter change = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
						
			LocalDate last = LocalDate.parse(date, change);
			
			LocalDate current = LocalDate.now();
			
			
			Period diff = Period.between(last,current);
			
			//System.out.println(last);
			
			if(current.getYear() < last.getYear())
			{
				System.out.println("Date of birth should not be in future");
			}
			
			else if(diff.getYears() == 0){
				System.out.println("Please enter Date of bith in valid pattern");
			}
			
			else if(diff.getYears() >= 18) {
				if(last.getDayOfMonth()==current.getDayOfMonth() && last.getMonth().equals(current.getMonth()))
				{
					System.out.println("Happy Birthday, You are eligible to cast your vote");
				}	
				else
					//System.out.println(current);
					System.out.println("You are eligible to cast your vote");
			}
				
			else
			System.out.println("please pass the date in the proper format");
			
			
			scn.close();
		}
		
		catch (Exception e) {
			System.out.println("Please enter Date of bith in valid pattern");
		}
		
	}

}
