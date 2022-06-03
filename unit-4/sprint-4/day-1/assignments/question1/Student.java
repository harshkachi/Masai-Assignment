package com.question1;


public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.roll;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		
		Student s1 = this;
		Student obj1 = (Student) obj;
		
		return s1.roll == obj1.roll;
		
	}

}
