package ch01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initData();
		SetInitLayout();
		addEventListener();
	}
	
	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);
		
		player = new Player();
	}
	
	private void SetInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(player);
	}
	
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			} // end of pressed
			
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;

				default:
					break;
				}
			}
		});
	}
	public static void main(String[] args) {
		new BubbleFrame();
	}// end of main
}// end of class
