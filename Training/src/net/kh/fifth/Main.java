package net.kh.fifth;

public class Main {

	public static void main(String[] args) {
		Human refHuman = new Human();
		/*
		 * 객체를 재사용하지 않고 필요한 시점에 한 번만 사용
		 *   -익명객체
		 *   -형식 : 참조 변수에 선언하지 않고 매개변수에 바로 객체의 주소를 대입
		 *   - 메소드명(new 클래스명());
		 *   - 객체를 한 번만 사용
		 *     - 이유: 객체의 주소를 따로 참조 변수에게 대입하지 않기 때문.
		 */
		refHuman.eatbreakFast(new Food());
		refHuman.eatLunch(new Food());
		
		Food refFood = new Food();
		refFood.method();

	}

}
