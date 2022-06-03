package com.Question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int num){
		
		if(num > 1000)
		{
			Hotel h1 = new TajHotel();
			
			return h1;
		}
		
		else if( num < 1000  && 0 < num) {
			Hotel h1 = new RoadSideHotel() ;
			
			return h1;
		}
		else {
			return null;
		}
	}

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Price");
		int num = scn.nextInt();
		
		while(num < 0 ) {
			System.out.println("Please Enter a valid amount");
			num = scn.nextInt();
		}
		
		Hotel ans = d1.provideFood(num);
		
		ans.chickenBiryani();
		ans.masalaDosa();
		
		scn.close();
	}
	
}
