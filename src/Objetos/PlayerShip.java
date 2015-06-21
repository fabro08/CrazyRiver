package Objetos;

import java.awt.Graphics2D;

import Interfaz.Game;
import Utilities.Clock;
import Utilities.LocalPath;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PlayerShip {
	public int bulletType = 0;
	int X = 420;
	int Xa = 0;
	int cont = 0;
	boolean temp = true;
	boolean temp2 = true;
	public ArrayList<BasicBullets> balas = new ArrayList<BasicBullets>();
	public BasicBullets bullet;
	public ArrayList<ProBullets> pro = new ArrayList<ProBullets>();
	public ProBullets probullet;
	public ArrayList<DiffusionBullets> difusion = new ArrayList<DiffusionBullets>();
	public DiffusionBullets difbullet;
	public ArrayList<MayhemBullets> mayhem = new ArrayList<MayhemBullets>();
	public MayhemBullets mayhembullet;
	private Game game;
	private final int Y = 565;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private LocalPath local = new LocalPath();
	public int life;
	public int fuel = 40;
	public int bullets = 40;
	private Image Nave= new ImageIcon(local.getPath()+"NAVE.png").getImage();;
	public boolean alive = true;
	public int proBullets = 100, diffusionBullets = 100, mayhemBullets = 100;
	public BasicBullets Basica;
	public PlayerShip(Game game) {
		this.game = game;
		this.life = 80;

	}

	public void move(int x, int choose, boolean shoot, int arma) {
		if (choose == 1) {
			movePhone(x, shoot, arma);
		} else {

			if (X + Xa > 200 && X + Xa < game.getWidth() - 260)
				X = X + Xa;
		}
	}

	private void movePhone(int x, boolean shoot, int arma) {
		// System.out.println("tipo de arma "+arma);
		if (shoot == true) {
			if (arma == 1) {
				shoot(1);
			} else if (arma == 2) {

				shoot(2);
				game.nave1.seTBulletType(2);
			} else if (arma == 3) {
				shoot(3);
				game.nave1.seTBulletType(3);
			} else if (arma == 4) {
				shoot(4);
				game.nave1.seTBulletType(4);
			}

		}
		if (X + Xa > 200 && X + Xa < game.getWidth() - 260)
			X = X + Xa;
		if (x > 0) {

			X -= 20;

		} else
			X += 20;

	}

	public void removesLife(int less) {
		if (life > less) {
			life = life - less;
		} else if (life <= less) {
			kill();
			game.gameOver();
		}
	}

	public void paint(Graphics2D g) {
		g.drawImage(Nave, X, Y, WITH, HEIGHT, null);
	}

	public void keyReleased(KeyEvent e) {
		Xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_J) {
			Xa = -15;
		}
		if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_L) {
			Xa = 15;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			game.nave1.shoot(bulletType);
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			game.setEnemis(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			game.nave1.seTBulletType(1);
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			game.nave1.seTBulletType(2);
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			game.nave1.seTBulletType(3);
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			game.nave1.seTBulletType(4);
		}

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

	public void shoot(int bulletType) {
		if (bulletType == 2) {
			if (game.nave1.proBullets > 0) {
				System.out.println("Estoy intentando distaparar pro: "
						+ proBullets);
				probullet = new ProBullets(game, X, Y - 35);
				pro.add(probullet);
				proBullets--;
			}
		} else if (bulletType == 3) {
			if (diffusionBullets > 0) {
				System.out.println("Intentando disparar difusion");
				System.out.println(diffusionBullets);
				DiffusionBullets difbullet = new DiffusionBullets(game, X-100,Y - 35);
				difusion.add(difbullet);
				
				DiffusionBullets difbullet2 = new DiffusionBullets(game, X-50 ,Y - 35);
				difusion.add(difbullet2);
				
				DiffusionBullets difbullet3 = new DiffusionBullets(game, X - 5, Y - 35);
				difusion.add(difbullet3);
				
				DiffusionBullets difbullet4 = new DiffusionBullets(game, X+50 ,Y - 35);
				difusion.add(difbullet4);
				
				DiffusionBullets difbullet5 = new DiffusionBullets(game, X+100 ,Y - 35);
				difusion.add(difbullet5);
				
				diffusionBullets--;
			}
		} else if (bulletType == 4) {
			if (mayhemBullets > 0) {
				mayhembullet = new MayhemBullets(game, X, Y - 35);
				MayhemBullets mayhembullet2 = new MayhemBullets(game, 10, Y);
				MayhemBullets mayhembullet3 = new MayhemBullets(game, 100, Y);
				mayhem.add(mayhembullet);
				mayhem.add(mayhembullet2);
				mayhem.add(mayhembullet3);
				MayhemBullets mayhembullet4 = new MayhemBullets(game, 250, Y);
				mayhem.add(mayhembullet4);
				MayhemBullets mayhembullet5 = new MayhemBullets(game, X, Y);
				mayhem.add(mayhembullet5);
				MayhemBullets mayhembullet6 = new MayhemBullets(game, 600, Y);
				mayhem.add(mayhembullet6);
				cont++;
				// Dispara bala Mayhem
				mayhemBullets--;
			}
		} else {
			bullet = new BasicBullets(game, X, Y - 35);
			balas.add(bullet);
			cont++;
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
		if(this.life < 100){
			if(this.life+vida>100){
				this.life = 100;
			  if(life+vida< 100){
				this.life = life+vida;}
			}	
		}
		else{
			this.life=life;
		}
	}
	public void setFuel(int combustible){
		this.fuel=combustible;
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setProbullets(int recarga){
		if (proBullets<40){
			if(this.proBullets+recarga>40){
				this.proBullets = 40;
			}else{
				this.proBullets = proBullets+recarga;
			}
			
		}else{
			this.proBullets = 40;
			
		}
		
	}
	public void setDiffusionBullets(int diffusionBullets) {
		this.diffusionBullets = diffusionBullets;
	}
	public void setMayhemBullets(int mayhemBullets) {
		this.mayhemBullets = mayhemBullets;
	}
	public void seTBulletType(int bulletType){
		this.bulletType = bulletType;
	}
	
}
