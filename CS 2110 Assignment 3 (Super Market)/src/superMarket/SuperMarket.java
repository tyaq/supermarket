package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		//Open four registers
		Feeder people = new Feeder(40);
		System.out.println(people);
		Register bob = new Register();
		Register dave = new Register();
		people.enQ();
		people.enQ();
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		
		
	}//Close main method
	
}//Close super market class