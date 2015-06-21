package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.Aleatorio;
import Utilities.LocalPath;

public class LifePackage {
	public Aleatorio random = new Aleatorio();
	private Game game;
	private LocalPath local = new LocalPath();
	public int life;
	public boolean alive;
	public int X=random.getNewRandon(200, 440);
	public int Y;
	private Image Life= new ImageIcon(local.getPath()+"Life.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int ya = 2;
	
	public LifePackage (Game game){
		this.game = game;
		this.life = 2;
		this.alive = true;
		this.X = 450;
		this.Y = 20;
	}
	
	public void move() {
		if(collision()){
			game.setVida(false);
			game.nave1.setLife(random.getNewRandon(30, 40));
			game.vida.setPosY(-65);

			
			
		}
	    Y = Y + ya;
	}
	
	private boolean collision() {
		return game.nave1.getBounds().intersects(getBounds());
	}	
	public Rectangle getBounds() {
		return new Rectangle(X, Y, WITH, HEIGHT-25);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(Life, X, Y, WITH , HEIGHT-25, null);
	}
		
	public int getTopY() {
		return Y - HEIGHT;
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
