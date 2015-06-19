package Objetos;

import java.awt.Graphics2D;
import Interfaz.Game;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class PjNave {
	
	int x = 0;
	int xa = 0;
	private Game game;
	private final int Y = 565;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	public int life= 100;
	public int fuel=40;
	public int bullets=40;
	public int Btype=0;
	private Image Nave= new ImageIcon("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/NAVE.png").getImage();;
	
	public PjNave (Game game){
		this.game = game;
		
	}
	
	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
	}
	public void paint(Graphics2D g) 
	{
		g.drawImage(Nave, x, Y, WITH , HEIGHT, null);
		//g.fillRect(x,Y ,WITH, HEIGHT);
	}
	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A||e.getKeyCode() == KeyEvent.VK_J)
			xa = -5;
		if (e.getKeyCode() == KeyEvent.VK_D||e.getKeyCode() == KeyEvent.VK_L)
			xa = 5;
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
			xa=50;
	}public Rectangle getBounds() {
		return new Rectangle(x, Y, WITH, HEIGHT);
	}

	public int getTopY() {
		return Y - HEIGHT;
	}

	
	/*********
	 * 
	 * Tetodos Geters del objeto nave
	 * 
	 ********/
	public int getLife(){
		return life;	
	}
	public int getFuel(){
		return fuel;	
	}
	public int getbullets(){
		return bullets;	
	}
	public int getBtype(){
		return Btype;	
	}
	/*********
	 * 
	 * Tetodos Geters del objeto nave
	 * 
	 ********/
	public void setLife(int vida){
		this.life= vida;
	}
	public void setFuel(int combustible){
		this.fuel=combustible;
	}
	public void  setBullet(int balas){
		this.bullets=balas;
	}
	public void setBulleType(int tipoB){
		this.Btype=tipoB;
	}
	
}
