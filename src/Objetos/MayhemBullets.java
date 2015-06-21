package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import Interfaz.Game;

/**
 * Clase MayhemBullets
 * @author arturo
 *
 */
public class MayhemBullets {
	public boolean alive;
	public int x;
	public int y;
	
	private Image BalaMayhem= new ImageIcon("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/Mayhem.png").getImage();;
	private Game game;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 30;

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public MayhemBullets(Game game, int posX, int posY){
		this.game = game;
		this.x = posX;
		this.y = posY;
	}

	/**
	 * Funcion que retorna si la bala sigue con vida o debe desaparecer
	 * @return - booleano indicando si la bala sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}
	public void paint(Graphics2D g) 
	{
		g.drawImage(BalaMayhem, x, y, WITH , HEIGHT, null);
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
		y = y - 3;
		

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
