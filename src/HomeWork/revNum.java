package HomeWork;

public class revNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 989, reverse = 0, temp=0;
		
		temp=number;
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  	
		
		if (number==reverse) {
		
			System.out.println("palidrome");
		}
		
		else {
			System.out.println("Not Palidrome");
		}
	}
	}

