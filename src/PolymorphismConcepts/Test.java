package PolymorphismConcepts;

public class Test {
public static void main(String[] args) {
		
		Parent p = new Parent();
		p.property();
		p.marriage();
		
		
		Child c = new Child();
		c.property();
		c.marriage();
	}
}
