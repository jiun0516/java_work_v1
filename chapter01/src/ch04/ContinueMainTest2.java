package ch04;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요");
		final int MULTIPLE = 3;
		int num = 0;
		int count = 0;
		int n = 0;
		n = sc.nextInt();
		
		for(num = 1; num <=n ; num++) {
			if(num%MULTIPLE ==0) {
				count++;
				continue;
			}
		}
		System.out.println(n + "의 " + "3의 배수의 갯수는 : " + count);
	}

}
