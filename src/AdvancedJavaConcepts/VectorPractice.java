package AdvancedJavaConcepts;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {
public static void main(String[] args) {
		
		// 1. How to declare the arraylist.
		
		// common way of declaration.
		
		Vector vec = new Vector();
		
		
		// 2. how to add the values inside arraylist.  ==> add
		
		vec.add(15);      // 0th index
		vec.add("abc");    // 1
		vec.add('c');       //2
		vec.add(15);         //3
		System.out.println(vec);
		
		vec.add(2,'B');    // existing index vvecue ==> shifting of vvecues towards right
		
		System.out.println(vec);
		
		// replace the vvecue at perticular index
		
		vec.set(2, 'D');
		System.out.println(vec);
		
		vec.remove(4);
		System.out.println(vec);
		
		System.out.println(vec.isEmpty());   // boolean
		
		// how many elements are present within the arraylist.
		
		System.out.println(vec.size());
		
		System.out.println(vec.indexOf("abc"));
		
		System.out.println(vec.contains("velocity"));   // boolean 
		
		System.out.println(vec.get(3));
		
		System.out.println(vec.capacity());
		
		System.out.println("==============================================================");
		
		// how to read the vvecues within the arraylist
		
		// loop :- for
		
//		for(int i=0;i<vec.size();i++) {
//			System.out.println(vec.get(i));
//		}
		
		// advanced for loop.
		
//		for (Object vvecue:vec) {
//			System.out.println(vvecue);
//		}
		
		
		// iterator.
		
//		Iterator itr = vec.iterator();      // vecl implementation class
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		ListIterator litr = vec.listIterator();     // implementation class of list interface
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
		
		
		Enumeration en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		// Reverse order
		
//		Collections.reverse(vec);
//		System.out.println(vec);
	}
}
