package com.Question4;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Student stud = new Student();
		
		//1st
		System.out.println("Number of students are :");
		int no = scn.nextInt();
		
		// Define object of array
		int[] avgMark = new int[no];
		
		
		for(int i=0; i<no; i++) {
			
			//2nd
			System.out.println("Roll no. : ");
			int roll = scn.nextInt();
			stud.setRoll(roll);
			
			//3rd
			System.out.println("Name : ");
			String nam = scn.next();
			stud.setName(nam);
			
			//4th
			System.out.println("Address : ");
			String add = scn.next();
			stud.setAddress(add);
			
			//5th
			System.out.println("Mark : ");
			int mark = scn.nextInt();
			stud.setMarks(mark);
			
			
			avgMark[i] = mark;
			
			
			System.out.println("==================================");
			
			System.out.println("Roll - "+ stud.getRoll());
			System.out.println("Name - "+stud.getName());
			System.out.println("Address - "+stud.getAddress());
			System.out.println("Mark - "+ stud.getMarks());
			
			System.out.println("<<<<<<<------------>>>>>>>");
			
			
		}
		
		scn.close();
		
		
		System.out.println("................................................................");
		
		int sum =0;
		
		for(int i=0; i<avgMark.length; i++) {
			sum = sum + avgMark[i];
		}
		
		int avg = sum/avgMark.length;
				
		System.out.println("Average : "+ avg);
		
	}

}


