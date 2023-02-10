package ch07;

public class Bus {

	private int busNum;
	private int passengerCount;
	private int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 : " + busNum);
		System.out.println("승객 수 : " + passengerCount);
		System.out.println("수익 금 : " + money);
		System.out.println("--------------------------------");
	}


}
