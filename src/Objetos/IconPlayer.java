package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

public class IconPlayer {
	private LocalPath local = new LocalPath();
	public boolean alive;
	public int x = 0;
	public int y = 500;
	int xa = 1;
	int ya = 1;
	private Image Bala= new ImageIcon(local.getPath()+"NAVE.png").getImage();;
	private Game game;
	private final int WITH = 30;
	private final int HEIGHT = 30;

	

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public IconPlayer(Game game){
		this.game = game;
		this.alive = true;

	}
	
	/**
	 * Metodo que cambia las coordenadas de la bala, generando el movimiento
	 */
	

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
