package superMarket;

public class Person {
	private String name;
	private Node spotInLine;
	public Person(){
		Double temp=(Math.random()*10);
		name = String.format("%.2f", temp);
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
	public String toString(){
		return name;
	}
}
