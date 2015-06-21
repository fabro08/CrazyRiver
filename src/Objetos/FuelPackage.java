package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

public class FuelPackage {
	private Game game;
	private LocalPath local = new LocalPath();
	public int life;
	public boolean alive;
	public int X;
	public int Y;
	private Image fuel= new ImageIcon(local.getPath()+"fuel.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int ya = 2;
	
	public FuelPackage (Game game){
		this.game = game;
		this.life = 2;
		this.alive = true;
		this.X = 450;
		this.Y = 20;
	}
	
	public void move() {
		if(collision()){
			game.setfuel(false);
		}
	    Y = Y + ya;
	}
	
	private boolean collision() {
		return game.nave1.getBounds().intersects(getBounds());
	}	
	public Rectangle getBounds() {
		return new Rectangle(X, Y, 40, 40);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(fuel, X, Y, WITH , HEIGHT-25, null);
	}
	
	public void removesLife(){
		kill();
		
	}
	
	public int getTopY() {
		return Y - HEIGHT;
	}

	public void kill(){
		life = 0;
		alive = false;	
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	/******
	 * Getters de la clase
	 ******/
	public int getX() {
		return X;
	}
	public int getPosY() {
		return Y;
	}
	
	/******
	 * Setters de la clase
	 * 
	 ******/
	public void setX(int X) {
		this.X = X;
	}



	public void setPosY(int posY) {
		this.Y = posY;
	}
}