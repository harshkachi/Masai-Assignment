package com.Question1;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	
	
	
	public TemporaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TemporaryEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	public TemporaryEmployee(int hoursWorked, int hourlyWages, int employeeId, String employeeName) {
		super();
		
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		
	}
	
	public void calculateSalary() {
		
		double salary = this.hourlyWages * this.hoursWorked;
		
		this.setSalary(salary);
		
	}
	
	
	
}
