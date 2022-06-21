package Interface1;

public class Bphone implements IFuncion{
	@Override
	public void call() {
		System.out.println("전화가능합니다.");
		
	}

	@Override
	public void callSpeed() {
		System.out.println("불가능합니다. 5G입니다.");
		
	}

	@Override
	public void remoteContol() {
		System.out.println("탑재 되어 있습니다.");
		

}
}
