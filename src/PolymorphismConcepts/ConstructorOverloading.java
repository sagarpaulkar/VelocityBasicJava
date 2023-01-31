package PolymorphismConcepts;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("This is zero argumented constructor");
	}

	ConstructorOverloading(int a){
		System.out.println("This is one argumented constructor");
	}
	
	ConstructorOverloading(int a, int b){
		System.out.println("This is int int type constructor");
	}
	
	ConstructorOverloading(int a, double b){
		System.out.println("This is int double type constructor");
	}
	
	ConstructorOverloading(double a, int b){
		System.out.println("This is double int type constructor");
	}
	
	ConstructorOverloading(double a, double b){
		System.out.println("This is double double type constructor");
	}
	
	ConstructorOverloading(int a, int b, int c){
		System.out.println("This is int int int type constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading ol = new ConstructorOverloading(5);
		ConstructorOverloading ol1 = new ConstructorOverloading(15,15.5);
	}
}
