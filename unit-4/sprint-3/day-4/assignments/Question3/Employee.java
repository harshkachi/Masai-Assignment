package com.Question3;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void detail(){
		
		System.out.println("Emp ID : "+getEmpId());
		System.out.println("Emp Name : "+getEmpName());
		System.out.println("Emp Salary : "+getSalary());
		
		System.out.println("============================================");
		
	}
	
}
