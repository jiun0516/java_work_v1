package ch04;

public class MainTest2 {

	public static void main(String[] args) {
		Subway subway = new Subway(2);
		subway.take(1);
		subway.take(3);
		subway.takeOff(1);
		subway.showInfo();

	}

}
