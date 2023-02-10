package ch04;

public class Warrior {

	// 상태
	int power;
	int hp;
	int level;
	int exp;
	int damage;
	int attack;

	public Warrior(int hp, int power) {
		this.hp = hp;
		this.power = power;
	}

	public void damage(int count) {
		this.damage += count;
		this.hp -= (5 * damage);
		if (hp == 0) {
			System.out.println("전사가 사망하였습니다");
			this.hp = 0;
		}
	}

	public void attack(int count) {
		this.attack += count;
		this.exp += (100 * attack);
		if (exp == 1_00000) {
			this.level++;
			this.power += (100 * level);
			System.out.println("전사가 레벨업 하셨습니다");
		}
	}

	public void showInfo() {
		System.out.println("**전사의 상태창**");
		System.out.println("캐릭터의 hp : " + this.hp);
		System.out.println("캐릭터의 level : " + this.level);
		System.out.println("캐릭터의 경험치 : " + this.exp);
		System.out.println("캐릭터의 power : " + this.power);
	}


}// end of class
