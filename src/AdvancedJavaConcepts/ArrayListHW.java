package AdvancedJavaConcepts;

import java.util.ArrayList;

public class ArrayListHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(13);
		al.add("Sagar Paulkar");
		al.add("9922774123");
		al.add("Akola");
		al.add("31/12/1982");
		al.add('A');
		al.add("B+ve");
		
		System.out.println(al);
		
		al.set(2, "7020193668");
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println(al.contains("Sagar Paulkar"));
		
		System.out.println(al.indexOf("Sagar Paulkar"));
		System.out.println(al.get(3));
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
	}

}
