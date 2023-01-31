package Method;

public class StaticKeywordExample {
	int empid;
	String empname;
	static String dept="QA";
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(dept);
	}
	
	
	public static void main(String[] args) {
		
		StaticKeywordExample sk1 = new StaticKeywordExample();    // object creation
		sk1.empid=101;
		sk1.empname="ABC";
		sk1.display();
		
		System.out.println("=======================================");
		
		StaticKeywordExample sk2 = new StaticKeywordExample();    // object creation
		sk2.empid=102;
		sk2.empname="pqr";
		sk2.display();
		
		dept="QC";
		// commonly you can change the value of an static variable.
		
		System.out.println("=======================================");
		StaticKeywordExample sk3 = new StaticKeywordExample();    // object creation
		sk3.empid=103;
		sk3.empname="lmn";
		sk3.display();
		
		System.out.println("=======================================");
		StaticKeywordExample sk4 = new StaticKeywordExample();    // object creation
		sk4.empid=104;
		sk4.empname="lmn";
		dept="QA";
		sk4.display();
		
		System.out.println("=======================================");
		StaticKeywordExample sk5 = new StaticKeywordExample();    // object creation
		sk4.empid=105;
		sk4.empname="xyz";
		sk4.display();
		
	}
}
