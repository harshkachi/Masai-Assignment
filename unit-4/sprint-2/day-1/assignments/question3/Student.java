package com.question3;

public class Student {
	
	String name;
	int roll;
	String address;
	String clgName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	
	public Student() {
		super();
	}
	
	
	public void Student(String name, int roll, String address, String clgName) {
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.clgName = clgName;
	}
	
	
	
	public void Student(String name, int roll, String address) {
		this.name = name;
		this.roll = roll;
		this.address = address;
	}
	
	
	public static Student getStudent(boolean isFromNIT) {
		
		Student stud = new Student();
		
		
		
		if(isFromNIT == true) {
			
			// Call C. function 
			stud.clgName = "NIT";
			stud.Student("Harshad", 18, "Pune");
			
			
			// Print ans
			
			System.out.println("Name is: "+stud.getName());
			System.out.println("College name is: "+ stud.getClgName());
			System.out.println("Roll no. is: "+stud.getRoll());
			System.out.println("Address is: "+stud.getAddress());
		}
		
		else {

			stud.Student("Harshad Kachi", 18, "Non-NIT", "Kalyan");
			
			System.out.println("Name is: "+stud.getName());
			System.out.println("College name is: "+ stud.getClgName());
			System.out.println("Roll no. is: "+stud.getRoll());
			System.out.println("Address is: "+stud.getAddress());
			
		}
		
		return stud;
	}
	
	
	
	
	
}
