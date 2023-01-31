package AdvancedJavaConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {
public static void main(String[] args) {
		
		// declaring the treeset
		
		TreeSet <String> ts = new TreeSet <String>();
		
		// adding the elements within treeset.
		
		ts.add("c");
		ts.add("f");
		ts.add("r");
		ts.add("a");
		ts.add("b");
		ts.add("d");
		ts.add("e");
		
		System.out.println(ts);
		
		// duplicate 
		
		ts.add("r");
		ts.add("a");
		ts.add("b");
		
		System.out.println(ts);
		
		// presence of element
		System.out.println(ts.contains("z"));
		
		// additional methods
		
		// to look at first and last element.
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		// removing the first element and last element
		
		ts.pollFirst();
		ts.pollLast();
		System.out.println(ts);
		
		// higher and lower element of a perticular elment
		String value ="f";
		
		System.out.println("Higher element:- "+ ts.higher(value) );
		System.out.println("Lower element:- "+ ts.lower(value) );
		
		System.out.println(ts.size());
		
		
		for (String valueq:ts) {
			System.out.println(valueq);
		}
		
		System.out.println("=============================================");
		// Cursor :- iterator
		
		Iterator itr =  ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
