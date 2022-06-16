
public class CarExmple {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		for(int i=1; i<5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 8);
				break;
			case 2 :
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.fronRigntTire = new KumhoTire("앞오른쪽", 8);
				break;
			case 3 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.BackLeftTire = new HankookTire("뒤왼쪽", 8);
				break;
			case 4 :
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.BackRightTire = new KumhoTire("뒤오른쪽", 8);
				break;
				
			}
		}

	}

}
