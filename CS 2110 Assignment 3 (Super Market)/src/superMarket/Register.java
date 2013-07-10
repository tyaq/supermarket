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
	private String name;
	private static int personNumber=1;
	
	static{
		r=new ArrayList<Register>();
	}
	
	public Register() {
		q = new ArrayList<Person>();
		serveSpeed=(long) (slowestSpeed*Math.random()+fastestSpeed);
		shortestLine=this;
		r.add(this);
		name = "register "+personNumber;
        personNumber++;
        Thread t = new Thread(this);
        t.setName(name);
        t.start();
	}//Constructor
	
	public void run(){
		while (true){	
			while(!q.isEmpty()){
				deQ();
			}
		}
	}
	
	public static Register getShortestLine(){//allows for getting of shortest line
		return shortestLine;
	}
	
	//Put into Queue Class
	public void enQ(Person p){//someone enters the line
		q.add(p);
		p.setSpotInLine(length+1);
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

			} catch (InterruptedException e) {
				// TODO Tell me it went wrong
				e.printStackTrace();
			};
			q.remove(0);
			for(int i=0;i<q.size();i++){
				q.get(i).setSpotInLine(q.get(i).getSpotInLine()-1);
			}//end for
			if(!(q.size()==0 | q.size()==1)){
			System.out.println("\t"+q.get(q.size()-1)+" spot is: " +q.get(q.size()-1).getSpotInLine());
        	System.out.println("\tThe shortest line is: "+ Register.getShortestLine().getLength());}
			
			length--;
			setShortestLine();
		}
	}
	
	public void leave(Person p) {//Person leaves line
		p.setSpotInLine(0);
		q.remove(q.indexOf(p));
		length--;
		Feeder.getTheFeeder().getShoppers().add(p);
		System.out.println(p+" actully left the Q");
		System.out.println(Feeder.getTheFeeder().getShoppers());
		setShortestLine();
	}
	
	public int getLength() {//Accessory Method
		return q.size();
	}
	
	public synchronized static void setShortestLine(){//sets shortest line
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
