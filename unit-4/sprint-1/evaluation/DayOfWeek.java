package com.masai;

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		int DayOfWeek  = 6;
		
		boolean holiday = true;
		
		callAns(DayOfWeek, holiday);
	}
	
	static void callAns(int DayOfWeek, boolean holiday) {
	
		
		if(holiday == true) {
			if(DayOfWeek == 6) {
				System.out.println("Sleep in!");
			}
			else if(DayOfWeek == 7) {
				System.out.println("Sleep in!");
			}
		}
		
		else if(holiday == false) {
			
			if(DayOfWeek == 1 ) {
				System.out.println("Wake up at 7:00");
			}
			else if(DayOfWeek == 2) {
				System.out.println("Wake up at 7:00");
			}
			else if(DayOfWeek == 3) {
				System.out.println("Wake up at 7:00");
			}
			else if(DayOfWeek == 4) {
				System.out.println("Wake up at 7:00");
			}
			else if(DayOfWeek == 5) {
				System.out.println("Wake up at 7:00");
			}
		}
		
		
		
	}
	
}
