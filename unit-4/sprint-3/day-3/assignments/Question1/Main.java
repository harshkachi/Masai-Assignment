

















// Wrong......................................................

















package Question1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
public static long getAge(String date) throws InvalidDateFormat {
		
		long year = 0;
		
		try {
			
			LocalDate dob = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			LocalDate cdate = LocalDate.now();
			
			if(dob.isAfter(cdate)) {
				System.out.println("Date should not be in Future");
			}
			
			else {
				
				 year = ChronoUnit.YEARS.between(dob, cdate);
				
				
			}
			
		} 
		
		catch (Exception e) {
			throw new InvalidDateFormat("Please enter your birth of date in dd-mm-yyyy format");
		}

		return year;
		
	}


	// Main method

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		try {
			
			System.out.println(("Enter your Date of Birth in dd-MM-yyyy pattern"));
			String dob = scn.next();
			
			long ans = Main.getAge(dob);
			
			
			System.out.println("Your age : " + ans);
		} 
		
		
		catch (InvalidDateFormat e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			scn.close();
		}
		
		
	}






}



