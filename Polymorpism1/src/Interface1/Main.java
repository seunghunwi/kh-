package Interface1;

public class Main {

	public static void main(String[] args) {
		Aphone a = new Aphone();
		System.out.println("A Phone");
	
		a.call();
		a.callSpeed();
		a.remoteContol();
		System.out.println("===================");
		
		Bphone b = new Bphone();
		System.out.println("B Phone");
		b.call();
		b.callSpeed();
		b.remoteContol();
		System.out.println("===================");
		
		CPhone c = new CPhone();
		System.out.println("C Phone");
		c.call();
		c.callSpeed();
		c.remoteContol();
		System.out.println("===================");
	}

}
