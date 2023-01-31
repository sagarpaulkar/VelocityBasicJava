package CastingExamples;

public class Test {
public static void main(String[] args) {
		
		// creating the object of parent class
		Father f = new Father();
		
		f.home();
		f.money();
		f.car();
		System.out.println("===================================================");
		// creating the object of child class
		
		Child c = new Child();
		
		c.bike();
		c.home();
		c.money();
		c.car();
		
		System.out.println("===================================================");
		
		// upcasting :- assign subclass properties to superclass
		
		Father f1 = new Child();
		
		f1.car();
		f1.home();
		f1.money();
		System.out.println("===================================================");
		
		// downcasting :- assigin superclass properties to subclass. ==> not supported by java.
		
		Child c1 = (Child) new Father();
		
		c1.bike();
		c1.car();
		c1.home();
		c1.money();
				
	}
}
