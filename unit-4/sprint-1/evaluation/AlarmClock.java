package com.masai;

public class AlarmClock {
	
	public static void main(String [] args) {
		
		int N = 0;
		boolean work = true;
		
		AlarmClock obj = new AlarmClock();
		
		obj.findAns(N, work);
		
	}
	
	void findAns(int N, boolean work) {
		
		
		if(N==0 || N==1 || N==2 || N==3 || N==4 || N==5 || N==6 || work == true || work == false) {
			
			if(N==1 && work == true){
				System.out.println("10:00");		
			}
			else if(N==2 && work == true){
				System.out.println("10:00");		
			}
			else if(N==3 && work == true){
				System.out.println("10:00");
			}
			else if(N==4 && work == true){
				System.out.println("10:00");
			}
			else if(N==5 && work == true){
				System.out.println("10:00");
			}
			
			
			
			else if(N == 0 && work == true ) {
				System.out.println("off");
			}
			else if(N == 6 && work == true ) {
				System.out.println("off");
			}
			
			
			else if(N==1 && work == false ){
				System.out.println("7:00");		
			}
			else if(N==2 && work == false ){
				System.out.println("7:00");		
			}
			else if(N==3 && work == false){
				System.out.println("7:00");
			}
			else if(N==4 && work == false){
				System.out.println("7:00");
			}
			else if(N==5 && work == false){
				System.out.println("7:00");
			}
			
			
			else if(N == 0 && work == false ) {
				System.out.println("10:00");
			}
			else if(N == 6 && work == false ) {
				System.out.println("10:00");
			}
		}
		
		else {
			System.out.println("error");
		}
	}
		
	

}
