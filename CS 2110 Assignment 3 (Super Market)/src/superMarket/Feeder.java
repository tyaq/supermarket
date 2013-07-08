package superMarket;

import java.util.ArrayList;

public class Feeder {
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
	
	
	public void enQ(){//put people in line if this is first time make lines even
		ArrayList<Register> r=Register.getRegisterList();
		//put people in line based on how short it is
			while(!shoppers.isEmpty()){
			if(shoppers.get(0).getSpotInLine()>Register.getShortestLine().getLength()){
				Register.getShortestLine().enQ(shoppers.get(0));
				shoppers.remove(0);}//end if
			else if (shoppers.get(0).getSpotInLine()==0){
				Register.getShortestLine();
			}
			}//end while
	}
	
	
	public String toString() {
		return shoppers.toString();
	}
}//end Feeder class
