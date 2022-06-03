package com.Question2;

public class Demo {
	
	
	public static void main(String[] args) {
		
		ZImpl z1 = new ZImpl();
		
		z1.method1();
		z1.method2();
		z1.method4();
	
		// -----------------------------
		
		Z z3 = (Z)z1;
		
		z3.method1();
		z3.method2();
		z3.method4();
	
		
		//--------------------------
		
		Y y1 = (Y)z3;
		
		y1.method1();
		y1.method2();
		Y.method3();
		
		//--------------------------
		
		X x1 = (X)z3;
		
		x1.method1();
		x1.method2();
		X.method3();
		
		
	}



}
