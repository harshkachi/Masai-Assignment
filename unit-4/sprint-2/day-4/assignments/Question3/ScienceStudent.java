package com.Question3;

public class ScienceStudent extends Student {

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	static int noOfStudents;
	
	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks ){
		super(name, address);
		// TODO Auto-generated constructor stub
		
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		
	}

	
	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		
		int per = ((this.phisicsMarks + this.chemistryMarks + this.mathsMarks)/300)*100;
		
		System.out.println("Percentage : " + per);
		
		
	}

	
	
	

}
