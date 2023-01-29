package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Polymorph {
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public abstract void update();

	public abstract void draw(Graphics g);
}

class RedPolymorph extends Polymorph {

	public RedPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
		g.fillRect(y, x, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
}

class MovingPolymorph extends Polymorph {

	public MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
//		MovingPolymorph movingMorph = new MovingPolymorph(x, y, width, height);
		Random ran = new Random();
		for (int i = 0; i < 30; i++) {
			x = x + ran.nextInt(4);
			y = y + ran.nextInt(3);
		}
		for (int i = 0; i < 30; i++) {
			x = x - ran.nextInt(4);
			y = y - ran.nextInt(3);
		}

	}
}

 class MousePolymorph extends Polymorph implements MouseMotionListener{


	public MousePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		// TODO Auto-generated constructor stub
	}
	
	public int getMouseX(MouseEvent arg0) {
//		mouseX = arg0.getX();
		return x;

	}
	
	public int getMouseY(MouseEvent arg0) {
//		mouseY = arg0.getY();
		return y;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub


	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x = arg0.getX();
		y = arg0.getY();
	}
	

 }


class MessagePolymorph extends Polymorph implements MouseListener{

	public MessagePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.PINK);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
if(e.getX()<475 && e.getY()>425) {
	if(e.getY()<450 && e.getY()>400) {
		JOptionPane.showMessageDialog(null, "Good Job! You clicked me! :)");
	}
}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
