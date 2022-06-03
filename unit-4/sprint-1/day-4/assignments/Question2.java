package com.myself;



//Write a java application with a non-static method that will accept a character (a-z or A-Z) and 
//print if that character is vowel or consonant, if we supply other than (a-z or A-Z) 
//then that method should print the error message.
//Call the above method from the main method of the same class 3 times,

//first time by supplying a vowel

//the second time by supplying a consonant

//third time by supplying an invalid character


public class Question2 {

	public static void main(String[] args) {
		
		char N1 = 'a';
		char N2 = 'b';
		char N3 = 2;
		
		Question2 obj = new Question2();
		
		obj.checkvs(N1);
		obj.checkvs(N2);
		obj.checkvs(N3);
		
	}
	
	public void checkvs(char N) {
		
	
		
		
		if(N == 'a' || N == 'e' || N == 'i' || N == 'o' || N == 'u') {
			System.out.println("It is a Vowel");
		}
		else if(N == 'b'||N=='c' ||N=='d'||N == 'f'||N=='g'||
	    		N == 'h'||N=='j' ||N=='k'||N == 'l'||N=='m'||
	    		N == 'n'||N=='p' ||N=='q'||N == 'r'||N=='s'||
	    		N == 't'||N=='v' ||N=='w'||N == 'x'||N=='y'||
	    		N == 'z'){
			System.out.println("It is Consonant");
	    }
		else {
			System.out.println("Invalid Character");
		}
		
	}
}
