package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.Random;

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
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		MovingPolymorph movingMorph = new MovingPolymorph(x, y, width, height);
		Random ran = new Random();
		for (int i = 0; i < 30; i++) {
			x = x + ran.nextInt(5);
			y = y + ran.nextInt(4);
		}
		for (int i = 0; i < 30; i++) {
			x = x - ran.nextInt(5);
			y = y - ran.nextInt(4);
		}

	}
}

class MousePolymorph extends Polymorph implements MouseMotionListener{

	public MousePolymorph(int x, int y, int width, int height) {
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
		g.setColor(Color.CYAN);
		g.drawRect(x, y, width, height);
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
	}
}
