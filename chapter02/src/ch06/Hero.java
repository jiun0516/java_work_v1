package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get,set
	
	// getter 메서드 직접 만들어 보세요. 5
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getDie() {
		return this.die;
	}
	// setter 메서드 직접 만들어 보세요. 5
	// 방어적 코드도 추가해 보세요
	public void setName(String name) {
		if(name == null) {
			System.out.println("이름이 입력되지 않았습니다.");
		}else {
			this.name = name;
		}
	}
	public void setHp() {
		if(hp <= 0) {
			this.hp = 0;
			System.out.println("Hero가 사망하셨습니다");
		}else {
			if(hp >0 && hp <1000) {
				System.out.println("포션을 사용하시겠습니까?");
			}
		}
	}
	public void setPower(int item){
		
	}
}
