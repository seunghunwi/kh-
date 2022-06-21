package Anonymous1;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		//익명객체 필드 사용
		a.f.turnOn();
		//익명개체 로컬변수 사용
		a.method();
		//익명개체 매개값 사용
		a.method2(
				new RemoteControl() {
					public void turnOn() {
						System.out.println("Smart tv를 켭니다");
					}
					@Override
					public void turnOff() {
						System.out.println("Smart tv를 끕니다.");
						
					}
					
				});

	}

}
