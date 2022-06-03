package com.Question2;

public interface X {

	
	void method1();
	
	default void method2() {
		System.out.println("Inside Inter x of method1");
	}
	
	public static void method3() {
		System.out.println("Inside Inter X of method3");
	}
	
	
}
