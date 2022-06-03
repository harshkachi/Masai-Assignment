package com.Question2;

public interface Z extends X,Y {

	
	@Override
	default void method2() {
		// TODO Auto-generated method stub
		X.super.method2();
		System.out.println("This is inside z method2");
	}
	
	abstract void method4();
	

}
