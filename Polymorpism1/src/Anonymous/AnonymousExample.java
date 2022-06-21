package Anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		
		//익명개체 필드 사용
		a.field.wake();
		
		//익명개체 로컯 변수 사용
		a.method1();
		
		//익명개체 매개값 사용
		a.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다");
				}
				
				@Override
				
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
					
				}
				
			
		}
			);
	}
}
