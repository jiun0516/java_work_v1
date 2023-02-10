package Stracraft3;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	public void attack(Unit unit) {
		System.out.println(this.name + "이" + unit.getName() + "을 공격합니다");
		unit.beAttacked(this.power);
	}


	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
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
