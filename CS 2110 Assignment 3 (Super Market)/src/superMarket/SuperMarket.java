package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		//Open four registers
		Register bob = new Register();
		Register dave = new Register();
		Register sam = new Register();
		Register tim = new Register();
		Feeder people = new Feeder(40);
		System.out.println(people);
		
	}//Close main method
	
}//Close super market class