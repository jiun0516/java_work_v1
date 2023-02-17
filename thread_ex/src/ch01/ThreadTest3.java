package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Worker worker1 = new Worker("워커1");
		worker1.start();
		Worker worker2 = new Worker("워커2");
		worker2.start();
	}
 
}

class Worker1 extends Thread {
	private String name;
	
	public Worker1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " : " + i);
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}
	
}