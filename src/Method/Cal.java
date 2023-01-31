package Method;

public class Cal {
	int x =20;
	int y =10;
	
	// Case1 :- Method is not accepting the parameters and not returning the values.

		public void sum1() {
		System.out.println(x+y);
		}
		public void minus1() {
		System.out.println(x-y);	
		}
		public void mul1() {
		System.out.println(x*y);	
		}
		public void div1() {
		System.out.println(x/y);	
		}

	// Case2 :- Method is not accepting the parameters and returning the values.
	
		public int sum2() {
		return (x+y);
		}
		
		public int minus2() {
		return (x-y);
		}
		public int mul2() {
		return (x*y);
		}
		public int div2() {
		return (x/y);
		}
	
	// Case3 :- Method is accepting the parameters and not returning the values.
	
	public void sum3(int a,int b) {
		System.out.println(a+b);
	}
	
	public void minus3(int a,int b) {
		System.out.println(a-b);
	}
	public void mul3(int a,int b) {
		System.out.println(a*b);
	}
	public void div3(int a,int b) {
		System.out.println(a/b);
	}
	
	// Case4 :- Method is accepting the parameters and returning the values.
	
	public int sum4(int a, int b) {
		return a+b;
}
	public int minus4(int a, int b) {
		return a-b;
}
	public int mul4(int a, int b) {
		return a*b;
}
	public int div4(int a, int b) {
		return a/b;
}
}
