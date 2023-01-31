package Method;

public class MethodExample {
	static int a =20;     // static variable
	int b=10;             // non static variable.
	
	
	
	public static void m1() {
		System.out.println("This is static method m1");
	}    // static method

	
	public void m2() {
		System.out.println("This is non static method m2");
	}
	
	
	public void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}  // non static
	
	
	
	
	
	public static void main(String[] args) {
		
		// 1. Static methods can access static members (variable/method) directly.
		
		System.out.println(a);
		m1();
		
		
		//2. Static methods can also access the non static members but with the refrence of object.
		
		MethodExample me =new MethodExample();
		
		System.out.println(me.b);
		me.m2();
		
		System.out.println("============================================================");
		
		// 3. Non Static methods can access both static and non static members directly.
		me.m3();
	}
	
	
}
