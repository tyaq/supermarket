package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		//Open four registers
		Feeder people = new Feeder(2);
		Register bob = new Register();
		people.enQ();
		Register dave = new Register();
		people.enQ();
		Register sam = new Register();
		people.enQ();
		Register tim = new Register();
		people.enQ();
		System.out.println("feeder: "+people);
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register sam: "+sam);
		System.out.println("Register tim: "+tim);
		
		
	}//Close main method
	
}//Close super market class