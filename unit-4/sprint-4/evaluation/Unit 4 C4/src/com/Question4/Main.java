package com.Question4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public Main() {
		
		ArrayList<Student> stud = new ArrayList<>();
		
		stud.add(new Student(18, "Aditya", 440));
		stud.add(new Student(19, "Harshad", 340));
		stud.add(new Student(20, "Omkar", 410));
		stud.add(new Student(21, "Shubham", 445));
		stud.add(new Student(22, "Akash", 450));
		
		Collections.sort(stud,(a,b)->{
            return a.getMarks() > b.getMarks() ? 1 : -1;
        });
		
        stud.stream().forEach(ans->{
        
            System.out.println("Employee Name : "+ans.getRoll());
            System.out.println("Employee Id : "+ 1000*ans.getMarks());
            System.out.println("Employee Salary : " + ans.getName());
            System.out.println(" --------xxxxxxxxx End xxxxxxxxxx-----------");
        });
		
	}
	

}
