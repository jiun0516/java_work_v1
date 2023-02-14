package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 활용해서
	// JPanel 를 상속 받고 paint 메서드로
	// 집 그림을 그려 주세요
	MyDrawPanel drawPanel; // 멤버 변수 선언

	class MyDrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(130, 150, 300, 300); // 집형태
			g.drawRect(150, 200, 100, 100); // 왼쪽창문
			g.drawRect(310, 200, 100, 100); // 오른쪽창문
			g.drawRect(230, 320, 100, 130); // 문
			g.drawLine(300, 50, 130, 150); // 지붕
			g.drawLine(300, 50, 430, 150); // 지붕
			g.drawString("⭐", 300, 15);
			g.drawString("⭐", 200, 10);
			g.drawString("⭐", 100, 35);
			g.drawString("⭐", 50, 30);
			g.drawString("⭐", 150, 20);
		}
	}

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집 그리기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}
}
