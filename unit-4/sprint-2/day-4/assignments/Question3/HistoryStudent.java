package com.Question3;

public class HistoryStudent extends Student {

	int historyMarks;
	int civicsMarks;
	
	static int noOfStudents;
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		// TODO Auto-generated constructor stub
		
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		
	}


	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		
		int per = ((historyMarks + civicsMarks / 200)*100);
		
		System.out.println("Percetage : "+per);
	}

}
