package AdvancedJavaConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapPractice {
public static void main(String[] args) {
		
		// declaring the hashmap.
		
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		
		// adding the data into hashmap.
		
		hm.put(101, "ABC");
		hm.put(102, "LMN");
		hm.put(103, "DEF");
		hm.put(104, "PQR");
		hm.put(105, "ABC");
		hm.put(106, "ABC");
		hm.put(null, "KJH");
		hm.put(null, "NBV");
		
		System.out.println(hm);
		
		// modify  or update the entity.
		
		hm.put(106, "XYZ");
		System.out.println(hm);
		
		// remove the data.
		hm.remove(105);
		System.out.println(hm);
		
	
		// how to read the data from the hashmap.
		
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+"==>"+m.getValue());
		}
	}
}
