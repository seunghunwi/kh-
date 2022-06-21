package Anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
			
		}
		
		@Override 
	void wake() {
			System.out.println("6시에 일어납니다.");
			work();
			
		}
	};
	
	void method1() {
		//로컬변수값으로 대입
		Person locarVar = new Person() {
			void work() {
				System.out.println("산책합니다.");
				
			}
			
			@Override 
		void wake() {
				System.out.println("7시에 일어납니다.");
				work();
				
			}
		
		};
	
		//로컬변수 사용
		locarVar.wake();
		

}
	void method2(Person person) {
     person.wake();  		
	}

}
