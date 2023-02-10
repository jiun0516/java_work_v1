package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그래밍 만들어 주세요
		// 스캐너
		//
		// 문자열
		// 값을 비교하는 연산자 ==

		// while 문을 사용해서
		// CRUD 에 개념
		// 1. 저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료
		final int SAVE = 1;
		final int ALL = 2;
		final int SELECT = 3;
		final int DELETE = 4;
		final int END = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];

		int choice = 0;
		while (true) {
			System.out.println("선택하세요");
			System.out.println("1. 저장\t 2.전체조회\t 3.선택조회\t 4.전체삭제\t 0.프로그램 종료");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == SAVE) {
				count = save(books, count, sc);
			} else if (choice == ALL) {
				readAll(books);
			} else if (choice == SELECT) {
				 readByTitle(books, count, sc);
			} else if (choice == DELETE) {
				deleteAll(books, choice, DELETE);
			} else {
				if (choice == END) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
			}
		}

	} // end of main

	//전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println("전체조회를 선택하셨습니다");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
			}
		}
	}
	
	// 선택 조회하기 
	public static void readByTitle(Book[] books, int count, Scanner sc) {
		System.out.println("선택조회를 선택하셨습니다");
		System.out.println("책 제목을 입력해주세요");
		String targetBook = sc.nextLine();
		for (count = 0; count < books.length; count++) {
			if (books[count] != null) {
				if (books[count].getTitle().equals(targetBook)) {
					books[count].showInfo();
				}
			}
		}
	}
	
	// 삭제하기
	public static void deleteAll(Book[] books, int choice, final int DELETE) {
		System.out.println("전체삭제되셨습니다");
		for (int i = 0; i < books.length; i++) {
			if (choice == DELETE) {
				books[i] = null;
			}
		}
	}
	
	// 저장하기
	public static int save(Book[] books, int count, Scanner sc) {
		System.out.println("저장");
		System.out.println("책제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("책저자를 입력하세요");
		String author = sc.nextLine();
		books[count] = new Book(title, author);
		count++;
		System.out.println("책을 저장하였습니다!");
		return count;
	}
} // end of class
