package ch10;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {
	
	// 배경 이미지
	BufferedImage backgroundMap; // Buffer는 데이터를 담긴 위한 상자라 생각하면 됨
	// 캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 (적군) 이미지 1
	BufferedImage grayImage1;
	// jpanel 상속 --> inner class
	CustomPanel customPanel;
	
	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;
	
	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
		// Thread thread = new Thread(customPanel);
		// thread.start();
		new Thread(customPanel).start();
	}
	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			// 이미지 3개 있음, CustomPanel
			backgroundMap = ImageIO.read(new File("images/background_map.jfif"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		}
		// CustomPanel 메모리에 올라 가는 순간, paintComponent() 메서드 호출
		customPanel = new CustomPanel();		
	}
	private void setInitLayout() {
		// 레이아웃은 기본 레이아웃 기반으로 설정 함 !!
		// add 호출시 paintComponent 메서드 실행 됨
		 add(customPanel);
		setVisible(true);
	}
	private void addEventListener() {
		 // 이벤트 리스너 등록 처리
		this.addKeyListener(this);
	}
	
	class CustomPanel extends JPanel implements Runnable {
		
		// boolean isRight = true;
		
		// BufferedImage
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			
			while(true) {
				if(isRight) {
					grayX += 10;					
				} else {
					grayX -= 10;
				}
				// 방향 체크
				if(grayX == 500) {
					isRight = false;
				}
				
				if(grayX == -20) {
					isRight = true;
				}
				
				if(grayX == pinkX && grayY == pinkY) {
					pinkImage1 = null;
				}
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
			
		}
	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode : " + keyCode);
		if(keyCode == KeyEvent.VK_LEFT) {
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
			// pinkX -= 10;
		} else if(keyCode == KeyEvent.VK_RIGHT) {
			pinkX = (pinkX > 500) ? 510 : pinkX + 10;
		} else if(keyCode == KeyEvent.VK_UP) {
			pinkY = (pinkY < 0) ? -10 : pinkY - 10;
		} else if(keyCode == KeyEvent.VK_DOWN) {
			pinkY = (pinkY > 470) ? 480 : pinkY + 10;
		}
		
		// 그림을 다시 그려 주다 실행 !!!
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
} // end of outer class
