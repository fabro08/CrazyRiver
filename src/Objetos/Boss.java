package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;

public class Boss {
	public boolean alive;
	public int life;
	public int motion; // defensivo = 0, ofensivo = 1
	public int X, Y;
	private Game game;
	private Image BOSS= new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/kami.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int xa = 1;
	int ya = 1;
	
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
		g.drawImage(BOSS, X, Y, WITH , HEIGHT, null);
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void removesLife(int less){
		if (life > less)
			life = life - less;
		else
			kill();	
	}
	
	public void kill(){
		life = 0;
		alive = false;
	}
	
	
	public void defensiveMove(){
		
	}
	
	public void offensiveMove(){
		
	}
}


