import javax.swing.*;
import java.awt.*;

public class GUIWindow{

	public static void main(String[] args){
   		JFrame theGUI = new JFrame();
		theGUI.setTitle("4 Bouncing Balls");
		theGUI.setSize(500, 500);
		ColorPanel panel = new ColorPanel(Color.yellow, 500, 500);
		Container pane = theGUI.getContentPane();
   		pane.add(panel);
   		theGUI.setVisible(true);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}

}