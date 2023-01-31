package HomeWork;

public class Multidimentional {

	public static void main(String [] args) {
		int a [] []= new int [3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;		
		
		a[1][0] = 300;
		a[1][1] = 400;	
		
		a[2][0] = 500;
		a[2][1] = 600;	
		
		
		System.out.println("Total number of rows in an array:- "+ a.length);
		System.out.println("Total number of columns in an array:- "+ a[0].length);
		
		
		for (int i=0; i<3;i++) {
			for (int j=0; j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}