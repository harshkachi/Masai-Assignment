package com.Question1;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj == new PermanentEmployee()) {
			
			double sal = employeeObj.getSalary();
			
			double loan = sal*0.15;
			
			return loan;
			
		}
		
		else {
			
			double sal = employeeObj.getSalary();
			
			double loan = sal*0.10;
			
			return loan;
		}
		
	
	}
	
}
