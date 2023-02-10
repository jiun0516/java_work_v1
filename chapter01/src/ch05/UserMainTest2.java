package ch05;

import java.util.Scanner;

public class UserMainTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력해주세요");
		String pw  = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요");
		String tel  = sc.nextLine();
		
		System.out.println("주소를 입력해주세요");
		String address  = sc.nextLine();
		
		System.out.println("이메일을 입력해주세요");
		String email  = sc.nextLine();
		
		System.out.println("태어난 월을 입력해주세요");
		int birthmonth  = sc.nextInt();
		
		System.out.println("id : " + id);		
		System.out.println("pw : " + pw);		
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
		System.out.println("email : " + email);
		System.out.println("birthmonth : " + birthmonth + "월");

		
	}

}
