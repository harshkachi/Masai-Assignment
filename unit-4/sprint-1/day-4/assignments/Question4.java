package com.myself;

public class Question4 {
	
	int Roll;
	String name;
	int Marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is :" +" " + Roll);
		System.out.println("Name is :" + " "+ name);
		System.out.println("Mark is :" +" " + Marks);
	}
	
	public static void main(String [] args) {
		
		Question4 Info = new Question4();
		
		Info.Roll = 21;
		Info.name = "Harshad";
		Info.Marks = 96;
		
		Info.displayStudentDetails();
	}
	

}
