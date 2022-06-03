package com.Question3;

public class ICICIBank extends Bank {

	double rateOfInterest;
	
	
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	void displayDetails() {
		
		System.out.println("Branch Name:" + branchName);
		System.out.println("IFSC Code:" + ifscCode);
		System.out.println("Rate Of Interest :" + rateOfInterest);
		
	}
	
	
}
