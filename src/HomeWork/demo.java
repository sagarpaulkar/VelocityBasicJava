package HomeWork;

public class demo {

			int a;
			String str;
			int z;
			
			// constructor.
			
			demo(){
				System.out.println("This is zero argument constructor");
				a =10;
				str="velocity";
			}
			
			
			demo(int c,String d){
				System.out.println("This is two argument constructor");
				a =c;
				str=d;
			}
			
			demo(int c,int d){
				a=c;
				z=d;
			}

			public void test() {
				System.out.println(a);
				System.out.println(str);
			}
			
			public void test1() {
				System.out.println(a+z);
			}
			

}
