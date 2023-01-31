package HomeWork;

public class StringBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
				// How to reverse the string using java.
				
//				 String Original = "abcdef";
//				 String Reverse="";
//				
//				for(int i=Original.length()-1;i>=0;i--) {   // 5 4 3 2 1 0 -1
//					Reverse=Reverse+Original.charAt(i);          // fedcba
//				}
//				System.out.println(Reverse);
				
				
				// To check weather given string is palidrome or not
				
				
				String Original = "abcba";
				String Reverse="";
				System.out.println(Original);
				for(int i=Original.length()-1;i>=0;i--) {   
					Reverse=Reverse+Original.charAt(i);          
				}
				System.out.println(Reverse);
				
				//System.out.println(Reverse.equals(Original));
				
				if(Original.equals(Reverse)) {
					System.out.println("Given String is Palindrome");
				}else {
					System.out.println("Given String is not Palindrome");
				}
				
				
			}

		
}
