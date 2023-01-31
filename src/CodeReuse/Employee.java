package CodeReuse;

public class Employee {
	// Regular class ==> Business Logic Class
	
		int empid;
		String empname;
		double empsal;
	    int  empdept;
	    String empjob;
		
	    
	    public void display() {
	    	System.out.println(empid);
	    	System.out.println(empname);
	    	System.out.println(empsal);
	    	System.out.println(empdept);
	    	System.out.println(empjob);
	}
}
