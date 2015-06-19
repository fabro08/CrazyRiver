package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.sound.midi.VoiceStatus;
import javax.swing.ImageIcon;

import Interfaz.Game;

public class KamikazeShip {
	private Game game;
	public int life;
	public boolean alive;
	public int X;
	public int Y;
	private Image Kami= new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/kami.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int xa = 1;
	int ya = 1;
	
	public KamikazeShip(Game game){
		this.game = game;
		this.life = 2;
		this.alive = true;
		this.X = 450;
		this.Y = 20;
	}
	
	public void move() {
		if (X + xa < 0)
		if (X + xa > game.getWidth() - DIAMETER)
			xa = -1;
		if(collision()){
			game.nave1.removesLife(50);
			game.setEnemis(false);
			
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
		g.drawImage(Kami, X, Y, WITH , HEIGHT, null);
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
