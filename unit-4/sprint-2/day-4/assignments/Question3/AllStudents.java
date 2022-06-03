package com.Question3;

import java.util.Scanner;

public class AllStudents {
	
	
	
	public static void main(String[] args) {
	
		int counts = 0;
		//int counth = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Science Student");
		
		System.out.println("1.Science Student");
		
		System.out.println("Enter name : ");
		String name = scn.nextLine();
		
		System.out.println("Enter Address : ");
		String address = scn.nextLine();
		
		System.out.println("Enter physics marks : ");
		int physics = scn.nextInt();
		
		System.out.println("Enter chemistry marks : ");
		int chem = scn.nextInt();
		
		System.out.println("Enter Maths marks : ");
		int maths = scn.nextInt();
		
		ScienceStudent.noOfStudents++;
		
		ScienceStudent fsci =  new ScienceStudent(name,address,physics,chem,maths);
		
		System.out.println("-------------------------------------------");
		
		
//		System.out.println("2.Science Student");
//		
//		System.out.println("Enter name : ");
//		name = scn.nextLine();
//		
//		System.out.println("Enter Address : ");
//		address = scn.nextLine();
//		
//		System.out.println("Enter physics marks : ");
//		physics = scn.nextInt();
//		
//		System.out.println("Enter chemistry marks : ");
//		chem = scn.nextInt();
//		
//		System.out.println("Enter Maths marks : ");
//		maths = scn.nextInt();
//		
//		ScienceStudent.noOfStudents++;
//		
//		ScienceStudent ssci =  new ScienceStudent(name,address,physics,chem,maths);
		
		
		System.out.println("============ Science student percentage =============");
		fsci.getPercentage();
		//ssci.getPercentage();
		
		Student.getTotalNoStudents();
		System.out.println("Total Science tudents are : " + counts);
		
		
		System.out.println("xxxxxxxxxxxxx---------------------xxxxxxxxxxxxxxxxxxxxx");
		
		
		
		System.out.println("History Student.....................");
		
		System.out.println("1. History Student");
		
		System.out.println("Enter name : ");
		name = scn.nextLine();
		
		System.out.println("Enter Address : ");
		address = scn.nextLine();
		
		System.out.println("Enter history marks : ");
		int historyMarks = scn.nextInt();
		
		System.out.println("Enter civics marks : ");
		int civicsMarks = scn.nextInt();
		
		HistoryStudent.noOfStudents++;
		
		HistoryStudent fhis =  new HistoryStudent(name,address,historyMarks, civicsMarks);
		
		
		System.out.println("-------------------------------------------");
		
		System.out.println("2. History Student");
		
	
		System.out.println("Enter name : ");
		name = scn.nextLine();
		
		System.out.println("Enter Address : ");
		address = scn.nextLine();
		
		System.out.println("Enter history marks : ");
		historyMarks = scn.nextInt();
		
		System.out.println("Enter civics marks : ");
		civicsMarks = scn.nextInt();
		
		HistoryStudent.noOfStudents++;
		
		HistoryStudent shis =  new HistoryStudent(name,address,historyMarks, civicsMarks);
		
		System.out.println("============ History student percentage =============");
		
		fhis.getPercentage();
		shis.getPercentage();
		
		
		
		System.out.println("------------xxxxxxxxxxxxxxxxxxxx----------------");
		
		Student.getTotalNoStudents();
		//System.out.println("Totoal no. of Students is : "   );
		
		scn.close();
		
	}

}
