package ch04;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {
	
	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장 해주세요
		// 1 - String, String
		// 2 - String, Object(Person)
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("홍길동", "010-1111-1111");
		map1.put("김철수", "010-2222-2222");
		map1.put("이순신", "010-3333-3333");
		map1.put("신짱구", "010-4444-4444");
		map1.put("이훈이", "010-5555-5555");
		map1.put("맹구", "010-6666-6666");
		map1.put("봉미선", "010-7777-7777");
		map1.put("신형만", "010-8888-8888");
		
		System.out.println(map1);
		for(String phone : map1.keySet()) {
			System.out.println("name : " + phone);
			System.out.println("phone : " + map1.get(phone));
		}
	}

}
