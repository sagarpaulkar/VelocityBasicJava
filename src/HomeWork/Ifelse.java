package HomeWork;


public class Ifelse {
	
	public static void main(String[] args) {
		
		
	    System.out.println("1 Program-");
	    
	    // 1. to check the person can open the facebook account or not 
		
		int age = 16;
		
		if(age>=18) {
			System.out.println("The user is allowed to open the facebook account.");
		}else {
			System.out.println("The user is not allowed to open the facebook account.");
		}
		
		  System.out.println("2 Program-");
		
		//2. To check given number is even or odd.
		
		int a =50;
		
		if(a%2==0) {
			System.out.println("Given Number is even");
		}else {
			System.out.println("Given Number is odd");
		}
		
		System.out.println("3 Program-");
		// 3. To find out largest of two numbers.
		
		int x =506;
		int y =65;
		
		if(x>y) {
			System.out.println("X is Largest");
		}else {
			System.out.println("Y is Largest");
		}
		
		System.out.println("4 Program-");
		
		// 4. to check the week depending day number 
		int day =0;
		
		if(day>0) {
			System.out.println("Next week");
		}else if(day<0) {
			System.out.println("Last week");
		}else {
			System.out.println("today");
		}
		
		System.out.println("5 Program-");
		// 5. to check which game is easy or not 
		
		String game = "Batmitton";   
		
		if(game != "Cricket") {
			System.out.println("Easy game");
		}else {
			System.out.println("Difficult game");
		}
		
		System.out.println("6 Program-");
		// 6. Which language is easy .
		
		String Lang = "C+";
		
		if(Lang == "Java" || Lang== "Python" || Lang=="C#"||Lang=="C+") {
			System.out.println("The Launguage is easy");
		}else {
			System.out.println("The Launguage is difficult");
		}
		
		System.out.println("7 Program-");
		// 7. week depending upon day number.
		
		int days =42;
		
		if(days >=1 && days <=6) {
			System.out.println("First Week");
		}else if (days>=7 && days<=15) {
			System.out.println("Second Week");
		}else if (days >=16 && days <=21) {
			System.out.println("Third Week");
		}else if (days >=22 && days<=27) {
			System.out.println("Fourth week");
		}else if (days >=28 && days <=31) {
			System.out.println("Fifth week");
		
		}else {
			System.out.println("Please enter valid input");
		}
		
		System.out.println("8 Program-");
		// To check the week number 
		
		int week =3;
		
		switch(week) {
		case 1: System.out.println("First week");break;
		case 2: System.out.println("Second week");break;
		case 3: System.out.println("Third Week");break;
		case 4: System.out.println("Four Week");break;
		case 5: System.out.println("Fifth week");break;
		default:System.out.println("Please enter valid input");
		
		}
		

		System.out.println("9 Program-");
		// To check the Student Marks
		 char grade= 'A';
		
		if (grade =='A') {
			
			System.out.println(" More than 75%");
		
		}else if(grade=='B'){
			System.out.println("Between 55% to 74 %");
			
		}else if (grade=='C') {
			System.out.println("Below 45%");
		}else {			
			System.out.println("invalid");
		}
		
		
		System.out.println("10 Program-");
		
		//to check the motor engine quality 
		boolean quality= true;
		
		if (quality == true) {			
			System.out.println(" good engine");			
		}else {
			System.out.println("bad engine");			
		}
		
		System.out.println("11 Program-");
		
		//to check person is fair  or not 
		String color= "Dark";
		
		if ( color == "Dark"  ) {			
			System.out.println(" Not fair");			
		}else {
			System.out.println("Fair");			
		}
		
		System.out.println("12 Program-");
		//13.if person elected or not 	
				int voteNumber =30;
				
				if(voteNumber>=30) {
					System.out.println("person win the election");
				}else {
					System.out.println("person lose the election");
				}
		
		System.out.println("13 Program-");	
		// to check the sound depending on animal
		String animal ="cheeth";
		
		if(animal == "dog") {
			System.out.println("sound of barking of dog");
		}else {
			System.out.println("Any other animal's sound");
		}
		
		
		System.out.println("14 Program-");	
		//To check the character is vowel or not 
		 char vowels='i';
		
		if(vowels == 'a' ||vowels == 'e'||vowels == 'i'||vowels == 'o'||vowels == 'u' ||vowels == 'A' ||vowels == 'E'||vowels == 'I'||vowels == 'O'||vowels == 'U' ) {
			System.out.println("character is  vowel");
		}else {
			System.out.println("other character ");
		}
		
		System.out.println("15 Program-");	
		//To check the 70 is divisible by 10
		 int number= 70;
		
		if(number%10==0 ) {
			System.out.println("number divisble by 10");
		}else {
			System.out.println("number not divisible by 10 ");
		}
	}

}