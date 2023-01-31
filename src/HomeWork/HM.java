package HomeWork;

public class HM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=======Sum of values in array=====");
		int sum;
		
		int a[]=new int [3];
 
		a[0]=10;
		a[1]=20;
		a[2]=30;

 
		sum=a[0]+a[1]+a[2];
 
		System.out.println("The sum of values in array is :-"+sum);
		
		System.out.println("=======specific value in array======");
		
		
		for(int i=0;i<a.length;i++) {
			
		if (a[i]==30) {
			
			System.out.println(a[i]);
		}
		}
		
		System.out.println("=======specific string value in array=========");
		
		String req []=new String [3];
		req[0]="Sagar";
		req[1]="Akshay";
		req[2]="Nikita";
		
		String present="Akshay";
		
		
		for (int j=0;j<req.length;j++) {
			if (req[j]==present) {
				System.out.println(req[j]);
			}
		}
		
	}

}
