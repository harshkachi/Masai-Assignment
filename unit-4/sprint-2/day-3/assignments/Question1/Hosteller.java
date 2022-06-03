package com.Question1;

public class Hosteller extends Student{

	double hostelFee;

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	@Override
	public double payFee(double x) {
		
		double paidFee = this.hostelFee - x;
		
		return paidFee;
	}
	
	@Override
	public void displayDetails() {
		
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Id : "+this.studId);
		
	}
}
