package abstract1;

public class PhoneExample {
	
	public static void main(String[] args) {
		//Phone phone = new Phone();
		//추상클래스는 객체를 생성할 수 없다.
		//자식 클래스를 생성해 접근할 수 있다.
		
		SmartPhone sp = new SmartPhone("홍길동");
		
		sp.turnOn();     //1      1,2는 Phone의 메소드이다.
		sp.internetSearch(); //3   3은 SmartPhone의 메소드이다.
		sp.turnOff();    //2
		
	}

}

