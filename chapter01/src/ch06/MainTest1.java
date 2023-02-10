package ch06;

public class MainTest1 {

	// 1. 리턴값이 int, 매개변수 n1, n2, n3 이름은 intAdd
	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	// 3. 리턴값 void, 매개변수는 String article, 함수 이름은 printArticle 출력
	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	
	static double doubleAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
	static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	// 테스트 - 실행코드 main
	public static void main(String[] args) {
		// 호출해서 수행 !!!
		
		int num = intAdd(1, 2, 3);
		System.out.println(num);
		
		double sum = doubleAdd(1, 2);
		System.out.println(sum);
		
		// 오류 발생
		// System.out.println( printArticle("printArticle") );
		printArticle("printArticle");
		
		
	}
}
