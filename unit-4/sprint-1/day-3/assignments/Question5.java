package com.myself;


//Write a Java class with a static method that will take a number and 
//print all the prime factorial of that number.
//The Supplied number should be between 2 and 100. otherwise, it should print “Invalid number”.
//Call this method from the main method by suppling any valid argument.



public class Question5{

	public static void main(String[] args) {
		int N = 21;
		
		findPrimefac(N);
	}
	
	public static void findPrimefac(int N) {
		
		if(N>=2 && N<100) {
			
			for(int i=1; i<=N; i++) {
				if(N % i == 0) {
					System.out.println(i);
				}
			}
		}
		
		else {
			System.out.println("Invalid Number");
		}
	}
}
