package Objetos;

import java.awt.Graphics2D;

import Interfaz.Game;
import Utilities.LocalPath;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PhoneShip {

	int X = 420;
	int Xa = 0;
	int cont = 0;
	public ArrayList<BasicBullets> balas = new ArrayList<BasicBullets>();
	public BasicBullets bullet;
	private Game game;
	private LocalPath local = new LocalPath();
	private final int Y = 565;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 30;
	public int life = 100;
	public int fuel = 40;
	public int bullets = 40;
	private Image Nave = new ImageIcon(local.getPath()+"NAVE.png").getImage();;
	public boolean alive = true;
	public int proBullets = 0, diffusionBullets = 0, mayhemBullets = 0;
	public BasicBullets Basica;
	int se=0;

	public PhoneShip(Game game) {
		this.game = game;

	}

	public void move(int x,boolean shoot) {
		
		if (shoot == true) {
			System.out.println("disparando");
			bullet = new BasicBullets(game, X, Y - 35);
			balas.add(bullet);
			cont++;
			game.nave1.shoot(1);

		}

		if (x > 0) {
			X -= 20;

		} else
			X += 20;

		
		
	}




	public void removesLife(int less) {
		if (life < less) {
			life = life - less;
		} else if (life >= less) {
			kill();
		}
	}

	public void paint(Graphics2D g) {
		g.drawImage(Nave, X, Y, WITH, HEIGHT, null);
	}


	public Rectangle getBounds() {
		return new Rectangle(X, Y, WITH, HEIGHT);
	}

	public int getTopY() {
		return Y - HEIGHT;
	}

	public void kill() {
		life = 0;
		alive = false;
	}

	public void shoot(int bullet) {
		if (bullet == 2) {
			if (proBullets > 0)
				// Dispara bala Pro
				proBullets--;
		} else if (bullet == 3) {
			if (diffusionBullets > 0)
				// Dispara bala Difusion
				diffusionBullets--;
		} else if (bullet == 4) {
			if (mayhemBullets > 0)
				// Dispara bala Mayhem
				mayhemBullets--;
		} else {
			game.bala = true;

		}

	}

	/*********
	 * 
	 * Getters del objeto nave
	 * 
	 ********/
	public int getLife() {
		return life;
	}

	public int getFuel() {
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
	public  int getCodigo(){
		return se;
	
	}

	/*********
	 * 
	 * Setters del objeto nave
	 * 
	 ********/
	public void setCodigo(int codigo){
		this.se = codigo;
	}
	public void setLife(int vida) {
		this.life = vida;
	}

	public void setFuel(int combustible) {
		this.fuel = combustible;
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
