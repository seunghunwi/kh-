package Interface2;

public class Car {
     Tire[] t = { new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};



     void run() {
    	 for( Tire s : t) {
    		 s.roll();
    	 }
     }



}
