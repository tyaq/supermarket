package superMarket;

public class Person {
	String name;
	public Person(){
		double temp=Math.random()*10;
		name = temp +"";
	}
	
	public String getName(){
		return name;
	}
}
