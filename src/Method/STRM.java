package Method;

public class STRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		STR s=new STR();
		String C=s.st("Sagar", "Paulkar");
		
		StringBuilder sb=new StringBuilder();
		sb.append(C);		
		System.out.println(sb.reverse());

	}
	}
