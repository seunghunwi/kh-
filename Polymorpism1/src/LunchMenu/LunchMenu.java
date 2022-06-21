package LunchMenu;

public abstract class LunchMenu {
     static int rice;
     static int bulgogi;
     static int banana;
     static int milk;
     static int almond;
     
     public LunchMenu( int rice, int bulgogi, int banana, int milk, int almond) {
    	 this.rice = rice;
		 this.bulgogi = bulgogi;
		 this.banana = banana;
		 this.milk = milk;
		 this.almond = almond;
    	 
     }
     
     
     public abstract void lunchMenu();
}
