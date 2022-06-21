package polymorism2;



public class ChileExaple {
	public static void method1(Parents parent) {
		if (parent instanceof Child) {
			Child Child = (Child)parent;
			System.out.println( "메소드1 자식으로 변환성공");
		}else {
			System.out.println("메소드1 자식으로 변환되지 않음");
		}

	}

	
	 public static void method2() {
		 Child c = (Child)Parent;
	 }
	public static void main(String[] args) {
              





	}



}
