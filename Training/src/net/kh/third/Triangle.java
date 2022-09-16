package net.kh.third;

public class Triangle extends Shape {

	@Override
	public double getArea() {
		System.out.println("Triangle 클래스 재정의 getArea()");
		return 8;
	}

}
