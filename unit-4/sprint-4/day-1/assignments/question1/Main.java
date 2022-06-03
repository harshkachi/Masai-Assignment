//Create a Student bean class with following fields: **
//
//    roll
//    name
//    marks
//
//** create a HashMap as **
//
//    key : String (Indian-state name)
//    value : Student (student object with the proper details)
//
//Sort this HashMap according 
//to their value (according to the Student marks) 
//and print the state name and the corresponding student details in sorted order.












package com.question1;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Maharashtra", new Student(10, "HRK", 80));
		hm.put("Telangana", new Student(11, "HRK", 67));
		hm.put("Tamilnadu", new Student(12, "HRK", 75));
		hm.put("Karnataka", new Student(13, "HRK", 94));
		hm.put("Bihar", new Student(14, "HRK", 61));
		
		//System.out.println(hm);

		List<Student> val = new ArrayList<Student>();
		
		
		Set<String> state = hm.keySet();
		//System.out.println(state);
		
		
		//Optional
		//Collection<Student> stu = hm.values();
		//System.out.println(stu);

		
		for(String s:state) {
			val.add(hm.get(s));
			//System.out.println(hm.get(s));
		}
		
		
		//System.out.println(val);
		
		
		// After sorting Student Object
		Collections.sort(val, new CompareStud());
		
		//System.out.println(val);

		Set<Map.Entry<String, Student>> arr = hm.entrySet();
		//System.out.println(arr);
		
		
		Map<String, Student> main = new LinkedHashMap<>();
		
		for(Student s:val) {
			
			for(Map.Entry<String, Student> tp:arr) {
				if(tp.getValue().equals(s)) {
					main.put(tp.getKey(), tp.getValue());
				}
			}
			
			
		}
		
		
		//System.out.println(main);
		
		for(Map.Entry<String, Student> ans:main.entrySet()) {
			
			System.out.println("State is :" + ans.getKey());
			System.out.println("---------------------------");
			System.out.println("Name : "+ans.getValue().getName());
			System.out.println("Roll : "+ans.getValue().getRoll());
			System.out.println("Mark : "+ans.getValue().getMarks());
			
			
			System.out.println("===============================================================");
			
		}
		
		
		
		
		
		
		
	}
}
