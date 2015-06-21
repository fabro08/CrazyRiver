package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.sound.midi.VoiceStatus;
import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

public class Backgraund{
	private Game game;
	private LocalPath local = new LocalPath();
	public int X;
	public int Y;
	private Image background= new ImageIcon(local.getPath()+"background.jpg").getImage();;
	int xa = 1;
	int ya = 1;
	
	public Backgraund(Game game){
		this.game = game;
		this.X = 0;
		this.Y = -941;
	}
	
	public void move() {
		if (Y + ya < 200){
			Y = Y + ya;
			}
		
		//if(Y==0){
		//	setPosY(-941);
		//}
	}
	
	private boolean collision() {
		return game.nave1.getBounds().intersects(getBounds());
	}	
	public Rectangle getBounds() {
		return new Rectangle(X, Y, 40, 40);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(background, X,Y, null);
	
	}
	
	public int getTopY() {
		return Y;
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