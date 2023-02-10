package ch05;

public class UserMainTest {

	// 메인 함수
	public static void main(String[] args) {
		
		//메모리에 올리고
		//값을 할당
		//화면에 값을 출력
		User user1 = new User();
		user1.username = "이지운";
		user1.userid = "jiun";
		user1.userpw = "1234";
		user1.tel = "010-0000-0000";
		user1.useraddress = "부산시 금정구";
		user1.useremail = "abcd1234@nave.com";
		user1.birthmonth = 5;
		
		System.out.println("NAME : " + user1.username);
		System.out.println("ID : " + user1.userid);
		System.out.println("PW : " + user1.userpw);
		System.out.println("TEL : " + user1.tel);
		System.out.println("ADDRESS : " + user1.useraddress);
		System.out.println("EMAIL : " + user1.useremail);
		System.out.println("BIRTHDAY : " + user1.birthmonth + "월");

	}// end of main

}// end of class
