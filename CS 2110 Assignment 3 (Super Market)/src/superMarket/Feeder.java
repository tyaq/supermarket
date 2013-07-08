package superMarket;

import java.util.ArrayList;

public class Feeder implements Runnable {
	private ArrayList<Person> shoppers;
	Person p;
	boolean inital=true;
	public Feeder(int numberOfShoppers){
		shoppers = new ArrayList<Person>(numberOfShoppers);
		//n is a variable for the number of Player class objects that I want to create
		for(int i = 0; i < numberOfShoppers; i++) {

		    //this is what I can come up with but I am missing something 

		     p = new Person();
		     shoppers.add(p);
		}//end for
	}//end constructor
	
	public void run(){
		while(!shoppers.isEmpty()){
			enQ();
		}
	}
	
	public void enQ(){//put people in line if this is first time make lines even
		//put people in line based on how short it is
			while(!shoppers.isEmpty()){
				Register.setShortestLine();
				Register.getShortestLine().enQ(shoppers.get(0));
				shoppers.remove(0);
			}//end while
	}
	
	
	public String toString() {
		return shoppers.toString();
	}
}//end Feeder class
