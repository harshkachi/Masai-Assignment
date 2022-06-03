package com.masai;

public class Course {
	

    int courseId;
    String courseName;
    int courseFee;
    
    public static void main(String[] args) {
    	
    	String userName = "Admin";
    	String passWord = "1234";
    	
    	authenticate(userName, passWord);
    	authenticate("Admin", "123");
    	
    }
    
    void displayCourseDetails() {
    	System.out.println("Course Id is" +" "+ courseId);
    	System.out.println("Course Name is" + " " +courseName);
    	System.out.println("Course fee is" + " " + courseFee);
    }
    
    static void authenticate(String userName, String passWord){
    	
    	if( userName == "Admin" && passWord == "1234") {
    		Course obj = new Course();
    		
    		obj.courseId = 14;
    		obj.courseName = "Masai";
    		obj.courseFee = 10000;
    		
    		obj.displayCourseDetails();
    		
    	}
    	
    	else{
    		System.out.println("Invalid Username or password");
    	}
    }

	
}
