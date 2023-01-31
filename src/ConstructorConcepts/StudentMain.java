package ConstructorConcepts;

public class StudentMain {

public static void main(String[] args) {
				
				//1. Initialize the variables using the objects.
				
//				Student s = new Student();      // object creation
//				s.rollno =101;
//				s.name="ABC";
//				s.grade= 'A';
//				s.display();
				
				System.out.println("=====================================================");
				
				//2. Initialize the variables using methods.
				
//				Student s1 = new Student();      // object creation
//				s1.getstudentsdetails(102, "DEF", 'B');
//				s1.display();
				
				//3. Initialize the variables using constructors.
				
				Student s2 = new Student(103,"LMN",'C');      // object creation
				s2.display();
				
			}
	}