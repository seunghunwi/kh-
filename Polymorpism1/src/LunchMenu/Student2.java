package LunchMenu;

public class Student2 extends LunchMenu {

	 

		
	

	public Student2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lunchMenu() {
		System.out.println("Student1 식비는"+ (rice + bulgogi + milk + almond)  + "입니다.");
		
	}

}
