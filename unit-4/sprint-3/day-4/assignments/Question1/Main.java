//Q1. Create a basic application named Library Management System having Library class containing list of 
//books present in the library .(Choose the best collection to store that. 
//		Books class having the attributes as bookId(Unique_id),bookName,BookAuthor Main Runner class.
//
//Display the list of books while demonstrating duplicate books(i.e. Books with same id) are not entered. 
//Note: Books can have the same bookName,BookAuthor but not bookId.





package com.Question1;

import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashSet<Library> bl = new LinkedHashSet<>();
		
		bl.add(new Library(1, "abc", "def"));
		bl.add(new Library(2, "abc", "vk"));
		bl.add(new Library(3, "xyz", "hrk"));
		bl.add(new Library(4, "pqr", "msd"));
		bl.add(new Library(1, "mno", "rs"));
		bl.add(new Library(5, "kgf", "def"));
		bl.add(new Library(6, "rrr", "def"));
		
		
		for(Library l:bl) {
			System.out.println(l);
		}	
		
	}
	
	


}
