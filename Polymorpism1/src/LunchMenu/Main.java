package LunchMenu;

public class Main {

	public static void main(String[] args) {
		LunchMenu sp1 = new Student1(LunchMenu.rice, LunchMenu.bulgogi, LunchMenu.banana, LunchMenu.milk,LunchMenu.almond);
		LunchMenu sp2 = new Student2(LunchMenu.rice, LunchMenu.bulgogi, LunchMenu.banana, LunchMenu.milk,LunchMenu.almond);
		 sp1.lunchMenu();
		 sp2.lunchMenu();
	 

 }
}