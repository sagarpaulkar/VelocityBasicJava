package PolymorphismConcepts;

public class OverriddingMain {
public static void main(String[] args) {
		
		RBIBank r = new RBIBank();
		System.out.println(r.rateofintrest());
		
		SBI s = new SBI();
		System.out.println(s.rateofintrest());
		
		Hdfc h= new Hdfc();
		System.out.println(h.rateofintrest());
		
		ICICI i = new ICICI();
		System.out.println(i.rateofintrest());
	}
}
