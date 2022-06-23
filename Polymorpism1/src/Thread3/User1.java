package Thread3;

public class User1 extends Thread	{
	private Calculator c;
	
	
	public void setClaculator(Calculator calculator) {
		this.setName("User1");
		this.c = calculator;
		
		
	}
	
	
	public void run( ) {
		c.setMemory(100);
	}

}
