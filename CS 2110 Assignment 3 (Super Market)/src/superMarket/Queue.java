package superMarket;

public class Queue {

	Node header = null;
	
	public Queue(int z){
		
	}//Default Constructor

	public Queue(){
		this (0);
	}//Null Constructor
	
	public void enQ(Person p){//Puts person into back of queue
		
		
		
		
	}//end enQ
	
	public void leaveQ(Person p){//remove a person from anywhere in line to place in another line
		
		
		
		
	}//end leaveQ
	
	public void deQ(){//remove a person from front of line after being served
		
		
		
		
	}//end deQ
	

	public String toString() {
		String save = "[";
		for (Node n=header;n!=null && n.getNext() != null; n=n.getNext()){
			save += n + " , ";
		}//end for loop
		save += "]";
		return "Queue List:\n"+save+"\n"+"Length is: "+getLength()+"\n";
	}//end toString method

}//end class Queue
