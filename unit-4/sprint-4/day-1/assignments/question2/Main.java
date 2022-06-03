package com.question2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Maharastra","Mumbai");
		lhm.put("Telangana","Hydrabad");
		lhm.put("Tamilnadu","Chennai");
		lhm.put("Karnataka","Bangaluru");
		lhm.put("Bihar","Patna");
		
		//System.out.println(lhm);
		
		//Set<Map.Entry<String, String>> set = lhm.entrySet();
		
		//System.out.println(set);
		
		
		for(Map.Entry<String, String> s:lhm.entrySet()) {
			
			System.out.println("State : "+s.getKey() + " Capital : "+s.getValue());
			
		}
		
		

	}

}
