
public class CarA {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(-50);
		
		System.out.println("현재속도 :" + car.getSpeed());
		
		
		car.setSpeed(60);
		
		
		
		if(car.isStop()) {
			car.setStop(true);
			
		}
		
		
		
	     System.out.println("현재속도"+car.getSpeed());
	     System.out.println(car.isStop());

	}

}
