package ch02;

public class UserInfo {

	String userId;
	String userName;
	String phone;
	
	// 1.
	// 사용자 정의 생성자를 만들어 주세요 매개변수 3개 한번에 사용
	public UserInfo(String id, String name, String ph) {
		this.userId = id;
		this.userName = name;
		this.phone = ph;
	}
	
	// 2.
	// 사용자 정의 생성자 만들기 userId; userName;
	public UserInfo(String id, String name) {
		this.userId = id;
		this.userName = name;
	}
	
	// 3.
	// 사용자 정의 생성자 만들기 userId;
	public UserInfo(String id) {
		this.userId = id;
	}
	
	// 4.
	// 기본 생성자를 만들어 주세요
	public UserInfo() {
		String userId;
		String userName;
		String phone;
	}

}
