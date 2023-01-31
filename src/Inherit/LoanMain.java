package Inherit;

public class LoanMain extends PLoan{
public static void main(String[] args) {
		
		// Ploan
		PLoan pl = new PLoan();
		pl.adharcardnumber();
		pl.pancardnumber();
		pl.applicantsname();
		pl.mobilenumber();
		pl.tenuure();
		
		System.out.println("===========================================");
		
		//Hloan
		HLoan hl = new HLoan();
		hl.adharcardnumber();
		hl.pancardnumber();
		hl.applicantsname();
		hl.mobilenumber();
		hl.tenuure();
		System.out.println("===========================================");
		
		// two wheerler loan
		
		VLoan vl2 = new VLoan();
		vl2.adharcardnumber();
		vl2.pancardnumber();
		vl2.applicantsname();
		vl2.mobilenumber();
		vl2.Twowheelertennure();
		System.out.println("===========================================");
		
		// four wheerler loan
		
		VLoan vl4 = new VLoan();
		vl4.adharcardnumber();
		vl4.pancardnumber();
		vl4.applicantsname();
		vl4.mobilenumber();
		vl4.Fourwheelertennure();
		
	}

}

