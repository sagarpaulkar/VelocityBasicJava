package CastingExamples;

public class ImplicitCastingPractice {
public static void main(String[] args) {
		
		byte b = 50;
		short s =b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		
		System.out.println("Byte value is:- "+b);
		System.out.println("Short value is:- "+s);
		System.out.println("int value is:- "+i);
		System.out.println("long value is:- "+l);
		System.out.println("float value is:- "+f);
		System.out.println("double value is:- "+d);
		
		
		// byte ==> short ==> int ==> long ==> float ==> double
		
	}
}
