package superMarket;

public class Queue {
	String h="hello";
private Node header,current;
private int length;

public void join (Person p) throws BadInsertionPoint {
	if (curretn == null) throw new BadInsertionPoint();
	Node temp == new Node (p,current.getNext());
	current.setNext(temp);
	length++;
}//end join method

public void leave() {
	if (!isEmpty() && inList()){
		getPrevious ().setNext (current.getNext());
		length--;
	}//end if
	else System.out.println("Sorry, list is empty.");
}// end leave method

private Node getPrevious () {
	for (Node n=header;n!=null && n.getNext() != null; n=n.getNext()){
		if(n.getNext() == current) {return n;}//close if loop
		return null;
	}//end for loop
		
}// this return is only reached if no 'previous' was found

public void setCurrent ( Person p ) { // sets ‘current’ to point to where p is
	for ( current = header ; current != null ; current = current . getNext( ) )
		if ( current.getData ( ).equals ( p ) ) return ; 
}//close setCurrent mutator method

public boolean inList ( ) {
	return ( current != null && current != header ) ; 
}

public int getLength ( ) {
	return this . length ; 
}//accessory method

public boolean isFull ( ) {
	return false ; 
}//This can never be full!

public boolean isEmpty ( ) { 
	return ( length == 0 ) ; 
}//Returns true if queue list is empty

public Queue ( int n ) {
	header = new Node ( ) ;
	current = header; length = 0 ; 
}
public Queue () {
	this (0);
}//Null Constructor

}//end class Queue
