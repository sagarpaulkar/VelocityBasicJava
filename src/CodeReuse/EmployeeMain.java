package CodeReuse;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Main Class  ==> Approach :- Regular method and main method are in different class.
		
		 		
		    	Employee emp1 = new Employee();   // object create ==> copy of the class
		    	emp1.empid=101;
		    	emp1.empname="ABC";
		    	emp1.empsal=1001.50;
		    	emp1.empdept=05;
		    	emp1.empjob="Devloper";
		    	emp1.display();
		    	
		    	System.out.println("=======================================================");
		    	
		    	Employee emp2 = new Employee();   // object create ==> copy of the class
		    	emp2.empid=102;
		    	emp2.empname="DEF";
		    	emp2.empsal=1111.50;
		    	emp2.empdept=06;
		    	emp2.empjob="Tester";
		    	emp2.display();
		    	
		    	
		    	System.out.println("=======================================================");
		    	
		    	Employee emp3 = new Employee();   // object create ==> copy of the class
		    	emp3.empid=103;
		    	emp3.empname="PQR";
		    	emp3.empsal=2111.50;
		    	emp3.empdept=04;
		    	emp3.empjob="Manager";
		    	emp3.display();
		    	
		    	System.out.println("=======================================================");
		    	
		    	Employee emp4 = new Employee();   // object create ==> copy of the class
		    	emp4.empid=104;
		    	emp4.empname="LMN";
		    	emp4.empsal=5111.50;
		    	emp4.empdept=03;
		    	emp4.empjob="Sr.Manager";
		    	emp4.display();
		    	
			}
	}


