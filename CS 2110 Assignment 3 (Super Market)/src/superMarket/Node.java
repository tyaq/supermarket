package superMarket;

public class Node {
	String data;//just get a persons name
	private Node next;
	private Node previous;
	
	public Node(Person p){
		data=p.getName();
	}
	
	//Mutator Methods
	public void setNext(Node fronter){
		next= fronter;
	}
	public void setPrev(Node backer){
		previous=backer;
	}
	

	//Accessory Methods
	
	public Node getNext(){
		return next;
	}
	
	public Node getPrev(){
		return previous;
	}
	
	public String getPerson(){
		return data;
	}	
	
}//Close node class
