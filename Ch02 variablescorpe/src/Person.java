import java.util.Scanner;

public class Person {

	static void corona(int birth) {
		
		 if(birth < 13 ||  birth >= 60) {
			System.out.println("무료 예방접종이 가능합니다");
		}else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}
	}	

	static void  ads(int age){
		 if(age >= 20 ) {
			System.out.println("대한민국 성인(20)세의 경우 무료료 2년마다 건강검진을 받을 수 있습니다.");
		}if( age >= 40) {
			System.out.println("40세 이상의 경우는 암검사도 무료료 검사를 할 수 있습니다.");
		}if(age  % 2 == 0) {
			System.out.println("태어난 해가 짝수년이므로 검사대상이 됩니다.");
		}		
	}


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("태어난해(년도)를 입력하세요 :");
		int yeras =2022;
		int year = yeras - sc.nextInt();
		corona(year);	 
		ads(year);

	}

}


