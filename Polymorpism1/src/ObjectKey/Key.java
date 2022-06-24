package ObjectKey;

public class Key {
	public int number;

	public Key(int nember) {
		this.number =number;

	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number==compareKey.number) {
				System.out.println("equals true 실행");
				return true;
			}
		}
		System.out.println("equals true 실행");
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode 실행");
		return number;
	}

}
