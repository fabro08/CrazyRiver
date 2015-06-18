package Objetos;

import java.awt.Graphics2D;

import Interfaz.Game;
import Interfaz1.Game2;

/**
 * Clase BasicBullets
 * @author arturo
 *
 */
public class BasicBullets {
	public boolean alive;
	public int x;
	public int y;
	int xa = 1;
	int ya = 1;
	private Game game;
	private final int DIAMETER = 30;

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public BasicBullets(Game game){
		this.game = game;
		this.alive = true;
		this.x = 100;
		this.y = 100;
	}
	public void move() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > game.getWidth() - DIAMETER)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > game.getHeight()-DIAMETER)//Margen inferior
			game.gameOver();
		/*if(collision()){
			ya = -1;
			y = game.racquet.getTopY() - DIAMETER;
		}*/
		x = x + xa;
		y = y + 5;
	}
	public void paint(Graphics2D g) 
	{
		g.fillOval(x, y, 10, 10);
		
		
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
	public void mover(){

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
