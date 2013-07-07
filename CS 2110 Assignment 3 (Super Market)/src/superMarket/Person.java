package superMarket;

public class Person {
	private String name;
	private Node spotInLine;
	public Person(){
		double temp=Math.random()*10;
		name = temp +"";
	}
	
	public String getName(){
		return name;
	}
	public void setSpotInLine(Node n){
		spotInLine = n;
	}
	public Node getSpotInLine(){
		return spotInLine;
	}
}
