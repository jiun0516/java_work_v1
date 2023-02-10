package ch01;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("시작값을 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("종료값을 입력하세요");
		int n2 = sc.nextInt();
		for(int i = 2; n1 <= n2; n1++) {
			for(int k = 1; k <= 9; k++) {
				System.out.println(n1 + "x" +  k + "=" + n1 * k);
			}
		}
	}

}
