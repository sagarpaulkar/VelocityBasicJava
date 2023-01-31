package HomeWork;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. to add the values in the array.
		
//		int ar [] = {10,20,30,50};
//		int sum =0;
//		
//		for(int i=0;i<ar.length;i++) {
//			sum=sum+ar[i];
//		}
//		System.out.println(sum);
		
		
		
		
		//2. To check the avibility of given number.
		
		int ar [] = {10,20,30,50,60,70};
		int k =40;
		boolean flag = false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==k) {
				flag=true;
			}
		}
		
		if(flag==true) {
			System.out.println("The element is present");
		}else {
			System.out.println("element is not present");
		}
	}

}
