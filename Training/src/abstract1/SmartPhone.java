package abstract1;

public class SmartPhone extends Phone{
	
    //생성자
	SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	

}
