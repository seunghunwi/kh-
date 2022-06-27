package MathRandom;

public class MathRandomExmaple {

	public static void main(String[] args) throws InterruptedException {
		int num = (int)(Math.random() *6) +1;
		Thread.sleep(3000); //게임을 한다면 긴장감을 주기 위해 출력시간을 부여함
		System.out.println("주사위 눈 :"+ num);

	}

}
