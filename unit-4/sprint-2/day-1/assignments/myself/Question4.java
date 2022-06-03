package com.myself;

public class Question4 {
	
	public static void main(String[] args) {
		
		int N = 44;
		
		Question4 ans = new Question4();
		
		ans.checkEvenOdd(N);
		ans.checkEvenOdd(35);
		ans.checkEvenOdd(-5);
	}

	public void checkEvenOdd(int N) {
		
		if(N<0) {
			System.out.println("Error");
		}
		else if(N%2 != 0) {
			System.out.println(N);
		}
		else if(N%2 == 0) {
			int a = N%10;
			int b = 10 - a;
			
			int finalvalue = N+b;
			
			System.out.println(finalvalue);
		}
		
	}
}
