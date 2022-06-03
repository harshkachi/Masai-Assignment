package com.Question1;

public class Demo {

	public Animal[] getAnimals() {
		
		Animal[] ani = { new Dog(), new Cat(), new Tiger() };
		
		return ani;
		
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Animal[] ans = d1.getAnimals();
		
		System.out.println("Dog Details");
		
		ans[0].makeNoise();
		ans[0].eat();
		ans[0].walk();
		((Dog)ans[0]).handShake();
		
		System.out.println("-------------------------------------------");
		System.out.println("Cat Details");
		
		ans[1].makeNoise();
		ans[1].eat();
		ans[1].walk();
		
		System.out.println("-------------------------------------------");
		System.out.println("Tiger Details");
		
		ans[2].makeNoise();
		ans[2].eat();
		ans[2].walk();
		
	}
	
}
