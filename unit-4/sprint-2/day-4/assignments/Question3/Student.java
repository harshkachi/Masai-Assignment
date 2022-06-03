package com.Question3;

public abstract class Student {
	
	String name;
	String address;
	
	
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public abstract void getPercentage();

	public static void getTotalNoStudents() {
		
		int totalNoStudents = ScienceStudent.noOfStudents + HistoryStudent.noOfStudents;
		
		System.out.println("Total no. of Students is : " + totalNoStudents  );
		
	}
}
