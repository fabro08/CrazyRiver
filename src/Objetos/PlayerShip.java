package Objetos;

import java.awt.Graphics2D;

import Interfaz.Game;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Sockets.Servidor;

public class PlayerShip {
	
	int X = 200;
	private Game game;
	private final int Y = 565;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	public int life= 100;
	public int fuel=40;
	public int bullets=40;
	private Image Nave= new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img//NAVE.png").getImage();;
	public boolean alive= true;
	public int proBullets = 0, diffusionBullets = 0, mayhemBullets = 0;

	
	
	public BasicBullets Basica;
	public PlayerShip (Game game){
		this.game = game;
	}
	

	public void move(int x) {
		if(X<=0){
			X=x+815;
		}
		else if(X>=815){
			X=x;
		}
	
		else if (x>0){
			X+=200;
			
		}
		else if(x<0){
			X-=200;;
			
		}
		
	
	//	if (X + Xa > 0 && X + Xa < game.getWidth()-60)
		//	X = X + Xa;
		
		
		
		System.out.println(X);
		
	}
	
	
	public void removesLife(int less){
		if (life < less){
			life = life-less;
		}
		else if(life >= less){
			kill();	
		}	
	}
	public void paint(Graphics2D g) 
	{
		g.drawImage(Nave, X, Y, WITH , HEIGHT, null);
	}
	public void keyReleased(KeyEvent e) {
		Xa = 0;
	}
	
	public void keyPressed(KeyEvent e) {
	
		if (e.getKeyCode() == KeyEvent.VK_A||e.getKeyCode() == KeyEvent.VK_J)
			Xa = -5;
		if (e.getKeyCode() == KeyEvent.VK_D||e.getKeyCode() == KeyEvent.VK_L)
			Xa = +5;
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			Basica = new BasicBullets(game,X,Y-35);
			game.nave1.shoot(1);
		}
		   
	}public Rectangle getBounds() {
		return new Rectangle(X, Y, WITH, HEIGHT);
	}

	public int getTopY() {
		return Y - HEIGHT;
}
	
	public void kill(){
		life = 0;
		alive = false;
	}
	
	public void shoot(int bullet){
		if (bullet == 2){
			if (proBullets > 0)
				//Dispara bala Pro
				proBullets--;
		}
		else if (bullet == 3){
			if (diffusionBullets > 0)
				//Dispara bala Difusion
				diffusionBullets--;
		}
		else if (bullet == 4){
			if (mayhemBullets > 0)
				//Dispara bala Mayhem
				mayhemBullets--;
		}
		else {
			game.bala = true;
			
		}
		
	}
	
	/*********
	 * 
	 * Getters del objeto nave
	 * 
	 ********/
	public int getLife(){
		return life;	
	}
	public int getFuel(){
		return fuel;	
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public int getProBullets() {
		return proBullets;
	}
	public int getDiffusionBullets() {
		return diffusionBullets;
	}
	public int getMayhemBullets() {
		return mayhemBullets;
	}

	/*********
	 * 
	 * Setters del objeto nave
	 * 
	 ********/
	public void setLife(int vida){
		this.life= vida;
	}
	public void setFuel(int combustible){
		this.fuel=combustible;
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setProBullets(int proBullets) {
		this.proBullets = proBullets;
	}
	public void setDiffusionBullets(int diffusionBullets) {
		this.diffusionBullets = diffusionBullets;
	}
	public void setMayhemBullets(int mayhemBullets) {
		this.mayhemBullets = mayhemBullets;
	}
	
}
