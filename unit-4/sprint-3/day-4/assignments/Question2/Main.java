//Q2.Create the additional Members class in the above LibraryManagement System memberId(unique),
//memberName,membershipNo(unique), membershipEnddate. Add a minimum of 5 members from the Main class. 
//It should not accept duplicate members, that is members having the same memberId or membershipNo.
//
//Print all the members in an order to see whose membership is ending first. Should be printing first. 
//Use appropriate collection to store list of Members data in the Library class.







// wrong












package com.Question2;

import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		TreeSet<Members> list = new TreeSet<>();
		
		list.add(new Members(111, "HRK", 1, "09-03-1998"));
		list.add(new Members(111, "HRK", 1, "05-03-1998"));
		list.add(new Members(113, "HRK", 3, "06-03-1998"));
		list.add(new Members(114, "HRK", 4, "11-03-1998"));
		list.add(new Members(115, "HRK", 1, "08-03-1998"));
		list.add(new Members(111, "HRK", 5, "09-03-1998"));
		list.add(new Members(116, "HRK", 6, "12-03-1998"));
		
		//System.out.println(list);
		
		for(Members m:list)
			System.out.println(m);
		
	}

}
