//Four bouncing balls
//Emerson Racca
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorPanel extends JPanel{

	private Circle circle, circle1, circle2, circle3;
	private javax.swing.Timer timer;

	public ColorPanel(Color backColor, int width, int height){
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));
		Random gen = new Random();
		circle = new Circle(gen.nextInt(400) + 50, gen.nextInt(900) + 50, 25, Color.red);
		circle1 = new Circle(gen.nextInt(400) + 50, gen.nextInt(900) + 50, 25, Color.green);
		circle2 = new Circle(gen.nextInt(400) + 50, gen.nextInt(900) + 50, 25, Color.blue);
		circle3 = new Circle(gen.nextInt(400) + 50, gen.nextInt(900) + 50, 25, Color.pink);
		circle.setFilled(true);
		
		circle.setDirection(gen.nextInt(360));
		circle1.setDirection(gen.nextInt(360));
		circle2.setDirection(gen.nextInt(360));
		circle3.setDirection(gen.nextInt(360));

		circle.setSpeed(gen.nextInt(19) + 1);
		circle1.setSpeed(gen.nextInt(19) + 1);
		circle2.setSpeed(gen.nextInt(19) + 1);
		circle3.setSpeed(gen.nextInt(19) + 1);

		timer = new javax.swing.Timer(33, new MoveListener());
		timer.start();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		circle.fill(g);
		circle1.fill(g);
		circle2.fill(g);
		circle3.fill(g);
	}
	
	private class MoveListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x = circle.getX();
			int y = circle.getY();
			int radius = circle.getRadius();
			int width = getWidth();
			int height = getHeight();
			if(x - radius <= 0){
				if(circle.getDirection() == 180)
					circle.setDirection(0);
				if(circle.getDirection() > 90 && circle.getDirection() < 180)
					circle.setDirection(180 - circle.getDirection());
				if(circle.getDirection() > 180 && circle.getDirection() < 270)
					circle.setDirection(360 - (circle.getDirection() - 180));
			}
			else if(x + radius >= width){
				if(circle.getDirection() == 0)
					circle.setDirection(180);
				if(circle.getDirection() > 0 && circle.getDirection() < 90)
					circle.setDirection(180 - circle.getDirection());
				if(circle.getDirection() > 270 && circle.getDirection() < 360)
					circle.setDirection(180 + (360 - circle.getDirection()));
			}
			//Opposite of what is expected since sin value is subtracted from current y position
			else if(y - radius <=0){
				if(circle.getDirection() == 90)
					circle.setDirection(270);
				if(circle.getDirection() > 0 && circle.getDirection() < 90)
					circle.setDirection(360 - circle.getDirection());
				if(circle.getDirection() > 90 && circle.getDirection() < 180)
					circle.setDirection(180 + (180 - circle.getDirection()));
			}
			else if(y + radius >= height){
				System.out.println(circle.getDirection());
				if(circle.getDirection() == 270)
					circle.setDirection(90);
				if(circle.getDirection() > 180 && circle.getDirection() < 270)
					circle.setDirection(180 - (circle.getDirection() - 180));
				if(circle.getDirection() > 270 && circle.getDirection() < 360)
					circle.setDirection(360 - circle.getDirection());
				
			}	
			circle.moveScreen();



			int x1 = circle1.getX();
			int y1 = circle1.getY();
			int radius1 = circle1.getRadius();
			if(x1 - radius1 <= 0){
				if(circle1.getDirection() == 180)
					circle1.setDirection(0);
				if(circle1.getDirection() > 90 && circle1.getDirection() < 180)
					circle1.setDirection(180 - circle1.getDirection());
				if(circle1.getDirection() > 180 && circle1.getDirection() < 270)
					circle1.setDirection(360 - (circle1.getDirection() - 180));
			}
			else if(x1 + radius1 >= width){
				if(circle1.getDirection() == 0)
					circle1.setDirection(180);
				if(circle1.getDirection() > 0 && circle1.getDirection() < 90)
					circle1.setDirection(180 - circle1.getDirection());
				if(circle1.getDirection() > 270 && circle1.getDirection() < 360)
					circle1.setDirection(180 + (360 - circle1.getDirection()));
			}
			//Opposite of what is expected since sin value is subtracted from current y position
			else if(y1 - radius1 <=0){
				if(circle1.getDirection() == 90)
					circle1.setDirection(270);
				if(circle1.getDirection() > 0 && circle1.getDirection() < 90)
					circle1.setDirection(360 - circle1.getDirection());
				if(circle1.getDirection() > 90 && circle1.getDirection() < 180)
					circle1.setDirection(180 + (180 - circle1.getDirection()));
			}
			else if(y1 + radius1 >= height){
				System.out.println(circle1.getDirection());
				if(circle1.getDirection() == 270)
					circle1.setDirection(90);
				if(circle1.getDirection() > 180 && circle1.getDirection() < 270)
					circle1.setDirection(180 - (circle1.getDirection() - 180));
				if(circle1.getDirection() > 270 && circle1.getDirection() < 360)
					circle1.setDirection(360 - circle1.getDirection());
				
			}	
			circle1.moveScreen();



			int x2 = circle2.getX();
			int y2 = circle2.getY();
			int radius2 = circle2.getRadius();
			if(x2 - radius2 <= 0){
				if(circle2.getDirection() == 180)
					circle2.setDirection(0);
				if(circle2.getDirection() > 90 && circle2.getDirection() < 180)
					circle2.setDirection(180 - circle2.getDirection());
				if(circle2.getDirection() > 180 && circle2.getDirection() < 270)
					circle2.setDirection(360 - (circle2.getDirection() - 180));
			}
			else if(x2 + radius2 >= width){
				if(circle2.getDirection() == 0)
					circle2.setDirection(180);
				if(circle2.getDirection() > 0 && circle2.getDirection() < 90)
					circle2.setDirection(180 - circle2.getDirection());
				if(circle2.getDirection() > 270 && circle2.getDirection() < 360)
					circle2.setDirection(180 + (360 - circle2.getDirection()));
			}
			//Opposite of what is expected since sin value is subtracted from current y position
			else if(y2 - radius2 <=0){
				if(circle2.getDirection() == 90)
					circle2.setDirection(270);
				if(circle2.getDirection() > 0 && circle2.getDirection() < 90)
					circle2.setDirection(360 - circle2.getDirection());
				if(circle2.getDirection() > 90 && circle2.getDirection() < 180)
					circle2.setDirection(180 + (180 - circle2.getDirection()));
			}
			else if(y2 + radius2 >= height){
				System.out.println(circle2.getDirection());
				if(circle2.getDirection() == 270)
					circle2.setDirection(90);
				if(circle2.getDirection() > 180 && circle2.getDirection() < 270)
					circle2.setDirection(180 - (circle2.getDirection() - 180));
				if(circle2.getDirection() > 270 && circle2.getDirection() < 360)
					circle2.setDirection(360 - circle2.getDirection());
				
			}	
			circle2.moveScreen();


			
			int x3 = circle3.getX();
			int y3 = circle3.getY();
			int radius3 = circle3.getRadius();
			if(x3 - radius3 <= 0){
				if(circle3.getDirection() == 180)
					circle3.setDirection(0);
				if(circle3.getDirection() > 90 && circle3.getDirection() < 180)
					circle3.setDirection(180 - circle3.getDirection());
				if(circle3.getDirection() > 180 && circle3.getDirection() < 270)
					circle3.setDirection(360 - (circle3.getDirection() - 180));
			}
			else if(x3 + radius3 >= width){
				if(circle3.getDirection() == 0)
					circle3.setDirection(180);
				if(circle3.getDirection() > 0 && circle3.getDirection() < 90)
					circle3.setDirection(180 - circle3.getDirection());
				if(circle3.getDirection() > 270 && circle3.getDirection() < 360)
					circle3.setDirection(180 + (360 - circle3.getDirection()));
			}
			//Opposite of what is expected since sin value is subtracted from current y position
			else if(y3 - radius3 <=0){
				if(circle3.getDirection() == 90)
					circle3.setDirection(270);
				if(circle3.getDirection() > 0 && circle3.getDirection() < 90)
					circle3.setDirection(360 - circle3.getDirection());
				if(circle3.getDirection() > 90 && circle3.getDirection() < 180)
					circle3.setDirection(180 + (180 - circle3.getDirection()));
			}
			else if(y3 + radius3 >= height){
				System.out.println(circle3.getDirection());
				if(circle3.getDirection() == 270)
					circle3.setDirection(90);
				if(circle3.getDirection() > 180 && circle3.getDirection() < 270)
					circle3.setDirection(180 - (circle3.getDirection() - 180));
				if(circle3.getDirection() > 270 && circle3.getDirection() < 360)
					circle3.setDirection(360 - circle3.getDirection());
				
			}	
			circle3.moveScreen();

			repaint();
		}
	}
}

