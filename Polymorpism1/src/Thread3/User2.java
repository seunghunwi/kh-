package Thread3;

public class User2 extends Thread{
private Calculator c;
	
	
	public void setClaculator(Calculator calculator) {
		this.setName("User2");
		this.c = calculator;
		
		
	}
	
	
	public void run( ) {
		c.setMemory(50);
	}

}


