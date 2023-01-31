package ConstructorConcepts;

public class Student {
	int rollno;
	String name;
	char grade;
	
	Student(int rn,String nm,char gr){
		rollno = rn;
		name=nm;
		grade=gr;
	}
	
	
	public void getstudentsdetails(int rn,String nm,char gr) {
		rollno = rn;
		name=nm;
		grade=gr;
	}
	
	
	
	public void display() {
		System.out.println("The student roll number is:- "+ rollno);
		System.out.println("The student name is:- "+ name);
		System.out.println("The student grade is:- "+ grade);
	}
}
