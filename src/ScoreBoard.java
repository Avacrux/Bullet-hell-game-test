import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ScoreBoard extends JComponent {
	
	public ScoreBoard(int width,int height){
		Dimension dimension = new Dimension(width, height);
		this.setPreferredSize(dimension);
		this.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
	}

}
