package superMarket;

public class Person implements Runnable {
        private String name;
        private int spotInLine;
        private Register register;
        private static int personNumber=1;
        public Person(){
                name = "customer "+personNumber;
                personNumber++;
                new Thread(this).start();;
        }
        
        public void run(){
        	while(spotInLine != 1) {
        		leave();
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
        	if(spotInLine==0 & spotInLine>Register.getShortestLine().getLength()){
        		register.leave(this);
        	}
        }
        public String toString(){
                return name;
        }
}
