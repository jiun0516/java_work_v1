package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior Warrior = new Warrior(100, 1000);
		Warrior.attack(1000);
		Warrior.attack(10);
		Warrior.damage(15);
		Warrior.showInfo();
		
		System.out.println("---------------------------------");
		
		Wizard Wizard = new Wizard(100, 1000);
		Wizard.attack(1000);
		Wizard.attack(10);
		Wizard.damage(15);
		Wizard.damage(2);
		Wizard.showInfo();

	}

}
