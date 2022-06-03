//Q3.Create a java bean class Employee with following fields: empId: integer empName: String salary : double 
//Create a Main class with the main method and do the following things inside the main method: 
//	Create 4 Employee class object by taking details from the user using the Scanner class 
//	Add all 4 Employee object inside the TreeSet class (Employee should be sorted according to the salary) 
//	Print all 4 Employee Details one by one from the TreeSet object



package com.Question3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Employee> tl = new TreeSet<>(new CompEmp());
		
		for(int i=1; i<=4; i++) {
			
			System.out.println(i+". Enter Employee ID");
			int id = sc.nextInt();
			
			System.out.println(i+ ". Enter Employee Name");
			String nam = sc.next();
			
			System.out.println(i+". Enter Salary");
			double sal = sc.nextDouble();
			
			
			tl.add(new Employee(id, nam, sal));
			
			System.out.println("------------------------xxxxxxxxxxxxxxx---------------------------------");
			
		}
		
		//System.out.println(tl);
		
		for(Employee emp:tl) {
			
			//System.out.println("");
			
			emp.detail();
			
		}
		
		
		
		
		sc.close();
	}

}
