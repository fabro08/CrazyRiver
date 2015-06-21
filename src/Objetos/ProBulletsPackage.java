package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.Aleatorio;
import Utilities.LocalPath;

/**
 * Clase ProBullets
 * @author arturo
 *
 */
public class ProBulletsPackage {
	private Game game;
	private LocalPath local = new LocalPath();
	public Aleatorio random = new Aleatorio();
	public int life;
	public boolean alive;
	public int X=random.getNewRandon(400, 640);
	public int Y;
	private Image pro= new ImageIcon(local.getPath()+"ProBulletsPag.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int ya = 2;
	
	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 * @param posY - Parametro que indica la posicion en el eje Y en donde
	 * debe de aparecer la bala
	 */
	public ProBulletsPackage(Game game){
		this.game = game;
		this.life = 2;
		this.alive = true;
		this.X = 450;
		this.Y = 20;	
	}
	public void move() {
		
		if(collision()){
			game.nave1.setProbullets(20);
			game.setPaqBalas(false);
			
		
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
		g.drawImage(pro, X, Y, WITH , HEIGHT-25, null);
	}
	
	/**
	 * Funcion que retorna si la bala sigue con vida o debe desaparecer
	 * @return - booleano indicando si la bala sigue con vida
	 */
	public boolean itsAlive() {
		return alive;		
	}
	
	/**
	 * Metodo que cambia el estado de la bala, indicando que debe desaparecer
	 * de la pantalla
	 */
	public void disappears(){
		alive = false;		
	}
	
	/**
	 * Metodo que cambia las coordenadas de la bala, generando el movimiento
	 */
	
	
	/******
	 * Getters de la clase
	 ******/

	public int getPosX() {
		return X;
	}
	public int getPosY() {
		return Y;
	}
	
	/******
	 * Setters de la clase
	 */
	
	public void setPosX(int posX) {
		this.X = posX;
	}
	public void setPosY(int posY) {
		this.Y = posY;
	}

	
		


}