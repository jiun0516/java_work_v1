package ch04;

import java.util.Scanner;

public class IfMainTest1 {

	public static void main(String[] args) {
		// 제어문 - if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현
		// 만약 ....이라면

		boolean flag = true;

		// if 문 단독
		if (flag) {
			System.out.println("조건식에 결과가 true 이면 여기 코드가 수행 됩니다.");
		} // end of if

		// if else문
		flag = false;
		if (flag) {
			System.out.println("true면 실행 !!!!");
		} else {
			System.out.println("false면 실행@@@");
		}

		System.out.println("성적을 입력 하시오");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		// 문제
		// 만약 90점 이상이면 A학점 입니다 출력
		// 만약 80점 이상이면 B
		
		// if - else 문은 두개중 하나는 반드시 출력
		if (point >= 90) {
			System.out.println("A학점 입니다");
		} else {
			System.out.println("B학점 입니다");
		}

		System.out.println("----------------");
		// 문제
		if (point >= 90) {
			System.out.println("A학점 입니다");
		} else if (point >= 80) {
			System.out.println("B학점 입니다");
		} else if (point >= 70) {
			System.out.println("C학점 입니다");
		} else if (point >= 60) {
			System.out.println("D학점 입니다");
		} else {
			System.out.println("F학점 입니다");
		}// end of if
		
	}// end of main

}// end of class
