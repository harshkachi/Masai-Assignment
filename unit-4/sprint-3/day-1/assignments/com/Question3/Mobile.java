package com.Question3;

import java.util.Scanner;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Mobile Company : ");
		String mobile = scn.nextLine();

		
		System.out.println("Enter Model Name : ");
		String modelName = scn.nextLine();
		
		System.out.println("-------------xxxxxxxxxxxxxxxxxxxxxxxx-------------------");
		
		
		if(modelName.isEmpty()) {
			System.out.println("Mobile Company : "+ mobile);
		}
		
		else {
			System.out.println("Mobile Company : "+ mobile);
			
//			for(int i=0; i< m1.outdatedModels.length ; i++) {
//				
//			}
			
			boolean tp = true;
			
			
			for(String i: m1.outdatedModels) {
				
				if(modelName.equalsIgnoreCase(i))
				{
					System.out.println("Model Name : " + i + "_OUTDATED");
					tp = false;
					break;
				}
				
//				else {
//					System.out.println("Model Name : " + modelName);
//				}	
			}
			
			if(tp == true)
				System.out.println("Model Name : " + modelName);
			
			
		}
		
		
//		if(modelName.isEmpty() != modelName.isEmpty()) {
//			
//			System.out.println("Mobile Company : "+ mobile);
//			
////			for(int i=0; i< m1.outdatedModels.length ; i++) {
////				
////			}
//			
//			for(String i: m1.outdatedModels) {
//				
//				if(modelName.equals(i))
//				{
//					System.out.println("Model Name : " + i + "_OUTDATED");
//					break;
//				}
//				
//				else {
//					System.out.println("Model Name : " + modelName);
//					//System.out.println("Model Name : " + modelName);
//				}
//					
//				
//			}
//			
//		}
//		
//		else
//			System.out.println("Mobile Company : "+ mobile);

		
		scn.close();
	}

	
}
