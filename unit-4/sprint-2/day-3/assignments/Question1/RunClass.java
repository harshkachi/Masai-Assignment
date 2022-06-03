package com.Question1;

import java.util.Scanner;

public class RunClass extends Student {
	
	
	public static void main(String[] args) {
		
		Hosteller host = new Hosteller();
		DayScholar dsc = new DayScholar();
		RunClass rc = new RunClass();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String nam = scn.next();
		rc.setStudName(nam);
		
		System.out.println("Enter Student ID");
		int id = scn.nextInt();
		rc.setStudId(id);
		
		
		
		System.out.println("------------------DayScholar Fee----------------------");
		
		System.out.println("Enter transport Fee");
		double tfee = scn.nextDouble();
		dsc.setTransportFee(tfee);
		
		System.out.println("DayScholar Fees Paid");
		double dsfee = scn.nextDouble();
		double remfee = dsc.payFee(dsfee);
		
		dsc.setStudName(nam);
		dsc.setStudId(id);
		dsc.displayDetails();
		
		System.out.println("DayScholar Fee remaining : " + remfee);
		
		
		
		
		
		
		
		System.out.println("--------------Hsoteller Fee--------------------");
		
		System.out.println("Enter Hostel Fee");
		double hfee = scn.nextDouble();
		host.setHostelFee(hfee);
		
		System.out.println("Hostel Fees Paid");
		double hfep = scn.nextDouble();
		double remfeeh = host.payFee(hfep);
		
		
		host.setStudName(nam);
		host.setStudId(id);
		host.displayDetails();
		
		System.out.println("Hostel Fee remaining : " + remfeeh);
		
		
		scn.close();
	}

}
