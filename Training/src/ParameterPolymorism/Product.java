package ParameterPolymorism;

public class Product {
   int price;
   int bonusPoint;
}
 //다형성을 고려하지 않은 코딩
//class TV extends Product {}
//class Conputer extends Product{}
//class Audio extends Product{}
//
//class Buyer { // 물건을 사는 사람
//	 int money = 1000; //소유금액
//	 int bonusPoint = 0; //보너스점수
//	 
//	 void buy(TV t) {
//		 money -= t.price;
//		 bonusPoint += t.bonusPoint;
//	 }
//	 void buy(Conputer c) {
//		 money -= c.price;
//		 bonusPoint += c.bonusPoint;
//	 }
//	 void buy(Audio a) {
//		 money -= a.price;
//		 bonusPoint += a.bonusPoint;
//	 }
//}


