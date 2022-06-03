package com.Question1;

public class DayScholar extends Student {

	double transportFee;
	
	
	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}



	@Override
	public double payFee(double x) {
		
		double paidFee = this.transportFee - x;
		
		return paidFee;
	}
	
	@Override
	public void displayDetails() {
		
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Id : "+this.studId);
		
	}
	
}
