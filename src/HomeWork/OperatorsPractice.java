package HomeWork;

public class OperatorsPractice {
	
	public static void main(S[] args) {
		
		int a=2;
		int b=1;
		
		//Arithmetic operators -->  + - * / %
		System.out.println("------------------------Arithmetic operators---------------------");
		// funda :- user defined message and system generated output combine ==> concatination

		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:" +(a-b));
		System.out.println("Mul of a and b is:" +(a*b));
		System.out.println("Div of a and b is:" +(b/a));
		System.out.println("Mod Div of a and b is:" + (b%a));
		
		//Relational Operators (Comparison operators)--->   == < >  <=  >=  !=
		//Always return boolean value
		System.out.println("------------------------Relational operators---------------------");
		System.out.println("Is a equal to b-"+(a==b)); //false
		System.out.println("Is a more than b-"+(a>b)); //false
	    System.out.println("Is a less than b-"+(a<b)); //true
		System.out.println("Is a more than/equal to b-"+(a>=b));//false
		System.out.println("Is a less than/equal to b-"+(a<=b)); //true
		System.out.println("Is a not equal to b-"+(a!=b)); //true
		
		//Logical operators   &&   ||    !
		//works between two boolean
				
		boolean x=true;
		boolean y=false;
		System.out.println("------------------------Logical operators---------------------");
		System.out.println("true & false-"+(x && y)); //false
		System.out.println("true or false-"+(x || y)); //true
		System.out.println("not true-"+(!x)); //false
		System.out.println("not false-"+(!y)); //true
		
		//increment/decrement operators  ++  --
		
		a=10;
		a++;      //a=a+1;
		System.out.println(a);
				
		b=20;
		b--;		//b=b-1;
		System.out.println(b);
		
		// Assignment operator
		int v = 20; 
	}

}
