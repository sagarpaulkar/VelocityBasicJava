package AdvancedJavaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortingProgram {
public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();       // generic way of declaration
		
		// adding the values in arraylist.
		
		al.add("activa");
		al.add("pulsar");
		al.add("city");
		al.add("bmw");
		al.add("swift");
		al.add("audi");
		al.add("bullet");
		
		System.out.println("arraylist before sorting:- "+ al);
		
		// sorting the arraylist.(assending)
		
		Collections.sort(al);
		System.out.println("arraylist after sorting:- "+ al);
		
		// sorting the arraylist.(descending)
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("arraylist after sorting in descending order:- "+ al);
		
	}
}
