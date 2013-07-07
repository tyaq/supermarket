package superMarket;

public class Queue {

	private Node frontOfLine = null;
	private Node backOfLine = null;
	private int length = 0;
	
	public Queue(int z){
		
	}//Default Constructor

	public Queue(){
		this (0);
	}//Null Constructor
	
	public void enQ(Person p){//Puts person into back of queue
		
		Node n = new Node(p);
		p.setSpotInLine(n);
		if (isEmpty()) {//If the queue is empty 
			frontOfLine = n;
			n.setNext(null);//Set person in front
			backOfLine = n;
		}//Close if
		else{
			n.setNext(backOfLine);//Set person in front
		}
		//Set the prevNode of nextNode to this Node
		n.setPrev(null);//set person behind
		length++;
		
	}//end enQ
	
	public void quitQ(Person p){//remove a person from anywhere in line to place in another line
		Node n = p.getSpotInLine();
		n.getNext();
		n.getPrev();
	}//end leaveQ
	
	public void deQ(){//remove a person from front of line after being served
		
		
		
		
	}//end deQ
	
	public boolean isEmpty() {
		return frontOfLine == null;
	}

	public String toString() {
		String save = "[";
		for (Node n=frontOfLLine;n!=null && n.getNext() != null; n=n.getNext()){
			save += n + " , ";
		}//end for loop
		save += "]";
		return "Queue List:\n"+save+"\n"+"Length is: "+getLength()+"\n";
	}//end toString method

}//end class Queue
