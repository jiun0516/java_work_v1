package ch03;

public class ShortCircuitTest {

	// 메인 함수
	public static void main(String[] args) {
		
		// 관계 논리곱 -->  F --> F, 논리합 --> T --> T
		
		int num1 = 5;
		int i = 0;
		//                                      F                        &&               T
		boolean value = ( (num1 += 10) > 10 ) && ( (i += 2) <10 );
		System.out.println(value);
		System.out.println("================================");
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println("=================================");
		//                            F                   ||               T 
		value = ( (num1 += 10) > 10 ) || ( (i += 2) < 10 );
		System.out.println(value);
		System.out.println(i);
			

	}// end of main

}// end of class
