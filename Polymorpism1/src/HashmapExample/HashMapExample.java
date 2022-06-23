package HashmapExample;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();


		//객체 저장
		map.put("씬용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 :"+map.size());
		
		
		//객체 찾기
		System.out.print("\t홍길동 :"+map.get("홍길동"));
		System.out.println();
		
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyiterator = keySet.iterator();
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key  + ":" + value);
			
			
		}
		System.out.println();
		
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 :"+ map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String,Integer>>  entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryiterator = entrySet.iterator();
		while(entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryiterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key + ":"+value);
			
			
		}
		System.out.println();
		
		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+ map.size());
		


	}

}
