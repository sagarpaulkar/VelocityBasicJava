package AdvancedJavaConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class HSPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(13);
		hs.add("Sagar");
		hs.add("31/12/1982");
		hs.add('A');
		hs.add("Akola");
		System.out.println("Original Hashset:-"+hs);
		
		
		System.out.println("Iterator for loop:-");
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("==================");
		System.out.println("Advance for loop:-");
		for(Object obj:hs) {
		System.out.println(obj);
		}
		
	}

}
