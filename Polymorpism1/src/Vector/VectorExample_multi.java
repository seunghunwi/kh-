package Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample_multi {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		
		class ThreadA extends Thread {
			public void run() {
				for(int i=0; i<1000; i++) {
				list.add(new Board("제목1","내용1","글쓴이1"));
			
				}
			}
		}

	 class ThreadB extends Thread {
		 public void run() {
				for(int i=0; i<1000; i++) {
				list.add(new Board("제목1","내용1","글쓴이1"));
				}
		 }
	 }
		 
	ThreadA threadA = new ThreadA();
	threadA.start();
	
	ThreadB treadB = new ThreadB();
	
	Thread mainThread = Thread.currentThread();
	
	try {mainThread.sleep(5000);} catch(Exception e) {} 
	
	for(int i=0; i<list.size(); i++) {
		Board board = list.get(i);
		System.out.println(board.subject + "%t" + board.content + "%t" + board.writer);
	}
	

}
}

