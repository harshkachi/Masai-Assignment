package com.Question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Username :");
		String user = scn.next();
		
		
			
			//1st
			if((Pattern.matches("[a-zA-Z]{3,8}",user))){
				
				System.out.println("Enter Password :");
				String pass = scn.next();
				
				//2nd
				if((Pattern.matches("[a-zA-Z0-9]{3,8}",pass))) {
					
					
					System.out.println("Enter Mobile Number :");
					String no = scn.next();
					
					//3rd
					if((Pattern.matches("[6789]{1}[0-9]{9}", no))){
						
						System.out.println("Enter Email-Id :");
						String email = scn.next();
						
						//4th
						if(email.matches("[a-z0-9]+@[a-z]+.[a-z]{2,3}")) {
							
							Customer c1 = new Customer(user, pass, no, email);
							
							System.out.println("-------------xxxxxxxxxxxxxxxxxxxxxxxxx----------------");
							
							System.out.println("Customer Detail");
							
							System.out.println("Username : "+ c1.getUsername());
							System.out.println("Password : "+ c1.getPassword());
							System.out.println("Mobile no. : " + c1.getMobileNumber());
							System.out.println("Email-Id : " + c1.getEmail());
							
						}
						//4th
						else {
							System.out.println("Enter Valid Email-ID");
							System.out.println("Please Enter Correct Input");
							System.out.println("---------------End---------------");
						}
							
					}
					//3rd
					else {
						System.out.println("Enter Valid Mobile No.");
						System.out.println("Please Enter Correct Input");
						System.out.println("---------------End---------------");
					}
					
				}
				//2nd
				else {
					System.out.println("Enter Valid Password");
					System.out.println("Please Enter Correct Input");
					System.out.println("---------------End---------------");
				}
				
			}
			//1st
			else{
				System.out.println("Enter Vaild Username");
				System.out.println("Please Enter Correct Input");
				System.out.println("---------------End---------------");
			}

		
		scn.close();
		
	}

}
