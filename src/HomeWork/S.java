package HomeWork;

public class S {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
	String s = "Velocityooo";
		
		String s1 = " I Love India        ";
		
		// 1. length()
		
		System.out.println("Total number of characters in a given string "+ s.length());
		
		// 2. uppercase()
		
		System.out.println("The string after converting into uppercase: "+ s.toUpperCase());
		
		// 3. lowercase()
		
		System.out.println("The string after converting into lowercase: "+ s.toLowerCase());
		
		// 4. charat() :- to find out the character at perticular index.
		
		System.out.println("The character present at third index:- "+ s.charAt(3));
		
		
	   // 5. indexof() :- will find out the index of perticular character 
		
		System.out.println("The index of o in the given string is:- "+ s.indexOf("o"));
		
		
	   // 6. lastindexof() :- will find out the last index of perticular character 
		
		System.out.println("The last index of o in the given string is:- "+ s.lastIndexOf("o"));
		
		
	   // 7. trim() :- remove the unwanted spaces present at start or end of the string
		System.out.println("The String S1 before Trimming:- "+ s1);
		
		System.out.println("The String S1 after Trimming:- "+ s1.trim());
		
		String s2=s1.replace(" ", "");
		System.out.println(s2);
	}

}
