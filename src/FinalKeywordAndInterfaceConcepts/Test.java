package FinalKeywordAndInterfaceConcepts;

public class Test implements ABC{
	public void m1() {
		System.out.println(a);
	}

	 public void m2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
		t.m2();
	}
}
