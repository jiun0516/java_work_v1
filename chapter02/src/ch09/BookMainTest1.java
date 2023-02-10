package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리 하고 싶다면 - 배열 (자료구조)
		Book[] books = new Book[10]; // 배열 선언 (메모리공간 만들어두기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘로");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		books[9] = new Book("홍길동전", "허균");

		// books.length --> 배열에 길이 (10)
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				// i --> 0, 1, 2, 3, 4, 5
				System.out.println(books[i].getTitle()); // 방어적 코드 작성
			}
		}
		// 주의1
		// 인덱스 크기는 n-1 개다
		// 배열에 길이와 인덱스에 길이는 다르다.

		// 주의2
		// 배열에 길이와 실제 들어가 있는 값에 갯수는 다를 수 있다.

		// 문제1
		// double 배열 4 선언 임의 값 넣고 출력해 주세요
		// 3 번째 인덱스는 값을 할당 하지 마시오!
		// 출력은 for 문 -> 방어적 코드 작성

		double arr1[] = new double[4];
		arr1[0] = 0.1;
		arr1[1] = 0.2;
		arr1[2] = 0.3;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				System.out.println(arr1[i]);
			}
		}

		System.out.println("----------------------------");
		
		// 문제2
		// 0번째 인덱스에 있는 녀석과 인덱스 2번째 녀석에 값을 스왑해주세요!
		Book n = books[2];
		books[2] = books[0];
		books[0] = n;
		System.out.println(books[0].getTitle());
		System.out.println(books[2].getTitle());
		
		System.out.println("----------------------------");
		
		// 문제3
		// 인덱스 3번에 값을 삭제 해주세요
		books[3] = null;
		for (int i = 0; i < arr1.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle());
			}
		}

	}

}
