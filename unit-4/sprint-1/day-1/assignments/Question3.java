package com.myself;

// Write a static method that will take a city as a parameter: and implement this method as follows:
//This method should be implemented using switch-case
//Call the above method from the main method by supplying a proper city name.


public class Question3 {
	
	public static void main(String[] args) {
		String city = "Mumbai";
		
		Callcity(city);
	}
	
	
	public static void Callcity(String city) {
		
		switch(city) 
		{
		case "Mumbai" :
			System.out.println("Financial city");
		break;
		
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Delhi":
			System.out.println("Capital of the country");
			break;
		case "Bangalore" :
			System.out.println("Cyber City");
			break;
		default :
			System.out.println("May be Other Indian City");
		}
	}
}
