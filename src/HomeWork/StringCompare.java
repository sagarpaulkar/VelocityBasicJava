package HomeWork;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Velocity";
		String s2= "VELOCITY";
		String s3= "Veloc";
		
		// 1. equals==>to compare the given strings ==> boolean value.==> with casesensitive 
		
		System.out.println(s1.equals(s2)); // you can reverse the input.
		
		// 2. equalsignorecase() :- to compare the given strings==> boolean value.==> not casesensitive 
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// 3. contains() :- if one string is part of another string ==> boolean value. ==> casesensitive
		
		System.out.println(s1.contains(s3));
		
		// 4. isempty() :- checking the emptiness of the given string. ==> boolean value
		
	    System.out.println(s1.isEmpty());
	    
	    // 5. concat() :- it is used to add two or more than two strings
		
		String s4 ="abc";
		String s5 ="xyz";
		
		System.out.println(s4.concat(s5));
		System.out.println(s5.concat(s4));
		
		// 6. startswith() :- used to check the presence of perticular pattern in given string at the starting of the string.==> boolean value
		
		System.out.println(s1.startsWith(s3));
		System.out.println(s1.startsWith("Veloc"));
		System.out.println(s1.startsWith("eloc"));
		
		// 7. endswith() :- used to check the presence of perticular pattern in given string at the ending of the string.
		
		System.out.println(s1.endsWith("city"));
		System.out.println(s1.endsWith("cit"));
		System.out.println(s2.endsWith("y"));
		
		
		// 8. replace() :- used to replace the old characters by new characters
		
		String s6 ="abc pqr lmn";
		
		System.out.println(s6.replace("abc", "xyz"));
		System.out.println(s6.replace("abc", "XYZ"));
		
		// 9. substring() :- based on index postion ==> to extract the characters prensent  on perticular.
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 6));
		
		
		// 10. Split() :- used to split the given based on some input.
		
		String s7 = "abc pqr xyz";
		String words[]= s7.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			
			String s9="Sagar";
			
			String s10="SAGAR";
			
			System.out.println(s9==s10);
		}
	}

}
