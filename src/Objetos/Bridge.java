package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

public class Bridge {
	private Game game;
	private LocalPath local = new LocalPath();
	public int life;
	public boolean alive;
	public int X;
	public int Y;
	private Image bridge= new ImageIcon(local.getPath()+"Bridge.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int xa = 1;
	int ya = 1;
	
	public Bridge(Game game){
		this.game = game;
		this.life = 0; //agregar vida aleatoria 
		this.alive = true;
		this.X = 400;
		this.Y = 0;
	}
	public void move() {
		if (X + xa < 0)
		if (X + xa > game.getWidth() - DIAMETER)
			xa = -1;
		if(collision()){
			game.nave1.removesLife(50);
			game.setPuente(false);  
			
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
		g.drawImage(bridge, X, Y, WITH , HEIGHT, null);
	}
	
	/**
	 * Funcion que retorna si el puente sigue con vida	
	 * @return - booleano indicando si el puente sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}
	/**
	 * Metodo que reduce la vida del puente por cada disparo
	 */
	public void removesLife(){
		if (life < 1)
			life--;
		else{
			kill();
		}
	}
	/**
	 * Metodo que cambia la vida del puente a false, indicando que debe desaparecer
	 */
	public void kill(){
		this.life = 0;
		this.alive = false;		
	}
	

	
	/*********
	 * 
	 * Getters del objeto Bridge
	 * 
	 ********/
	public int getLife() {
		return life;
	}
	public int getPosX() {
		return X;
	}
	public int getPosY() {
		return Y;
	}

	/*********
	 * 
	 * Setters del objeto Bridge
	 * 
	 ********/
	public void setLife(int life) {
		this.life = life;
	}
	public void setPosX(int posX) {
		this.X = posX;
	}
	public void setPosY(int posY) {
		this.Y = posY;
	}

}
