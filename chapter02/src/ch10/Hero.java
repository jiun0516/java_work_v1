package ch10;

public class Hero {

	//protected -> 자식 클래스에서 접근 가능한 레벨링이다.
	// 같은 패키지 안에서 접근 가능 하다.
	protected String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void attack() {
		System.out.println("기본 공격 합니다");
	}	
	
}
