package CastingExamples;

public class ExplicitCastingExample {
public static void main(String[] args) {
		
		double d = 14.25897745639;
		float f =(float) d;
		long l = (long) f;
		int i = (int) l;
		short s =(short) i;
		byte b = (byte) s;
		
		
		System.out.println("double value is:- "+d);
		System.out.println("float value is:- "+f);
		System.out.println("long value is:- "+l);
		System.out.println("int value is:- "+i);
		System.out.println("Short value is:- "+s);
		System.out.println("Byte value is:- "+b);
		
		
		// Generally we will not recommend this.==> loss of information
	}
}
