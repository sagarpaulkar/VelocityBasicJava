package AdvancedJavaConcepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListWODuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("Sagar");
		al.add("Dharmesh");
		al.add("Deepak");
		al.add("Ajay");
		al.add("Mangu");
		al.add("Dharmesh");
		al.add("Deepak");
		al.add("Anup");
		al.add("Chotu");
		System.out.println("======Your Original Arraylist=====");
		System.out.println(al);
		LinkedHashSet hs = new LinkedHashSet();
		hs.addAll(al); // adding ArrayList into LinkedhashSet
		System.out.println("===Original ArrayList without Duplicate===");
		System.out.println(hs);
	}

}
