package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
  protected int x;
  protected int y;
  protected int width;
  protected int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y, int width, int height) {
		super(x,y, width, height);
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
class MovingPolymorph extends Polymorph{

	public MovingPolymorph(int x, int y, int width, int height) {
		super(x,y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g) {

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x = x+10;
	}
}
