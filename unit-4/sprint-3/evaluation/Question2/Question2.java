package com.Question2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Set<String> words = new TreeSet<>();
		
		 
		System.out.println("Enter Student's Article:");
		
		String line = scn.nextLine();
		
		String[] str = line.split(" ");
		
		
		
		
		
		for(String i : str) {
			words.add(i);
		}
		
		
		
		System.out.println("Number of unique words "+ words.size());
		System.out.println("Number of words "+str.length);	
		
		
		int count = 1;
		
		for(String s1 : words) {
			System.out.println(count+s1);
			count++;
		}
	
	}

}
