package superMarket;

public class SuperMarket {
	public static void main(String args[]) throws Exception {
		Queue q = new Queue();
		Person p = new Person();
		Person r = new Person();
		Person w = new Person();
		Person e = new Person();
		Person y = new Person();
		Person t = new Person();
		q.join(p);
		System.out.println(q.toString());
		q.join(r);
		System.out.println(q);
		q.join(w);
		q.join(e);
		q.join(y);
		q.join(t);
		System.out.println("Current: "+q.getCurrent());
		System.out.println("Header: "+q.getHeader());
		System.out.println("after six people: "+q);
		q.leave();
		System.out.println(q.getCurrent());
		System.out.println("Current: "+q.getCurrent());
		System.out.println("Header: "+q.getHeader());
		System.out.println("after leave: "+q);
		
	}//Close main method
	
}//Close super market class