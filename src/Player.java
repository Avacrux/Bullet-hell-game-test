import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;



public class Player {

	public Ellipse2D avatar;

	int xPosition;
	int yPosition;

	int playerHeight = 5;
	int playerWidth = 5;

	public boolean onScreen = true;

	int gameWidth = GamePanel.boardWidth;
	int gameHeight = GamePanel.boardHeight;

	// public static int[] avatarXArray = {-13,14,-13,-5,-13};
	// public static int[] avatarYArray = {-15,0,15,0,-15};
	//
	// public static Polygon avatar = new Polygon(avatarXArray,avatarYArray,5);
	//
	public Player() {
		avatar = new Ellipse2D.Float(gameWidth / 2, gameHeight / 2, playerWidth, playerHeight);
		xPosition =gameWidth / 2;
		yPosition=gameHeight / 2;

	}
	
	public void goLeft(int increment){
		xPosition -= increment;
		reDrawPlayer();
		
	}
	public void goRight(int increment){
		xPosition += increment;
		reDrawPlayer();
	}
	public void goUp(int increment){
		yPosition -= increment;
		reDrawPlayer();
	}
	public void goDown(int increment){
		yPosition += increment;
		reDrawPlayer();
	}
	
	public void reDrawPlayer(){
		avatar.setFrame(xPosition, yPosition, playerWidth, playerHeight);
	}
	

}