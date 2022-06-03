package com.Question2;

import java.util.Scanner;

public class Main {
	
	public static Hosteller getHostellerDetails() {
		
		
		//1st
		Scanner scn =new Scanner(System.in);	
		
		System.out.println("Student name :");
		String name = scn.next();
		
		System.out.println("Student Id :");
		int studentId = scn.nextInt();
		
		System.out.println("Department Id :");
		int departmentId = scn.nextInt();
		
		System.out.println("Gender :");
		String gender = scn.next();
		
		System.out.println("Phone Number :");
		String phone = scn.next();
		
		System.out.println("Hostel name :");
		String hostelName = scn.next();
		
		System.out.println("Room Number :");
		int roomNumber = scn.nextInt();
		
		
		
		Hosteller host =	new Hosteller(hostelName,roomNumber);
		
		
		host.setStudentId(studentId);
		host.setName(name);
		host.setDepartmentId(departmentId);
		host.setGender(gender);
		host.setPhone(phone);
		host.setHostelName(hostelName);
		host.setRoomNumber(roomNumber);
		
		
		
		
		
		// 2nd
		
		System.out.println("Modify room number(Y/N)");		

		String change1 = scn.next();
		
		if(change1.equals("Y")) {
			
			System.out.println("New room number :");
			
			int roomno = scn.nextInt();	
			
			host.setRoomNumber(roomno);
			
		}
		
		
		System.out.println("Modify phone number(Y/N)");
		
		String change2 = scn.next();
					
		if(change2.equals("Y")) {
		
			System.out.println("New phone number :");
			
			String newphone = scn.next();
			
			host.setPhone(newphone);
			
		}
		
		scn.close();
		
		return host;
		
	}
	
	
	public static void main(String[] args) {
		
		Hosteller h1 =  getHostellerDetails();
		
		System.out.println("-------------xxxxxxxxxxxxxxxxxxxxx--------------------");
		
		System.out.println("Details are: ");
		
		System.out.println("Name : " + h1.getName());
		System.out.println("Id : "+h1.getStudentId());
		System.out.println("Dept. Id : "+h1.getDepartmentId());
		System.out.println("Gender : "+h1.getGender());
		System.out.println("Phne No. : "+h1.getPhone());
		System.out.println("Hostel Name : "+h1.getHostelName());
		System.out.println("Room No. : "+h1.getRoomNumber());
		
	}

}
