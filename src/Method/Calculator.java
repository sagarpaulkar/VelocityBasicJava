package Method;

public class Calculator {
	public int getsum(int num1,int num2) {
		return num1+num2;
	}
	
	public int getsubstraction(int num1,int num2) {
		return num1-num2;
	}
	
	public int getmultiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public int getdivision(int num1, int num2) {
		return num1/num2;
	}
	
	public int getsumthree(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	
	public double getsumdecimal(double num1,float num2) {
		return num1+num2;
	}
	
	public double getmixsum(double num1, int num2) {
		return (num1+num2);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();    // object creation
		System.out.println(cal.getsum(25, 50));
		System.out.println(cal.getsubstraction(50, 25));
		System.out.println(cal.getmultiplication(25, 2));
		System.out.println(cal.getdivision(50, 25));
		System.out.println(cal.getsum(50, 50));
		System.out.println(cal.getsum(75, 75));
		System.out.println(cal.getsumthree(50, 50, 50));
		System.out.println(cal.getsumdecimal(50.555555, 75.55f));
		System.out.println(cal.getmixsum(50.3589, 50));
		
		
		
	}
}
