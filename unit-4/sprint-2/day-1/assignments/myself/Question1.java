package com.myself;


public class Question1 {
	 private int roll;
	 private String name;
	 private int age;
	 private int marks;
	 
	 public Question1() {
		super();
		// TODO Auto-generated constructor stub
		
	}


	public Question1(int roll, String name, int age, int marks) {
		super();
		if(age>18 && age<60 && marks<500 && marks>0) {
			this.roll = roll;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
		else {
			System.out.println("Please enter correct details");
		}
	}



	// geter setter method
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age>18 && age<60)
		{
			this.age = age;
		}
		else {
			System.out.println("Please enter correct details");
		}
	}

	public int getMarks() {
			return marks;
		
	}                       

	public void setMarks(int marks) {
		if(marks<500 && marks>0)
		{
			this.marks = marks;
		}
		else {
			System.out.println("Please enter correct details");
		}
		
	}

	
	// student details print
	public void studentDetais() {
		
		if(age>18 && age<60 && marks<500 && marks>0)
		{
			System.out.println("Name is :" + " "+ name);
			System.out.println("Age is : " + age);
			System.out.println("Roll No. is: " + roll);
			System.out.println("Marks is : " + marks);
		}
		else {
			System.out.println("Please enter correct details");
		}
	}
	
		public static void main(String[] args) {
		
			Question1 stud = new Question1();
	
			// 1st Method
			stud.name = "Harshad";
			stud.age = 22;
			stud.roll = 18;
			stud.marks = 374;
			
			stud.studentDetais();
			
			System.out.println("=====================================");
		
			//2nd Method
			Question1 stude1 = new Question1(18, "Harsh", 23, 501);
			
			String str = stude1.getName();
			
			if(str != null) {
				System.out.println("Name is :" + " "+ stude1.getName());
				System.out.println("Age is : " + stude1.getAge());
				System.out.println("Roll No. is: " + stude1.getRoll() );
				System.out.println("Marks is : " + stude1.getMarks());
			}
			
			

	}
	
	
}
