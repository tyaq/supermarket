package superMarket;

import java.util.ArrayList;

public class Register {
	private ArrayList<Object> q;
	public Register() {
		q = new ArrayList<Object>();
	}//Constructor
	
	//Put into Queue Class
	public void enterLine(Person p){//someone enters the line
		q.add(p);
	}
	
	public void serve() {//Cashier serves first person
		if(!q.isEmpty()) {
			q.remove(0);
		}
	}
	
	public void leave(Person p) {//Person leaves line
		q.remove(q.indexOf(p));
	}
	
	public String toString(){
		return q.toString();
	}
}
