package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		
		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요~
		Random random = new Random();
		String[] name = {"강민정", "김미정", "김경은", "김민우", "김효린", "김유주", "김지현", "김현우", "박규현", "편용림", "박성희", "오세훈", "이현서", "전대영", "이치승", "손주이", "배진석", "한범진"};

		System.out.println(name[random.nextInt(18)]);
	}

}
