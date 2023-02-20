package ch01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	public void setRight(boolean right) {
		this.right = right;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	
	public Player() {
		initData();
		setInitData();
	}
	
	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		
		left = false;
		right = false;
		up = false;
		down = false;
	}
	
	private void setInitData() {
		x = 55;
		y = 535;
		setSize(50, 50);
		setLocation(x, y);
		setIcon(playerR);
	}
	
	@Override
	public void left() {
		
		left = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}// end of while
			}
		}).start();
	}
	@Override
	public void right() {
		
		right = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}// end of while
			}
		}).start();
	}
	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}// end of for
				
				up = false;
				down();
				
			}
		}).start();
	}
	@Override
	public void down() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}// end of for
				down = false;
			}
		}).start();
	}
}
