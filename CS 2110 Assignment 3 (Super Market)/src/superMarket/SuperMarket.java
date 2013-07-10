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
		new Thread(people).start();
		System.out.println(Thread.activeCount());
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		Thread.sleep(6000);
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		System.exit(0);
		
	}//Close main method
	
}//Close super market class