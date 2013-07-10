package superMarket;

public class Person implements Runnable {
        private String name;
        private int spotInLine;
        private Register register;
        private static int personNumber=1;
        public Person(){
                name = "customer "+personNumber;
                personNumber++;
                Thread t = new Thread(this);
                t.setName(name);
                t.start();
                
                
        }
        
        public void run(){
        	while(SuperMarket.getRunning()){
        		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
        		while(spotInLine != 1) {
        			leave();
        		}
        	}
        }
        
        public String getName(){
                return name;
        }
        public void setSpotInLine(int n){
                spotInLine = n;
        }
        public int getSpotInLine(){
                return spotInLine;
        }
        
        public void setRegister(Register r){
        	register=r;
        }
        
        
        public void leave(){
        	if(spotInLine!=0 & spotInLine!=1 & spotInLine>Register.getShortestLine().getLength()+1){
        		System.out.println(this+" left the Q");
        		register.leave(this);
        	}
        }
        public String toString(){
                return name;
        }
}
