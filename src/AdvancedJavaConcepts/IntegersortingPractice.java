package AdvancedJavaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class IntegersortingPractice {
public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(5052);
		al.add(50);
		al.add(52);
		al.add(505);
		al.add(250);
		al.add(100);
		al.add(15);
		al.add(159);
		al.add(218);
		
		System.out.println("arraylist before sorting:- "+ al);
		
				// sorting the arraylist.(assending)
		
				Collections.sort(al);
				System.out.println("arraylist after sorting:- "+ al);
				
				// sorting the arraylist.(descending)
				
				Collections.sort(al, Collections.reverseOrder());
				System.out.println("arraylist after sorting in descending order:- "+ al);
		
		
	}
}
