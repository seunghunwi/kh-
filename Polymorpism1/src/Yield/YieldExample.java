package Yield;

public class YieldExample {

	public static void main(String[] args) {
     ThreadA a = new ThreadA();
     ThreadB b = new ThreadB();
     a.start();
     b.start();
     
     
     try {Thread.sleep(3000);}catch(InterruptedException e) {}
     a.work = false;
     
     try {Thread.sleep(3000);}catch(InterruptedException e) {}
     a.work = true; 
     
     try {Thread.sleep(3000);}catch(InterruptedException e) {}
     a.work = true;
     b.work = true;
     
     
	}

}
