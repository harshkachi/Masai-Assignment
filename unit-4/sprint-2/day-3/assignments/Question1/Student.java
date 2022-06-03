package com.Question1;

public class Student {
	
	int studId;
	String studName;
	double examFee;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void displayDetails() {
		
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Id : "+this.studId);
		System.out.println("Exam Fee : "+this.examFee);
		
	}
	
	
	
	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getStudName() {
		return studName;
	}



	public void setStudName(String studName) {
		this.studName = studName;
	}



	public double getExamFee() {
		return examFee;
	}



	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}



	public double payFee(double x) {
		
		return x;
	}

}
