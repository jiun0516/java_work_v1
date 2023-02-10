package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		Student studentLee = new Student("이순신", 1_5000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);

		studentLee.takeBus(bus200);
		studentLee.takeBus(bus100);
		studentLee.takeSubway(subwayLine1);
		studentLee.showInfo();
		bus200.showInfo();
		bus100.showInfo();
		subwayLine1.showInfo();

		System.out.println("--------------------------------------");
		// 1 단계 - 사용해 보기
		// 2 단계 - 실행에 흐름 만들어 보기
		Scanner sc = new Scanner(System.in);
		System.out.println("목적지로 가는 빠른 경로가 있는데 가시겠습니까?");
		boolean answer = sc.nextBoolean();
		if (answer == true) {
			System.out.println("지하철 1호선과 2호선 중 몇호선 이용하시겠습니까?");
			int subway = sc.nextInt();
			if (subway == 1) {
				System.out.println("지하철을 1호선에 승차합니다!");
				subwayLine1.showInfo();
			} else if (subway == 2) {
				System.out.println("지하철을 2호선에 승차합니다!");
				subwayLine2.showInfo();
			} else {
				System.out.println("목적지로 향하는 지하철이 아닙니다!");
				System.out.println("다시 입력해주세요!");
			}
		} else {
			System.out.println("버스 100번과 200번 중 어느 버스를 이용하시겠습니까?");
			int bus = sc.nextInt();
			if (bus == 100) {
				System.out.println("버스 100번에 승차합니다!");
				bus100.showInfo();
			} else if (bus == 200) {
				System.out.println("버스 200번에 승차합니다!");
				bus200.showInfo();
			} else {
				System.out.println("목적지로 향하는 버스가 아닙니다!");
				System.out.println("다시 입력해주세요!");
			}
		}

	}// end of main
}// end of class
