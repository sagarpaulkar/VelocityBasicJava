package PolymorphismConcepts;

public class OverloadingExample {
	// add two numbers
	
		public void sum(int a, int b) {
			System.out.println(a+b);
		}

		public void sum(int a, double b) {
			System.out.println(a+b);
		}
		
		public void sum(double a, double b) {
			System.out.println(a+b);
		}
		
		public void sum(double a, int b) {
			System.out.println(a+b);
		}
		
		public void sum (int a, int b, int c) {
			System.out.println(a+b+c);
		}
		
		public void sum (int a, int b, double c) {
			System.out.println(a+b+c);
		}
		
		public static void main(String[] args) {
			
			OverloadingExample oe = new OverloadingExample();
			oe.sum(10, 10);
			oe.sum(10, 10.50);
			oe.sum(20.5, 20.5);
			oe.sum(15, -15, 15);
		}
}
