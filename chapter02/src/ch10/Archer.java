package ch10;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	
	public void fireArrow() {
		System.out.println(name + "가 불화살 공격을 합니다");
	}

	public static void main(String[] args) {
		Archer archer = new Archer("궁수",100);
		archer.fireArrow();
	}
}
