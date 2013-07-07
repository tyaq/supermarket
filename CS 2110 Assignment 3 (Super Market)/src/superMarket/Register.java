package superMarket;

import java.util.ArrayList;

public class Register extends Thread {
	private ArrayList<Object> q;
	private long serveSpeed;
	private static int slowestSpeed=2000;
	private static int fastestSpeed=500;
	public Register() {
		q = new ArrayList<Object>();
		serveSpeed=(long) (slowestSpeed*Math.random()+fastestSpeed);
	}//Constructor
	
	//Put into Queue Class
	public void enterLine(Person p){//someone enters the line
		q.add(p);
	}
	
	public void serve() {//Cashier serves first person
		if(!q.isEmpty()) {
			try {
				Thread.sleep(serveSpeed);
				System.out.println("Served in: "+ serveSpeed);
			} catch (InterruptedException e) {
				// TODO Tell me it went wrong
				e.printStackTrace();
			};
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
