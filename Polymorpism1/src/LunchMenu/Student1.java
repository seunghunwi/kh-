package LunchMenu;

public class Student1  extends LunchMenu{

	public Student1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lunchMenu() {
		
		System.out.println("Student1 식비는"+ (rice+ bulgogi + banana) + "입니다.");
		
		
	}
	
	 
	
	

}
