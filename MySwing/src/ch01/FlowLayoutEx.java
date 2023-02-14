package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
	}
	public void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 200));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
