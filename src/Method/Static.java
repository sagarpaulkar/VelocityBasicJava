package Method;

public class Static {
	int canId;
	String canName;
	static char canGrade='A';
	
	public void display() {
	System.out.println("Candidate id = "+canId);
	System.out.println("Candidate Name = "+canName);
	System.out.println("Candidate Grade = "+canGrade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static E=new Static();
		System.out.println("===== Employee-1 Data =====");
		E.canId=1;
		E.canName="Sagar";
		E.display();
		
		System.out.println("===== Employee-2 Data =====");
		E.canId=2;
		E.canName="Dharmesh";
		E.display();
		
		canGrade='C';
		System.out.println("===== Employee-3 Data =====");
		E.canId=3;
		E.canName="Deepak";
		E.display();
		
		System.out.println("===== Employee-4 Data =====");
		E.canId=4;
		E.canName="Ajay";
		canGrade='A';
		E.display();
		
		System.out.println("===== Employee-5 Data =====");
		E.canId=5;
		E.canName="Anup";
		E.display();
		
}
}
