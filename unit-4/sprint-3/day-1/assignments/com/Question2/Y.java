package com.Question2;

public interface Y {

	void method1();
	
	default void method2() {
		System.out.println("Inside Inter Y of method2");
	}
	
	public static void method3() {
		System.out.println("Inside Inter Y of method3");
	}
	
}
