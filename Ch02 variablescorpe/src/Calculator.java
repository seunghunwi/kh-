import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("실수를 입력해주세요 : ");
		double c = sc.nextDouble();

		Cla cc = new Cla();



		System.out.printf("합은 :%d%n빼기는  :%d%n곱은 :%d%n나눗셈은  :%d%n원의 둘레  :%f%n원의 넓이  :8%f%n",
				cc.add(b,a), cc.add1(b,a), cc.add2(b,a), cc.add3(b,a), cc.add4(c), cc.add5(c));


	}



}
