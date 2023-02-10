package Stracraft2;

public class Marine {

	private String name;
	private int power;
	private int hp;
	private int shield;

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	// getter 메서드 만들기
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}
	public int getShield() {
		return this.shield;
	}

	// 마린이 질럿을 공격 합니다
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이" + zealot.getName() + "을 공격합니다");
	}

	// 마린이 저글링을 공격 합니다
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이" + zergling.getName() + "을 공격합니다");
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + " 사망하였습니다");
			return;
		}
		System.out.println(this.name + "이 공격 당합니다");
		this.hp -= power;
	}

	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
}
