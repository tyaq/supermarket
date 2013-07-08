package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		//Open four registers
		Feeder people = new Feeder(10);
		System.out.println(people);
		Register bob = new Register();
		Register dave = new Register();
		Register tim = new Register();
		people.enQ();
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		
		
	}//Close main method
	
}//Close super market class