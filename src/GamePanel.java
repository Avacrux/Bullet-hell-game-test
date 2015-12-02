import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.JComponent;


@SuppressWarnings("serial")
public class GamePanel extends JComponent {

	public static int boardWidth;
	public static int boardHeight;
	


	public GamePanel(int width, int height) {
		boardWidth = width;
		boardHeight = height;
		
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);

		executor.scheduleAtFixedRate(new RepaintTheBoard(this), 0, 1, TimeUnit.MILLISECONDS);
		
		
		
		
		
	}

	public void paint(Graphics g) {
		Graphics2D graphicsSettings = (Graphics2D) g;
		// set background color
		graphicsSettings.setColor(Color.BLACK);
		graphicsSettings.setBackground(Color.BLACK);
		graphicsSettings.fillRect(0, 0, getWidth(), getHeight());
		
		

		for (Bullet bullet : Main.bullets) {

			if (bullet.onScreen) {
				bullet.move();
				graphicsSettings.setPaint(Color.WHITE);
				graphicsSettings.draw(bullet.bullet);
				

			}

		}
		if (Main.keyHeldCodeW == true ) {
			Main.player.goUp(5);
		}
		if (Main.keyHeldCodeA == true ) {
			Main.player.goLeft(5);
		}		
		if (Main.keyHeldCodeS == true ) {
			
			Main.player.goDown(5);
		} 
		if (Main.keyHeldCodeD == true ) {
			Main.player.goRight(5);
		}
		
		graphicsSettings.setPaint(Color.RED);
		graphicsSettings.draw(Main.player.avatar);
	}



class RepaintTheBoard implements Runnable {
	GamePanel thePanel;

	public RepaintTheBoard(GamePanel thePanel) {

		this.thePanel = thePanel;
	}

	@Override
	public void run() {
		thePanel.repaint();
		
	}

}
}