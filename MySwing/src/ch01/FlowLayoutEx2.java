package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame{

	private JButton button1;
	private JButton button2;
	
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	
	private FlowLayout flowLayout;
	
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("연습2");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}
	
	private void setInitLayout() {
		setLayout(flowLayout);
		// for
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
