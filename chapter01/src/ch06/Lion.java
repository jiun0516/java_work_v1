package ch06;


/**
 * 
 * 함수를 선언하는 코드 방법
 * 함수를 사용하는 코드 방법
 */
public class Lion {

	// 정수를 반환 하는 함수
	// 함수를 설계 하는 코드 작성
	static int addNumber(int n1, int n2) {		
		// 함수 구현부(body)
		int result; //지역 변수
		result = n1 + n2;
		return result; // 리턴 키워드를 만나면 실행에 제어권을 반납 한다. (데이터)
	}
	
	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + " 반갑습니다 ~ ");
	}
	
	// 매개 변수가 없는 함수를 설계
	static int calcSum() {
		
		int sum = 0;
		int i;
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// calcSum2 , 정수값 3개를 받아서 덧셈 연산후 결과를 반환 하시오
	static double calcSum2(int n1, int n2, int n3) {
		double sum; //지역 변수
		sum = n1 + n2 + n2;
		return sum;
	}
	
	// calcSum3 정수값 1, 실수값 1, 논리값 1개 받고
	//  정수값 :  [] , 실수값 [], 논리값 [] <----- 문자열 연산하고
	// 리턴타입은 String 을 만들어주세요
	static String calcSum3(int n1, double n2, boolean n3) {
		String result = "정수값 " + n1 + " 실수값 " + n2 + " 논리값 " + n3;
 		return result;
	}
	
	//텅비 리턴값이 없다.
	public static void main(String[] args) {
		
		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber : " + myNumber);
		
		// 함수 호출2
		// 함수 호출할 때는 모양 맞추기 이다.
		sayHello("애쉬");
		// int a = myNumber;
		sayHello("티모");
		sayHello("바론");
		
		int calResulslt = calcSum(); // <---
		System.out.println(calResulslt);
		
		System.out.println( calcSum() );
		
		System.out.println("=======================");
		
		double sum = calcSum2(1, 2, 3);
		System.out.println("sum : " + sum);
		
		System.out.println("=======================");
		
		String localDataString = calcSum3(1, 2 , true);
		System.out.println(localDataString);
		
	}// end of main
	
	// 함수란?
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련에 코드 묶음이다.
	
} // end of class
