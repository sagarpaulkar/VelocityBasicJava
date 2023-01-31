package PolymorphismConcepts;

public class MethodOverloadingExample {
			
		// Non static nature ==> Static
		
		public static void sum () {
			System.out.println("This is the method with zero argument");
		}
		
		public static void sum(int a) {
			System.out.println("This is static method with one arugument:- "+ a);
		}
		
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
			
			
			MethodOverloadingExample.sum(15);
			MethodOverloadingExample.sum();
		
			MethodOverloadingExample oe = new MethodOverloadingExample();
			oe.sum(10, 10);
			oe.sum(10, 10.50);
			oe.sum(20.5, 20.5);
			oe.sum(15, -15, 15);
		}
}
