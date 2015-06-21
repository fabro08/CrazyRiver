package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;

public class Points {
	int X = 0;
	int Y = 0;
	int xa = 1;
	int ya = 2;
	private final int DIAMETER = 30;
	private Image points= new ImageIcon("/media/Respaldo/CrazyRiver/src/img/puntos.png").getImage();;
	private Game game;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	
	
	public Points (Game game){
		this.X = 450;
		this.Y = 20;
	}
	
	public void move() {
			if (X + xa < 0)
				xa = 1;
			if (X + xa > 840)
				xa = -1;
			if (Y + ya < 0)
				ya = 1;
			if (Y + ya > 610){//Margen inferior
				ya = -1;}
			if (collision()){
				//GANAR PUNTOS
			}
				
			
			
			X = X + xa;
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
		g.drawImage(points, X, Y, WITH , HEIGHT-25, null);
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