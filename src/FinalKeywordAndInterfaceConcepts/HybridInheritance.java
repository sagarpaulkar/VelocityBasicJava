package FinalKeywordAndInterfaceConcepts;

public class HybridInheritance extends A implements B1,B2{
	public void m2() {
		System.out.println("This is the method from the interface B1");
	}

	public void m3() {
		System.out.println("This is the method from the interface B2");
	}
	

	public static void main(String[] args) {
		
		HybridInheritance hi = new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();
		
	}
}
