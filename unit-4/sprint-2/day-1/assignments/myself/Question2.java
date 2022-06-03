package com.myself;

public class Question2 {

	public static void main(String[] args) {
		
		new Question2();
		
	}
	
	Question2(){
		
		this("Harshad");
		System.out.println("This is Question2()");
	}
	
	Question2(String s){
		
		this(10);
		System.out.println("This is Question2(String s)");
	}
	
	Question2(int i){
		this(12f);
		System.out.println("This is Question2(int 1)");
	}
	
	Question2(float f){
		System.out.println("Tis is Question2(float f)");
	}
	
	
	
}
