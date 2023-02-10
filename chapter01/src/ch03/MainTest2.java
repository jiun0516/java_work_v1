package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 산술 연산자 
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = (int)(5.0 / 4.0); // 연산한 값은 데이터 타입이 double이기에 int로 강제 형 변환 
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4); 
		System.out.println(number5);

		System.out.println("================================");
		
		//문제
		// 1
		int num1 = (12 + 3) / 3;
		System.out.println(num1);
		// 2
		int num2 = 25 % 2;
		System.out.println(num2);
		// 3
		int  result = (int)3.0 / 5;
		System.out.println(result);

	}

}
