package Method;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============Static========================");
		Other.sound();
		System.out.println("==============NonStatic========================");
        Other p=new Other();
        p.pattern();
	}

}
