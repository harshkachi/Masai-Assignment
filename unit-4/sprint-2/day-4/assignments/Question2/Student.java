package com.Question2;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		super();

	}
	
	public void displayDetails() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Roll no :");
		int roll = scn.nextInt();
		this.roll = roll;
		
		System.out.println("Enter Name");
		String nam = scn.next();
		this.name = nam;
		
		System.out.println("Enter the Marks :");
		int mark = scn.nextInt();
		this.marks = mark;
		
		char grade = calculateGrade();
		this.grade = grade;
		
		
		//scn.close();
	}
	
	public char calculateGrade() {
		
		if(this.marks >= 500) {
			return 'A';
		}
		
		else if(this.marks < 500 && this.marks >= 400) {
			return 'B';
		}
		else
			return 'C';
		
	}
	
	@Override
	public String toString() {
		
		return "Roll no : " + roll +" "+  "Name is : "+name+" "  + "Marks is : "+marks+" " +  "Grade is : "+grade;
		
		
	}

}
