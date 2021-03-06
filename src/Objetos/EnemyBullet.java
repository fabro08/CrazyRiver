package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.LocalPath;

public class EnemyBullet {
	private LocalPath local = new LocalPath();
	public boolean alive;
	public int x;
	public int y;
	int xa = 1;
	int ya = 1;
	private Image Bala= new ImageIcon(local.getPath()+"bala.png").getImage();;
	private Game game;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 30;

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public EnemyBullet(Game game, int x, int y){
		this.game = game;
		this.alive = true;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo que cambia las coordenadas de la bala, generando el movimiento
	 */
	public void move() {
		if (y - ya < 0)
			ya = 1;		
		if(collision()){
			game.setEnemis(false);
			game.setPuente(false);
			game.setBoss(false);
		}
		//x = x - xa;
		y = y - 5;
	}
	
	private boolean collision() {
		/*if (game.getKamyEnemy()){
			return game.kamik.getBounds().intersects(getBounds());}
		else if (game.getBridge()){
			return game.puente.getBounds().intersects(getBounds());}*/
		//return alive;
		//return game.puente.getBounds().intersects(getBounds());
		return game.puente.getBounds().intersects(getBounds());
		
		
		}
		
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 10);
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



