package com.Question3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp1 = new Employee(18, "Ram", "abc@gmail.com" ,"Pass@01");
		
		FileOutputStream fos = new FileOutputStream("emp.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp1);
		
		oos.flush();
		oos.close();
		
		System.out.println("Complete Append");
		
		
//		ObjectInputStream oo = new ObjectInputStream(new FileOutputStream("emp.txt"));

		FileInputStream fis = new FileInputStream("emp.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Employee ans = (Employee)ois.readObject();
		
		System.out.println(ans);
		ois.close();
		
	}

}
