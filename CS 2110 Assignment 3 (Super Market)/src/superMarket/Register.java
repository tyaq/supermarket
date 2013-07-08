package superMarket;

import java.util.ArrayList;

public class Register implements Runnable {
	private ArrayList<Person> q;
	private long serveSpeed;
	private static int slowestSpeed=2000;
	private static int fastestSpeed=500;
	private int length=0;
	private static Register shortestLine=null;
	private static ArrayList<Register> r;
	
	static{
		r=new ArrayList<Register>();
	}
	
	public Register() {
		q = new ArrayList<Person>();
		serveSpeed=(long) (slowestSpeed*Math.random()+fastestSpeed);
		shortestLine=this;
		r.add(this);
	}//Constructor
	
	public void run(){
		while(!q.isEmpty()){
			deQ();
		}
	}
	
	public static Register getShortestLine(){//allows for getting of shortest line
		return shortestLine;
	}
	
	//Put into Queue Class
	public void enQ(Person p){//someone enters the line
		q.add(p);
		p.setSpotInLine(length);
		p.setRegister(this);
		length++;
		setShortestLine();
	}
	
	public void deQ() {//Cashier serves first person
		if(!q.isEmpty()) {
			try {
				Thread.sleep(serveSpeed);
				System.out.print(q.get(0)+ " Served in: ");
				System.out.println(String.format("%.2f", ((double) serveSpeed/1000)) +"s");
	        	System.out.println("\t"+q.get(q.size()-1)+" spot is: " +q.get(q.size()-1).getSpotInLine());
	        	System.out.println("\tThe shortest line is: "+ Register.getShortestLine().getLength());
			} catch (InterruptedException e) {
				// TODO Tell me it went wrong
				e.printStackTrace();
			};
			q.get(0).setSpotInLine(0);
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
	
	public static void setShortestLine(){//sets shortest line
		//if (q.size()<shortestLine.getLength()) {shortestLine=this;};
		for (int i=0;i<r.size();i++){
			if(r.get(i).getLength()<shortestLine.getLength()){
				shortestLine=r.get(i);
			}
		}
	}
	
	public String toString(){
		return q.toString();
	}
}
