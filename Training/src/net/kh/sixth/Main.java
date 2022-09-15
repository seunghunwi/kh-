package net.kh.sixth;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class Main {

	public static void main(String[] args) {
		/*
		 * 시작은 메인메소드
		 * 이유: 사람의 일생 -> 객체의 일생(시작, 사용, 끝)
		 * 프로그램 전체에서 시작 : main() 메소드
		 * 객체의 시작 : main() 
		 * -> new 연산자를 사용해서 객체를 생성
		 * -> 명령어가 실행되어 힙 메모리에 객체가 생성
		 */
 
		Monitor refMoniter = new Monitor();
		Keyboard refKeyboard = new Keyboard();
		Mouse refMouse = new Mouse();
		Board refBoard = new Board();
		
		
		
		// 컴퓨터 전체 객체를 생성: 매개변수가 있는 생성자를 선택
		Computer refComputer = new Computer(refMoniter, refKeyboard, refMouse, refBoard);
		  
		   
		//각각의 부품 클래스에서 만든 메소드 호출
		  refMoniter.method1();
		  refMouse.method2();
		  refBoard.method4();
		  refKeyboard.method3();
		  /*
		   * 각각의 부품 객체를 사용하는 방법
		   * 1.개별적인 부품 객체 하나하나를 사용
		   * 2. 전체 객체인 Coputer를 통해서 각각의 부품 객체에 접근(사용) 가능
		   *     - 문제점: 문
		   */
		 Keyboard refKeyboard2 = refComputer.getKeyboard();
		 Board refBoard2 = refComputer.getBoard();
		 Mouse refMouse2 = refComputer.getMouse();
		 Monitor refMonitor2 = refComputer.getMonitor();
		 
		 refBoard2.method4();
		 refMonitor2.method1();
		 refMouse2.method2();
		 refKeyboard2.method3();
		  
	}

}
