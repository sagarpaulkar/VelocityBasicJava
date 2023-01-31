package AdvancedJavaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistPracticePrograms {
	
public static void main(String[] args) {
		
		// 1. How to declare the arraylist.
		
		// common way of declaration.
		
		ArrayList al = new ArrayList();
		
		// Generic way of declaration.
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		// 2. how to add the values inside arraylist.  ==> add
		
		al.add(15);      // 0th index
		al.add("abc");    // 1
		al.add('c');       //2
		al.add(15);         //3
		System.out.println(al);
		
		al.add(2,'B');    // existing index value ==> shifting of values towards right
		
		System.out.println(al);
		
		// replace the value at perticular index
		
		al.set(2, 'D');
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		System.out.println(al.isEmpty());   // boolean
		System.out.println(al1.isEmpty());
		
		// how many elements are present within the arraylist.
		
		System.out.println(al.size());
		
		System.out.println(al.indexOf("abc"));
		
		System.out.println(al.contains("velocity"));   // boolean 
		
		System.out.println(al.get(3));
		
		System.out.println("==============================================================");
		
		// how to read the values within the arraylist
		
		// loop :- for
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		// advanced for loop.
		
//		for (Object value:al) {
//			System.out.println(value);
//		}
		
		
		// iterator.
		
//		Iterator itr = al.iterator();      // all implementation class
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		ListIterator litr = al.listIterator();     // implementation class of list interface
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
		
		// Reverse order
		
		Collections.reverse(al);
		System.out.println(al);
	}
		
		
	
//Arraylist:- 
//
//=> It is implementation class of list interface
//=> Default capacity of arraylist is 10.
//=> Incremental Size = (Current Capacity * 3/2 +1 )
//=> It uses resizable data structure.
//=> Arraylist is best choice for retrival option
//=> Arraylist is worst choice for manipulation operation (i.e add or remove the elements)
}

