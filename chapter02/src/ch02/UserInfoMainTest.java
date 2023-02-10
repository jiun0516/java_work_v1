package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		
		UserInfo user1 = new UserInfo("hong","홍길동","010-0000-0000");
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.phone);
		
		System.out.println("------------------------------");
		
		UserInfo user2 = new UserInfo("hong","홍길동");
		System.out.println(user2.userId);
		System.out.println(user2.userName);
		
		System.out.println("------------------------------");
		
		UserInfo user3 = new UserInfo("hong");
		System.out.println(user3.userId);
		
		System.out.println("------------------------------");

		UserInfo user4 =new UserInfo();
		user4.userId = "hong";
		user4.userName = "홍길동";
		user4.phone = "010-0000-0000";
		System.out.println(user4.userId);
		System.out.println(user4.userName);
		System.out.println(user4.phone);
	}

}
