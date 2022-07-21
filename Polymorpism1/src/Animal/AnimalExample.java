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
		Animal animal = null;
		animal = new Dog();
		animal.sound();     // 자동 타입 변환 및 재정의 된 메소드 호출
		animal.breathe();
		animal = new Cat();
		animal.sound();     // 자동 타입 변환 및 재정의 된 메소드 호출
		animal.breathe();
		System.out.println("-------");


		//메소드의 다형성
		animalSound(new Dog()); //자동 타입 변환.
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();  //재정의된 메소드 호출
	}
}




