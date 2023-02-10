package ch01;

public class Bus {
	int StudentId;
	String studentName;
	String address;
	
	public void ride() {
		System.out.println(studentName + "학생이 버스를 탑니다");
	}
	
	public void showInfo() {
		// 지역변수
		System.out.println("==========상태창==========");
		System.out.println("학생에 ID값은 : " + StudentId);
		System.out.println("학생에 이름은 : " + studentName);
		System.out.println("학생에 주소는 : " + address);
		
		System.out.println("=========================");
	}
}
