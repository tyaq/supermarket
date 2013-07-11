package superMarket;

public class SuperMarket {
	static boolean running =true;
	static int peopleServed = 0;
	public static void main(String args[]) throws Exception {
		long start=System.nanoTime();
		//Open four registers
		Register bob = new Register();
		Register dave = new Register();
		Register tim = new Register();
		//Change this arg
		Feeder people = new Feeder(10);
		System.out.println(people);
		people.enQ();
		new Thread(people).start();
		System.out.println(Thread.activeCount());
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		while (running){
			//Make this arg equal to the previous one
			if(peopleServed>=10) setRunning(false);
		}
		long end = System.nanoTime();
		System.out.println("It took "+ ((end-start)/1000000000)+" Seconds");
		System.out.println("Register bob: "+bob);
		System.out.println("Register dave: "+dave);
		System.out.println("Register tim: "+tim);
		System.out.println("Feeder: "+Feeder.getTheFeeder().getShoppers());
		System.exit(0);
		
	}//Close main method
	
	public static int getPeopleServed(){
		return peopleServed;
	}
	
	public static void served(){
		peopleServed++;
	}
	
	public static boolean getRunning(){
		return running;
	}
	
	public static void setRunning(Boolean run){
		running=run;
	}
}//Close super market class