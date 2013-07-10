package superMarket;

import java.util.ArrayList;

public class Feeder implements Runnable {
	private ArrayList<Person> shoppers;
	private Person p;
	private boolean inital=true;
	private static Feeder theFeeder;
	
	public Feeder(int numberOfShoppers){
		shoppers = new ArrayList<Person>(numberOfShoppers);
		//creates the number of People class objects that user wants to create
		for(int i = 0; i < numberOfShoppers; i++) {

		     p = new Person();
		     shoppers.add(p);
		     theFeeder=this;
		}//end for
	}//end constructor
	
	public void run(){
		System.out.println("Feeder Thread Started");
		while(true){
			//System.out.println((!(Feeder.getTheFeeder().getShoppers().isEmpty())));
			//if (!(theFeeder.getShoppers().isEmpty())){
				enQ();
			//}
		}
	}
	
	
	public void enQ(){//put people in line if this is first time make lines even
		//put people in line based on how short it is
			while(!(shoppers.isEmpty())){
				Register.setShortestLine();
				Register.getShortestLine().enQ(shoppers.get(0));
				shoppers.remove(0);
			}//end while
	}
	
	public static Feeder getTheFeeder(){
		return theFeeder;
	}
	
	public ArrayList<Person> getShoppers(){
		return shoppers;
	}
	
	public String toString() {
		return shoppers.toString();
	}
}//end Feeder class
