package ch04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<>();

		map1.put("홍길동", "010-1111-1111");
		map1.put("김철수", "010-2222-2222");
		map1.put("이순신", "010-3333-3333");
		map1.put("신짱구", "010-4444-4444");
		map1.put("이훈이", "010-5555-5555");
		map1.put("맹구", "010-6666-6666");
		map1.put("봉미선", "010-7777-7777");
		map1.put("신형만", "010-8888-8888");

		// while 0 종료. 1 저장. 2 전체조회. 3. 선택조회. 4. 선택삭제. 5. 전체 삭제
		// tip -> 데이터 입력
		// 샘플 데이터 만들어서 활용
		Scanner sc = new Scanner(System.in);
		String userInput = "-1";
		while (true) {
			System.out.println(">> 기능을 선택해주세요 <<");
			System.out.println("0 종료. 1 저장. 2 전체조회. 3. 선택조회. 4. 선택삭제. 5. 전체 삭제");
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("이름을 입력하세요");
				String targetName = sc.nextLine();
				System.out.println("전화번호를 입력하세요");
				String phoneNum = sc.nextLine();
				map1.put(targetName, phoneNum);
			} else if (userInput.equals("2")) {
				System.out.println("전체조회를 선택하셨습니다");
				for (String phone : map1.keySet()) {
					System.out.println("name : " + phone);
					System.out.println("phone : " + map1.get(phone));
					System.out.println("------------------------");
				}
			} else if (userInput.equals("3")) {
				System.out.println("선택조회를 선택하셨습니다");
				System.out.println("이름을 입력하세요");
				String targetName = sc.nextLine();
				for (String phone : map1.keySet()) {
					if (phone.equals(targetName)) {
						System.out.println("name : " + phone);
						System.out.println("phone : " + map1.get(phone));
					} 
				}
			} else if (userInput.equals("4")) {
				System.out.println("이름을 입력하세요");
				String targetName = sc.nextLine();
				map1.remove(targetName);
				System.out.println("삭제되셨습니다");
			} else if (userInput.equals("5")) {
				map1.clear();
			} else if (userInput.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}// end of main
	
}// end of class
