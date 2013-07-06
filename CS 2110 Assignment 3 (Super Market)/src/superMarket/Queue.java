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


}//end class Queue
