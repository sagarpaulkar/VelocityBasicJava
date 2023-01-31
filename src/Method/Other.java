package Method;

public class Other {
	public static void sound() {
		
		
		String animal ="cheeth";
		if(animal == "dog") {
			System.out.println("sound of barking of dog");
		}else {
			System.out.println("Any other animal's sound");
		}
	}
	
	public void pattern() {

		for(int i=1; i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
