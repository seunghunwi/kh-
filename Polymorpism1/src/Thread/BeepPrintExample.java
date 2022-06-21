package Thread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
	Runnable bt = new BeepTask();
	Thread t = new Thread(bt);
	
	
	t.start();
	
	for(int i=0; i<5; i++) {
		System.out.println("띵");
		try {Thread.sleep(500);} catch(Exception e) {}
	}

}
}