package superMarket;

import java.util.ArrayList;

public class Register extends Thread {
	private ArrayList<Object> q;
	private long serveSpeed;
	private static int slowestSpeed=2000;
	private static int fastestSpeed=500;
	private int length=0;
	private static Register shortestLine=null;
	
	public Register() {
		q = new ArrayList<Object>();
		serveSpeed=(long) (slowestSpeed*Math.random()+fastestSpeed);
		shortestLine=this;
		new Thread().start();
	}//Constructor
	
	public void run(){
		deQ();
	}
	
	public static Register getShortestLine(){//allows for getting of shortest line
		return shortestLine;
	}
	
	//Put into Queue Class
	public void enQ(Person p){//someone enters the line
		q.add(p);
		length++;
		setShortestLine();
	}
	
	public void deQ() {//Cashier serves first person
		if(!q.isEmpty()) {
			try {
				Thread.sleep(serveSpeed);
				System.out.println("Served in: "+ serveSpeed);
			} catch (InterruptedException e) {
				// TODO Tell me it went wrong
				e.printStackTrace();
			};
			q.remove(0);
			length--;
			setShortestLine();
		}
	}
	
	public void leave(Person p) {//Person leaves line
		q.remove(q.indexOf(p));
		length--;
		setShortestLine();
	}
	
	public int getLength() {//Accessory Method
		return length;
	}
	
	public void setShortestLine(){//sets shortest line
		if (length<shortestLine.getLength()) shortestLine=this;
	}
	
	public String toString(){
		return q.toString();
	}
}
