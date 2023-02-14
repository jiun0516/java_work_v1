package ch01;

import javax.swing.JFrame;

public class MainTest1 extends JFrame {

	public MainTest1 () {
		setTitle("test");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainTest1();
	}
	
}
