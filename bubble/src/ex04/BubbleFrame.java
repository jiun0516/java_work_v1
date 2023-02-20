package ex04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		
		// player 메모리에 올라간 상태이다.
		// 약속 run 메서드안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player();
	}

	private void SetInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				// 38, 40, 39, 41 ...
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출 되게 방어적 코트 작성 !
					// false 
					// true <-- 변경 !!
					// 한번더 <-- 현재 상태 값 true
					if(player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();					
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();					
					}
					break; // 세미콜론
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			}// end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야 해!
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야 해!
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