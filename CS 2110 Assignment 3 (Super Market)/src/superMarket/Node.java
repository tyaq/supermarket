package superMarket;

public class Node {
	String data;//just get a persons name
	Node next;
	Node previous;
	
	public Node(Person p){
		data=p.getName();
	}
	
	//Mutator Methods
	
	

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
