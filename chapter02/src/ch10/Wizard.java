package ch10;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	public void freezing() {
		System.out.println(name + "가 얼음공격을 합니다");
	}
	
	public static void main(String[] args) {
		Wizard wizard = new Wizard("마법사",100);
		wizard.freezing();
	}
}
