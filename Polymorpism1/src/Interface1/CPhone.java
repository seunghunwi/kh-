package Interface1;

public class CPhone implements IFuncion{
	@Override
	public void call() {
		System.out.println("전화가능합니다.");

	}

	@Override
	public void callSpeed() {
		System.out.println("가능합니다. 4G입니다.");

	}

	@Override
	public void remoteContol() {
		System.out.println("미탑재 되어 있습니다.");

	}
}
