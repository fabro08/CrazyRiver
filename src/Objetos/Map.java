package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

/**
 * Clase BasicBullets
 * 
 * @author arturo
 *
 */
public class Map {
	private LocalPath local = new LocalPath();
	public boolean alive;
	public int x = 3;
	public int y = 500;
	int xa = 1;
	int ya = 1;
	private Image Mapa1 = new ImageIcon(local.getPath() + "mapa1.png")
			.getImage();
	private Image Mapa2 = new ImageIcon(local.getPath() + "mapa2.png")
			.getImage();
	private Image Mapa3 = new ImageIcon(local.getPath() + "mapa3.png")
			.getImage();
	private Image Mapa4 = new ImageIcon(local.getPath() + "mapa4.png")
			.getImage();
	private Image Mapa5 = new ImageIcon(local.getPath() + "mapa5.png")
			.getImage();

	private Game game;
	private final int WITH = 150;
	private final int HEIGHT = 150;
	private final int DIAMETER = 30;

	/**
	 * Constructor de la clase
	 * 
	 * @param posX
	 *            - Parametro que indica la posicion en el eje X en donde debe
	 *            de aparecer la bala
	 */
	public Map(Game game) {
		this.game = game;
		this.alive = true;

	}

	/**
	 * Metodo que cambia las coordenadas de la bala, generando el movimiento
	 */

	public void paint(Graphics2D g) {
		if (game.getValorBoss() == 1) {

			g.drawImage(Mapa1, x, y, WITH, HEIGHT, null);
		} else if (game.getValorBoss() == 2) {

			g.drawImage(Mapa2, x, y, WITH, HEIGHT, null);
		} else if (game.getValorBoss() == 3) {

			g.drawImage(Mapa3, x, y, WITH, HEIGHT, null);
		}
		else if (game.getValorBoss()==4){
			
			g.drawImage(Mapa4, x, y, WITH , HEIGHT, null);
		}
		else if (game.getValorBoss()==5){
			
			g.drawImage(Mapa5, x, y, WITH , HEIGHT, null);
		}

	}

	/**
	 * Funcion que retorna si la bala sigue con vida o debe desaparecer
	 * 
	 * @return - booleano indicando si la bala sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}

	/**
	 * Metodo que cambia el estado de la bala, indicando que debe desaparecer de
	 * la pantalla
	 */
	public void disappears() {
		alive = false;
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
