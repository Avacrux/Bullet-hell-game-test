import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main extends JFrame {

	public static int boardHeight = 500;
	public static int boardWidth = 500;

	public static ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	public static Player player;

	public static boolean keyHeld = false;
	public static boolean keyHeldCodeW = false;
	public static boolean keyHeldCodeA = false;
	public static boolean keyHeldCodeS = false;
	public static boolean keyHeldCodeD = false;

	public Main() {

		this.setSize(boardWidth, boardHeight);
		this.setResizable(false);
		this.setTitle("Bullet Hell");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel(500, 450);
		ScoreBoard scoreBoard = new ScoreBoard(500, 50);
		this.add(gamePanel, BorderLayout.CENTER);
		this.add(scoreBoard, BorderLayout.NORTH);

		this.setVisible(true);
		player = new Player();

		Bullet bullet = new Bullet(30, 30, 10, 20, 1, 1);
		bullets.add(bullet);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == 87) {
					keyHeldCodeW = false;

				} else if (e.getKeyCode() == 65) {
					System.out.println("Left");
					keyHeldCodeA = false;

				} else if (e.getKeyCode() == 83) {
					System.out.println("Backward");
					keyHeldCodeS = false;

				} else if (e.getKeyCode() == 68) {
					System.out.println("Right");
					keyHeldCodeD = false;

				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 87) {
					System.out.println("Forward");
					keyHeldCodeW = true;
					
				} else if (e.getKeyCode() == 65) {
					System.out.println("Left");
					keyHeldCodeA = true;
				}

				else if (e.getKeyCode() == 83) {
					System.out.println("Backward");
					keyHeldCodeS = true;
				}

				else if (e.getKeyCode() == 68) {
					System.out.println("Right");
					keyHeldCodeD = true;
				}

			}
//test
		});

	}

	public static void main(String[] args) {
		new Main();

	}

}
