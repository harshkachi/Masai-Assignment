package com.Question3;

public class Bank {
	
	String branchName; 
	String ifscCode;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	
	void displayDetails() {
		
		System.out.println("Branch Name:" + branchName);
		System.out.println("IFSC Code:" + ifscCode);
		
	}

}
