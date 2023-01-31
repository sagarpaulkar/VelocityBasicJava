package HomeWork;

public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I Love India";
		String [] Array=s.split(" ");
		
		for(int i=Array.length-1;i>=0;i--) {
			
			//System.out.print(Array[i]+" ");
		}
		
		System.out.println(s.replaceAll(s, "Sagar"));
	}

}
