package Method;

public class WithoutStatic {
	
	int canId;
	String canName;
	char canGrade;
	
	public void display() {
	System.out.println("Candidate id = "+canId);
	System.out.println("Candidate Name = "+canName);
	System.out.println("Candidate Grade = "+canGrade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WithoutStatic E=new WithoutStatic();
	System.out.println("===== Employee-1 Data =====");
	E.canId=1;
	E.canName="Sagar";
	E.canGrade='A';
	E.display();
	
	System.out.println("===== Employee-2 Data =====");
	E.canId=2;
	E.canName="Dharmesh";
	E.canGrade='B';
	E.display();
	System.out.println("===== Employee-3 Data =====");
	E.canId=3;
	E.canName="Deepak";
	E.canGrade='C';
	E.display();
	System.out.println("===== Employee-4 Data =====");
	E.canId=4;
	E.canName="Ajay";
	E.canGrade='A';
	E.display();
	System.out.println("===== Employee-5 Data =====");
	E.canId=5;
	E.canName="Anup";
	E.canGrade='C';
	E.display();
	}

}
