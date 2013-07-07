package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		Register bob = new Register();
		Person p = new Person();
		Person r = new Person();
		Person w = new Person();
		Person e = new Person();
		Person y = new Person();
		Person t = new Person();
		bob.enterLine(p);
		System.out.println(bob.toString());
		bob.enterLine(r);
		System.out.println(bob);
		bob.enterLine(w);
		bob.enterLine(e);
		bob.enterLine(y);
		bob.enterLine(t);
		System.out.println("after six people: "+bob);
		bob.serve();
		System.out.println("after serveing: "+bob);
		bob.leave(y);
		System.out.println("after leave: "+bob);
		
	}//Close main method
	
}//Close super market class