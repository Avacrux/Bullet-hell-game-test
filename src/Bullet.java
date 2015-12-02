import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


@SuppressWarnings("serial")
public class Bullet{
	
	public Ellipse2D bullet;
	
	int xPosition;
	int yPosition;
	
	int bulletHeight;
	int bulletWidth;
	
	int xDirection;	
	int yDirection;
	
	public boolean onScreen = true;
	
	int gameWidth = GamePanel.WIDTH;
	int gameHeight = GamePanel.HEIGHT;
	
	public Bullet(int xPosition, int yPosition,int bulletWidth,int bulletHeight,int xDirection, int yDirection) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.xDirection = xDirection;
		this.yDirection = yDirection;
		bullet = new Ellipse2D.Float(xPosition,yPosition,bulletWidth,bulletHeight);
		
	
		

		
	}
	
	public void move(){
		
		if(xPosition < 0 || yPosition < 0 ||xPosition > GamePanel.boardWidth ||yPosition > GamePanel.boardHeight){
			onScreen = false;
		}
		
		if (onScreen){
			
		}
		
	}

	

	

}
