package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		//Open four registers
		Register bob = new Register();
		Register dave = new Register();
		Register tim = new Register();
		Feeder people = new Feeder(10);
		System.out.println(people);
		people.enQ();
		new Thread(bob).start();
		new Thread(dave).start();
		new Thread(tim).start();
		System.out.println(Thread.activeCount());
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		
		
	}//Close main method
	
}//Close super market class