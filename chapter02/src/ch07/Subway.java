package ch07;

public class Subway {

	private int subwayLineNum;
	private int passengerCount;
	private int money;
	
	public Subway(int subwayLineNum) {
		this.subwayLineNum = subwayLineNum;
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 : " + subwayLineNum);
		System.out.println("승객 수 : " + passengerCount);
		System.out.println("수익 금 : " + money);
		System.out.println("---------------------------------");
	}

	


}
