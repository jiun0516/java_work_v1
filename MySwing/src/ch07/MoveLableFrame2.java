package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveLableFrame2 extends JFrame implements Moveable {

	private int imagePanelX;
	private int imagePanelY;
	ImagePanel imagePanel;

	static class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("images/image2.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
		}
	}

	public MoveLableFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
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
		int x = imagePanelX += 50;
		if(x > 550) {
			imagePanelX -= 50;
		}
		int y = imagePanelY;
		imagePanel.setLocation(x, y);
	}

	@Override
	public void left() {
		int x = imagePanelX -= 50;
		if(x < 0) {
			imagePanelX += 50;
		}
		int y = imagePanelY;
		imagePanel.setLocation(x, y);
	}

	@Override
	public void up() {
		int y = imagePanelY -= 50;
		if(y < 0) {
			imagePanelY += 50;
		}
		int x = imagePanelX;
		imagePanel.setLocation(x, y);
	}

	@Override
	public void down() {
		int y = imagePanelY += 50;
		if(y > 550) {
			imagePanelY -= 50;
		}
		int x = imagePanelX;
		imagePanel.setLocation(x, y);
	}
}
