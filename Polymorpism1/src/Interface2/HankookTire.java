package Interface2;

public class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다."); 
		// Tire 인터페이스를 받아 roll()이라는 메서드(책임)을 구현했다.
	}
}


