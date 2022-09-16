package net.kh.third;

public class Main {

	public static void main(String[] args) {
		Circle refCircle = new Circle();
		double area = refCircle.getArea();
		System.out.println("원의 넓이 : "+ area);
		
		Rectangle refRectangle = new Rectangle();
		double area2 = refRectangle.getArea();
		System.out.println("사각형의 넓이 :" + area2);
		
		
		Triangle refTriangle = new Triangle();
		double area3 = refTriangle.getArea();
		System.out.println("삼각형의 넓이 : " + area3);

	}

}
