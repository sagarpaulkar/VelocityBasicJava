package ThisSuper;

public class ThisKeywordExample {
int a=10;      // global
	
	public void test() {
		int a =20;     // local 
		System.out.println(a);      // 20
		System.out.println(this.a);  // 10
	}

	public static void main(String[] args) {
		
		ThisKeywordExample tk = new ThisKeywordExample();
		tk.test();
	}
}
