package AutomationPrograms;

public class ExceptionsPractice {

public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		// 1.  Arithmatic exception.
//		int a =100;
//		System.out.println(a/0);   // is this valid syntax
		
		// 2. Nullpointer Exception
		
//		String dept =null;
//		System.out.println(dept.length());
		
		// 3. Number format exception
//		String Count = "7095";
//		int i = Integer.parseInt(Count);
//		System.out.println(i);
		
		// 4. arrayoutofthebound exception.
//		int a []= new int [5];  /// valid syntax
//		a[10] =50;             /// valid syntax
		
		
		// HOw to handle the exception.
		int a =100;
		String Count = "7852";
	  

		try {
			// risky code
			System.out.println(a/2);
			int i = Integer.parseInt(Count);
		    System.out.println(i);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Wrong input provided by the user");
		}catch(Exception e1) {
			e1.printStackTrace();
			System.out.println("Generic catch block");
		}finally {  //1. exception will occur and it is handlled by catch block 2.exception will occur and it is not handlled by catch block 3. if exception does not occur
			System.out.println("Executing finally block");
		}
		
		
		System.out.println("Program Finished");
	}

}
