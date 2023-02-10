package ch03;

public class ShortCircuitTest1 {

	public static void main(String[] args) {
		
				// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요
				// 그리고 카페 도전과제 -> 실습 및 리뷰에 문제&답을 올려 주세요
				int a = 15;
				int b = 2;
				
				// 1. 밑에 논리연산을 보고 true(참) or false(거짓)을 구하시오
				// 그리고 b를 화면에 출력하였을 때 무엇이 나오는지를 구하시오
				boolean result = ( (a +=5) < 17 ) && ( (b -=1) > 0);
				System.out.println(result);
				System.out.println(b);
				
				
				System.out.println("=================================");

				// 2. 밑에 논리연산을 보고 true(참) or false(거짓)을 구하시오
				result = ( (a /=5) < 5 ) && ( (b %=1) >= 0);
				System.out.println(result);
				
				
				// 풀이
				// 1번 문제
				// 앞에 항의 결과 값이 20 < 17 -> F , 뒤에 항의 결과 값이  1 > 0 -> T
				// 논리곱은 모두가 참이어야 결과 값이 참이기에 결과 값은 false
				// 앞에 결과가 F이기에 결론은 false이다. 그러므로 뒤에 항의 결과를 평가하지 않아서 b의 출력값은 2
				

				// 2번 문제
				// 앞에 항의 결과 값이 4 < 5 -> T, 뒤에 항의 결과 값이 0>=0 -> T
				// 논리합은 하나라도 참이면 결과값이 참이면 참이기에 결과 값은 true

	}

}
