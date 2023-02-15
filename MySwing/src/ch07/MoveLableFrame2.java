package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLableFrame2 extends JFrame implements Moveable {

	private JLabel image;
	private int imageX = 100;
	private int imageY = 100;

	public MoveLableFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Icon icon = new ImageIcon("images/image2.png");
		image = new JLabel(icon);
		image.setSize(100,100);
	}

	private void setInitLayout() {
		setVisible(true);
		image.setLocation(300,350);
		add(image);
		setLayout(null);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x, y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}

	@Override
	public void right() {
		if (imageX < 650) {
			int x = imageX += 50;
			int y = imageY;
			image.setLocation(x, y);
			System.out.println(x);
		}
	}
	 

	@Override
	public void left() {
		if (imageX > 0) {
			int x = imageX -= 50;
			int y = imageY;
			image.setLocation(x, y);
			System.out.println(x);
		}
	}

	@Override
	public void up() {
		if (imageY > 0) {
			int y = imageY -= 50;
			int x = imageX;
			image.setLocation(x, y);
			System.out.println(y);
		}
	}

	@Override
	public void down() {
		if (imageY < 650) {
			int y = imageY += 50;
			int x = imageX;
			image.setLocation(x, y);
			System.out.println(y);
		}
	}
}
