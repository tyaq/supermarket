package superMarket;

import java.util.ArrayList;

public class Register implements Runnable {
	private ArrayList<Object> q;
	private long serveSpeed;
	private static int slowestSpeed=2000;
	private static int fastestSpeed=500;
	private int length=0;
	private static Register shortestLine=null;
	private static ArrayList<Register> r;
	
	static{r=new ArrayList<Register>();}
	
	public Register() {
		q = new ArrayList<Object>();
		serveSpeed=(long) (slowestSpeed*Math.random()+fastestSpeed);
		shortestLine=this;
		r.add(this);
		new Thread().start();
	}//Constructor
	
	public void run(){
		while(!q.isEmpty()){
			deQ();
		}//end while
	}
	
	public static ArrayList<Register> getRegisterList(){
		return r;
	}
	
	public static Register getShortestLine(){//allows for getting of shortest line
		return shortestLine;
	}
	
	//Put into Queue Class
	public void enQ(Person p){//someone enters the line
		q.add(p);
		p.setSpotInLine(length);
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
		setShortestLine();
	}
	
	public int getLength() {//Accessory Method
		return q.size();
	}
	
	public void setShortestLine(){//sets shortest line
		if (q.size()<shortestLine.getLength()) shortestLine=this;
	}
	
	public String toString(){
		return q.toString();
	}
}
