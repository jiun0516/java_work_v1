package ch02;

public class Toy {
	
	String name;
	public Toy(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("**경품 확인**");
		System.out.println("경품 내역 : " + name);
	}
}
