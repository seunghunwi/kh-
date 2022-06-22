package Animal;

public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.sound();
		d.breathe();
		c.sound();
		c.breathe();
		System.out.println("-------");
		
		
		//변수의 자동 타입 변환
	    Animal a = null;
	    a = new Dog();
	    a.sound();
	    a.breathe();
	    a = new Cat();
	    a.sound();
	    a.breathe();
	    System.out.println("-------");
	    
	    
	    //메소드의 다형성
	    animalSound(new Dog());
	    animalSound(new Cat());
	    
	    
	    
	    
	}
		

  public static void animalSound(Animal animal) {
	  animal.sound();
  }

}