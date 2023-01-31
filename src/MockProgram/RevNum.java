package MockProgram;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12340, result=0;
		
		while(num!=0) {
			
			int remainder = num%10;
			result=result*10+remainder;
			num=num/10;
			
			
		}
		
		System.out.println("Reverse"+result);
		
	}

}
