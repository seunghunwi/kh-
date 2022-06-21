package Anonymous1;

public class Anonymous  {

	//필드 초기값으로 대입
	RemoteControl f = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	
	void method() {
		//로컬변수값으로 대입
		RemoteControl lf = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};
		
		//로컬변수 사용
		lf.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
	
}

