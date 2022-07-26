package ParameterPolymorism;

public class Product1 {
	   int price;
	   int bonusPoint;
	}
	class TV extends Product1 {}
	class Conputer extends Product1{}
	class Audio extends Product1{}

	class Buyer { // 물건을 사는 사람
		 int money = 1000; //소유금액
		 int bonusPoint = 0; //보너스점수

		 void buy(Product p) {
			 money -= p.price;			
			 bonusPoint += p.bonusPoint;
	}
}
	
	
	
	
	