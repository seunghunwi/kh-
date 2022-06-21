package Interface2;

public class CarExample {

	public static void main(String[] args) {
		Car c = new Car();
		
		
		c.run();
		
		c.t[0] = new KumhoTire();
		c.t[1] = new KumhoTire();
		
		c.run();
		

	}

}
