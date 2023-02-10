package ch07;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5_000);
		Student studentT = new Student("Tomas", 1_0000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		
		studentJ.takeBus(bus100);
		studentJ.showInfo();
		bus100.showInfo();
		studentT.takeSubway(subwayLine1);
		studentT.showInfo();
		subwayLine1.showInfo();
		
		

	}

}
