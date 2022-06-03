package com.Question1;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	
	
	
	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(double basicPay, int employeeId, String employeeName) {
		super();
		this.basicPay = basicPay;
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public void calculateSalary(){
		
		double pf = this.basicPay * 0.12;
		
		double salary = this.basicPay - pf;
		
		this.setSalary(salary);
		
	}
	
}
