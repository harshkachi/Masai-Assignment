package com.Question1;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.netSalary = netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	
	public void calculateNetSalary(double pfpercentage) {
		
		double percent = pfpercentage / 100;
		
		double cutpf = this.salary*percent;
		
		double finalS = this.salary - cutpf;
		
		setNetSalary(finalS);
		
	}
	
	
	

}
