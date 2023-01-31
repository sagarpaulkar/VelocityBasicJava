package Method;

public class Demo {

		// 2 static methods   // 2 non static methods.
		
		// 1. Methods calling from the same class. (Regular methods and main method is in same class)
		
		public static void test1() {
			System.out.println("This is static method 1");
		}
		
		public static void test2() {
			System.out.println("This is static method 2");
		}

		public void test3() {
			System.out.println("This is non static method 1");
		}
		
		public void test4() {
			System.out.println("This is non static method 2");
		}
		
		
		public static void main(String[] args) {
			
			// Calling static method
			
			Demo.test1();
			Demo.test2();
			
			// Calling non static methods.
			
			Demo d = new Demo();  // object creation
			
			d.test3();
			d.test4();
			
			// static method within same class can be called directly.
			
			test1();
			test2();
		}

	
	}


