package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

/**
 * Clase DiffusionBullets
 * @author arturo
 *
 */
public class DiffusionBullets {
	public boolean alive;
	private LocalPath local = new LocalPath();
	int xa = 1;
	int ya = 1;
	private Image Bala= new ImageIcon(local.getPath()+"balaPro.png").getImage();;
	private Game game;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	public int x;
	public int y;

	/**
	 Constructor de la clase
	 * @param x - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public DiffusionBullets(Game game, int x, int y){
		this.game = game;
		this.alive = true;
		this.x = x;
		this.y = y;
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
	public void move(){
		if (y - ya < 0)
			ya = 1;		
		if(collision()){
			game.setEnemis(false);
			game.setPuente(false);
		}
		y = y - 5;

	}
	
	public void move2(){
		if (x - xa < 0)
			xa = 1;		
		if(collision()){
			game.setEnemis(false);
			game.setPuente(false);
		}
		x = x - 5;
		
	}
	
	private boolean collision() {
		return game.puente.getBounds().intersects(getBounds());
		
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 10);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(Bala, x, y, WITH , HEIGHT, null);
		
		
	}

	/******
	 * Getters de la clase
	 ******/
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}

	/******
	 * Setters de la clase
	 ******/
	public void setx(int x) {
		this.x = x;
	}
	public void sety(int y) {
		this.y = y;
	}
}
