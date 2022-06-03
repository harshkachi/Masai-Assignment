package com.Question1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Main ans = new Main();
		 ans.getEmployeeDetails();
	}

	
	public void getEmployeeDetails() {
		
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter ID");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		String name = scan.next();
		System.out.println("Enter salary");
		double salry = scan.nextDouble();
		System.out.println("Enter PF percentage");
		int pf = scan.nextInt();
		
		scan.close();
		
		int x = getPFPercentage(pf);
		
		
		
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setSalary(salry);
		emp.calculateNetSalary(x);
		
		
		
		System.out.println("==================================================");
		
		
		System.out.println("ID : "+emp.getEmployeeId());
		System.out.println("Name : "+emp.getEmployeeName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Net Salary : "+emp.getNetSalary());
		
	}
	
	public int getPFPercentage(int pf) {
		
		return pf;
	}
}
