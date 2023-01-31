package PolymorphismConcepts;

public class MainMethodOverloadingConcept {
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main (int x, int y) {
		System.out.println(x+y);
	}
	
	public static void main (int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	
	public static void main(String[] args) {
		
		MainMethodOverloadingConcept.main(25, 25, 25);
		
		MainMethodOverloadingConcept m = new MainMethodOverloadingConcept();
		m.main(25);
		m.main(25, 25);
		
	}
}
