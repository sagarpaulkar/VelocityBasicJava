package Method;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Cal cal = new Cal();       // object creation.
		
		System.out.println("Case1 :- Method is not accepting the parameters and not returning the values.");
				cal.sum1();
				cal.minus1();
				cal.mul1();
				cal.div1();
		System.out.println("Case2 :- Method is not accepting the parameters and returning the values.");
				int d=cal.sum2();
				int e=cal.minus2();
				int f=cal.mul2();
				int i=cal.div2();
				
				System.out.println(d+","+e+","+f+","+i);
				
				System.out.println(cal.sum2());
				System.out.println(cal.minus2());
				System.out.println(cal.mul2());
				System.out.println(cal.div2());
				
	System.out.println("Case3 :- Method is accepting the parameters and not returning the values.");
				
				cal.sum3(55,45);
				cal.sum3(30,30);
				cal.minus3(55,45);
				cal.minus3(30,30);
				cal.mul3(55,45);
				cal.mul3(30,30);
				cal.div3(55,45);
				cal.div3(30,30);
								
	System.out.println("Case4 :- Method is accepting the parameters and returning the values.");
				
				System.out.println(cal.sum4(10, 10));
				System.out.println(cal.sum4(15, 10));
				System.out.println(cal.minus4(10, 10));
				System.out.println(cal.minus4(15, 10));
				System.out.println(cal.mul4(10, 10));
				System.out.println(cal.mul4(15, 10));
				System.out.println(cal.div4(10, 10));
				System.out.println(cal.div4(15, 10));
				int j =cal.sum4(25, 25);
				int k =cal.minus4(25, 25);
				int l =cal.mul4(25, 25);
				int m =cal.div4(25, 25);
				System.out.println(j);
				System.out.println(k);
				System.out.println(l);
				System.out.println(m);
	}

}
