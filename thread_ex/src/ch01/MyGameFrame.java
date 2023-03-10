package ch01;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame {
	
	public MyGameFrame() {
		// 익명 클래스 + 메서드 체이닝 방식 코드
		new Thread(this.runnable).start();
	}

	// 클래스 문법
	// 변수, 생성자, 메서드 .. (식은 사용할 수 없다.)
	// Runnable runnable; // 변수에 선언
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// 따로 작업 하고자 하는 사항을 지시
			for(int i = 0; i < 30; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	// 메인 작업자
	public static void main(String[] args) {
		MyGameFrame gameFrame = new MyGameFrame();
		// Thread thread = new Thread(gameFrame.runnable);
		// thread.start();
		// gameFrame.runnable.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("i : " + i);
		}
	}
}
