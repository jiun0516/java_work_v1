package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		
		 Student student1 = new Student();
		 student1.StudentId = 1;
		 student1.studentName = "홍길동";
		 student1.address = "부산시 해운대구";
		 
		 student1.homework();	 
		 student1.test();
		 student1.clean();
	}

}
