package ch01;

import java.util.Scanner;

public class Wizzard {

	int mp;
	int hp;
	int level;
	int potion;
	int exp;
	int attack;
	int damage;
	
	public Wizzard() {
		this.mp = 2000;
		this.hp = 2000;
		this.exp = 0;
		this.potion = 20;
	}
	
	public void attack(int count) {
		this.attack += count;
		this.mp -= (100 * attack);
		System.out.println("공격을 하여 " + this.mp + "만큼 되었습니다." );
		this.exp += (100*count);
		System.out.println("경험치가" + this.exp + "증가되었습니다.");
		if(exp >= 10000) {
			level++;
			System.out.println("레벨업 되었습니다.");
		}
	}
	public void potion(int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("포션을 사용하시겠습니까?");
		this.hp += (potion * count);
		System.out.println("포션을 사용하여 hp가" + this.hp + "증가되었습니다.");
		this.mp += (potion * count);
		System.out.println("포션을 사용하여 mp가" + this.mp + "증가되었습니다.");
	}
}
