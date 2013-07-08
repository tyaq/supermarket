package superMarket;

public class Person {
        private String name;
        private int spotInLine;
        private static int personNumber=1;
        public Person(){
                name = "customer "+personNumber;
                personNumber++;
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
        public String toString(){
                return name;
        }
}
