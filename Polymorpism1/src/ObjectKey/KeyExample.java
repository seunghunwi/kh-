package ObjectKey;

import java.util.*;

public class KeyExample {

	public static void main(String[] args) {
		//키 객체를 시별키로 사용해서 String값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap = new HashMap<>();
		
		
		//식별키"new Key(1)"로 홍길동을 저장함
		//new Key(1)할 때 hashcode 한번 실행
		hashMap.put(new Key(1), "홍길동");
		
		
		//식별키"new Key(1)"로 홍길동을 읽어옴
		//hashMap.get에서 equals를 call
		//new Key(1)할 때 hashcode실행
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
	}

}
