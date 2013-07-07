package superMarket;

import java.util.ArrayList;

public class Feeder {
	private ArrayList<Person> shoppers;
	public Feeder(int numberOfShoppers){
		//n is a variable for the number of Player class objects that I want to create
		for(int i = 0; i < numberOfShoppers; i++) {

		    //this is what I can come up with but I am missing something 

		     Person p = new Person();
		     shoppers.add(p);
		}//end for
	}//end constructor
	
	public String toString() {
		return shoppers.toString();
	}
}//end Feeder class
