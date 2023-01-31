package ThisSuper;

public class Demo1 extends Demo{
int a =20;   // global variable of child class
	

	public void test() {
		int a =30;     // local variable
		System.out.println(a);      // 30
		System.out.println(this.a);  // 20
		System.out.println(super.a); // 10
	}
	
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.test();
		
	}
}

