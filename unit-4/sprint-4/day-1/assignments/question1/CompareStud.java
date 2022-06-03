package com.question1;

import java.util.Comparator;

public class CompareStud implements Comparator<Student> {

	
	
	
	public CompareStud() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarks() > o2.getMarks())
			return 1;
		else if(o1.getMarks() < o2.getMarks())
			return -1;
		else
			return 0;
	}

	
	
}
