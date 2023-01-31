package Method;

public class SNonS {
	public static void array() {
		int a []= {100,200,300,400,500,600};	
		System.out.println("Total number of rows in an array:- "+ a.length);
		
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	
	public void ifelse() {
		int age = 16;
		
		if(age>=18) {
			System.out.println(age+"="+"The user is allowed to open the facebook account.");
		}else {
			System.out.println(age+"="+"The user is not allowed to open the facebook account.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============Static========================");
		SNonS.array();
		
		
		System.out.println("==============NonStatic======================");
		SNonS ns=new SNonS();
		ns.ifelse();
	}

}
