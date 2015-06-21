package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.Aleatorio;
import Utilities.LocalPath;

/**
 * Clase BasicBullets
 * @author arturo
 *
 */
public class ProBullets {
	private LocalPath local = new LocalPath();
	public boolean alive;
	public int x;
	public int y;
	int xa = 1;
	int ya = 1;
	private Image Bala= new ImageIcon(local.getPath()+"balaPro.png").getImage();;
	private Game game;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 30;
	public Aleatorio RBvida = new Aleatorio();

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 * @return 
	 */

	
	public ProBullets(Game game, int x, int y){
		this.game = game;
		this.alive = true;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo que cambia las coordenadas de la bala, generando el movimiento
	 */
	public void move() {
	
		if(collision1()){
		
			game.setEnemis(false);
		}
		else if(collision2()){
			
			game.jefe.setLife(1);
			
		}
		else if(collision3()){
			game.setVida(false);
		}
		y = y - 3;
	}
	
	private boolean collision1() {//colicion con el kamik
		return game.kamik.getBounds().intersects(getBounds());	
		}
	private boolean collision2() {//colicion con el boss
		return game.jefe.getBounds().intersects(getBounds());	
		}
	private boolean collision3() {//colicion con la vida
		return game.vida.getBounds().intersects(getBounds());	
		}
		
	
	public Rectangle getBounds() {
		return new Rectangle(x, y,30, 30);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(Bala, x, y, WITH , HEIGHT, null);
		
		
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
		alive = true;
	}



	/******
	 * Getters de la clase
	 ******/
	public int getPosX() {
		return x;
	}
	public int getPosY() {
		return y;
	}

	/******
	 * Setters de la clase
	 ******/
	public void setPosX(int posX) {
		this.x = posX;
	}
	public void setPosY(int posY) {
		this.y = posY;
	}
}
