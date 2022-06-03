package com.myself;



//Write a Java class with a static method that will take 5 positive numbers as a parameter 
//which will represent: 1s, 2s, 3s, fours and sixes scored by the batsman.
//implement the above method to compute the total run scored by that batsman.
//Call this method from the main method of that class and print the result.




public class Question4 {
	public static void main(String[] args) {
		
		int singles = 17;
		int doubles = 6;
		int three = 1;
		int fours = 6;
		int six = 8;
		
		Calrun(singles, doubles, three, fours, six);
		
	}
	
	public static void Calrun(int singles,int doubles,int three,int fours,int six) {
		int Runs = singles + 2*(doubles) + 3*(three) + 4*(fours) + 6*(six);
		
		System.out.println(Runs);
	}
}
