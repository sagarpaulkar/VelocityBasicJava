package AdvancedJavaConcepts;

import java.util.LinkedHashSet;

public class LinkedHashsetPractice {
public static void main(String[] args) {
		
		LinkedHashSet <String> sh = new LinkedHashSet<String>();
		
		sh.add("one");
		sh.add("two");
		sh.add("three");
		sh.add("four");
		sh.add("five");
		sh.add("six");
		sh.add("seven");
		sh.add("eight");
		sh.add("nine");
		sh.add("ten");
		
		System.out.println(sh);
		
		// duplicate values
		
		sh.add("five");
		sh.add("six");
		sh.add("seven");
		sh.add("eight");
		
		System.out.println(sh);
		
		// to check the size.
		System.out.println(sh.size());
		
		// to check the presence of any elments.
		
		System.out.println(sh.contains("eleven"));
		
		sh.remove("one");     // only remove the element
		System.out.println(sh);
		
		System.out.println(sh.remove("five"));      // will check the status and then remove
		System.out.println(sh);
		
		System.out.println(sh.remove("fifteen"));
		System.out.println(sh);
	}

}
