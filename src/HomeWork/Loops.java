package HomeWork;

public class Loops {
	
	public static void main(S[] args) {
		// 1. initialization   2. condition    3.increment or decrement
		
		// While loop programs
		// Program 1 -To print the number 1-10.
		
		int i=1;
		System.out.print("Program 1- Numbers from 1 to 10 = ");
		while (i<=10) {
			
			System.out.print(i+" ");// 1 2 3 4 5 6 7 8 9 10
			i++; // 2 3 4 5 6 7 8 9 10 11
		}
		System.out.println("");
		
		// Program 2 - To Print the numbers 1-10 (even numbers)
		
		int a=2;
		System.out.print("Program 2- even numbers upto 10 = ");
		while(a<=10) {
			System.out.print(a+" ");   //2 4 6 8 10
			a = a+2;
		}
		
		System.out.println("");
		
		// Program 3-To Print the numbers 1-10 (odd numbers)
		
		int b=1;
		System.out.print("Program 3- odd numbers upto 10 = ");
		while(b<=10) {
			System.out.print(b+" ");   
			b = b+2;
		}	
		System.out.println("");
		// Program 4 - To Print the numbers 1-10 (descending order)
		
		int c=10;
		System.out.print("Program 4- To Print the numbers 1-10 (descending order)= ");
		while(c>=1) {
			System.out.print(c+" ");  //10 9 8 7 ------1
			c--; // 9 8 7 ----- 0
		}
		System.out.println("");
		// Program 5- To print number like 3, 6, 9, 12 upto 20 
		
		int d=0;
		System.out.print("Program 5- To print number like 3, 6, 9, 12 upto 20 = ");
		while (d<=20) {			
			System.out.print(d+" ");
			d=d+3;
		}
		System.out.println("");
		// do while loop
		// Program 6 - TO print  the numbers 1-10.
		int e=1;
		System.out.print("Program 6-TO print  the numbers 1-10 using do while = ");
		do {
			System.out.print(e+" ");  //1 2 3 4 5 6 7 8 9 10
			e++; // 2 3 4 5 6 7 8 9 10 11
		}while(e<=10);
		
		System.out.println("");
		

		// Program 7- drawback of do while loop.
		
		int f=20;
		System.out.print("Program 7-drawback of do while loop = entering in do loop without checking the while condition for first time =");
		do {
			System.out.print(f);  
			f++; 
		}while(f<=10);
		
		System.out.println("");	
		
		// for loop 
		
		// Program 8 -print the numbers 1-10.

		System.out.print("Program 8-To print  the numbers 1-10 using for loop = ");
		
		for (int j=1;j<=10;j++) {
			System.out.print(j+" ");
		}
		
		System.out.println("");	
		
		// Program 9- print the "Sagar" for  10 times (descending order)
		System.out.print("Program 9- print the Sagar for  10 times (descending order) = ");
		for (int k=10;k>=1;k--) {
			System.out.print(k+" Sagar"+ " ");
		}
		
		System.out.println("");
		
		
		// Program 10- Print the table of 5.
		System.out.print("Program 10-Print the table of 5.= ");
		for (int l=5;l<=50;l=l+5) {
			System.out.print(l+" ");
		}
		
		System.out.println("");
		// Program 11- print the table of 5
		System.out.print("Program 11- Print the table of 5 in proper way = ");		
		int num =5;
		for(int m=1;m<=10;m++) {
			System.out.print(num +"*"+m+ "="+ num*m+" ");
		}
		
		System.out.println("");
		//Program 12- Print the table of 5 in reverse way =
        System.out.print("Program 12- Print the table of 5 in reverse way = ");
		 int number =5;
			for(int p=10;p>=1;p--) {
				System.out.print(number +"*"+p+ "="+ num*p+" ");
			}
			
		System.out.println("");
			
		// Program 13 - Print the alphabets a-z
		
		System.out.print("Program 13- Print the alphabets a-z = ");
		
		for(char n ='a';n<='z';n++) {
			System.out.print(n+" ");
		}
		
        System.out.println("");
        
     // Program 14 - Print the alphabets A-Z
		
		System.out.print("Program 14- Print the alphabets A-Z = ");		
		
		for(char o ='A';o<='Z';o++) {
			System.out.print(o +" ");
		}
		
		 System.out.println("");
	        
	     //Program 15- Program 14- Print the alphabets A-Z in reverse order 
		 System.out.print("Program 15- Print the alphabets A-Z in reverse order ");
		 for(char q ='Z';q>='A';q--) {
			 
				System.out.print(q +" ");
			}     
		    
		
	}

}