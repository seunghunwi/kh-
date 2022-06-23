package Thread3;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		
		User1 user1 = new User1();
		user1.setClaculator(c);
	    user1.start();
	    
	    User2 user2 = new User2();
		user2.setClaculator(c);
	    user2.start();
		

	}

}
