package net.kh.fifth;

public class Human {
   public void eatbreakFast(Food refFood ) {
	   System.out.println("아침에 식사를 합니다.");
	   refFood.method();
   }
   public void eatLunch(Food refFood) {
	   System.out.println("점심에 식사를 합니다.");
	   refFood.method();
   }
}
