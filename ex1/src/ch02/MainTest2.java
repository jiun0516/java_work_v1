package ch02;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리 까지 작성해 주세요
		// 1. try
		// 2. 클래스 설계 throws 활용
		int a = 10;
		int b = 0;
		try {
			int result = a / b;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("연산 안됨");
		}
		
	}

}

// throws는 클래스 설계
class Throws{
	int a = 10;
	int b = 0;
	
	int result = a / b;
	
}