package net.kh.sixth;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class Computer {
	private Monitor monitor;
	private Mouse mouse;
	private Keyboard keyboard;
	private Board board;
	 /*
	  * 기본 생성자를 정의(상속을 위한 메소드)
	  */
	 public Computer() {
		 
	 }
	/*
	  * 매개변수를 갖는 생성자를 정의
	  *     -클래스 외부로부터 4개의 컴퓨터 부품 객체의 주소를 입력 받음
	  */
	 public Computer(Monitor monitor , Keyboard keyboard, Mouse mouse, Board board) {
		 this.board = board;
		 this.keyboard = keyboard;
		 this.monitor = monitor;
		 this.mouse = mouse;
		 
	 }
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
}
