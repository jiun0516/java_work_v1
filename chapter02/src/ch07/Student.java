package ch07;


public class Student {

	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus targetBus) {
		targetBus.take(1_000);
		this.money -= 1_000;
	}
	public void takeSubway(Subway targetSubway) {
		targetSubway.take(1_200);
		this.money -= 1_200;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("소비금  : " + money);
		System.out.println("------------------------------");
	}





}
