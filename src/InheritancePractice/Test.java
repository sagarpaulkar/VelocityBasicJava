package InheritancePractice;

public class Test {

	public static void main(String[] args) {
			
			Parent p = new Parent();     // object creation.
			p.m1();
			
			System.out.println("=========================================");
			
			Child c = new Child();  // object creation.
			c.m1();
			c.m2();
			
		}
}
