package AdvancedJavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
public static void main(String[] args) {
		
		
		HashSet <String> sh = new HashSet <String>();
		
		// adding the elements to the hashset
		
		sh.add("one");
		sh.add("two");
		sh.add("three");
		sh.add("four");
		sh.add("five");
		
		System.out.println(sh);
		
		// adding the duplicate elements
		
		sh.add("two");
		sh.add("three");
		sh.add("four");
		
		System.out.println(sh);
		
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		al.add("ten");
		
		sh.addAll(al);	
		System.out.println(sh);
		
		sh.remove("three");
		System.out.println(sh);
		
		// how to read the values.   (for loop / advanced for loop)
		
		Iterator itr = sh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
