package Objetos;

/**
 * Clase BasicBullets
 * @author arturo
 *
 */
public class BasicBullets {
	public boolean alive;
	public int quantity;
	public int posX;
	public int posY;

	/**
	 Constructor de la clase
	 * @param posX - Parametro que indica la posicion en el eje X en donde
	 * debe de aparecer la bala
	 */
	public BasicBullets(int posX){
		this.alive = true;
		this.quantity = 10;
		this.posX = posX;
		this.posY = 0;
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
	public int getQuantity() {
		return quantity;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}

	/******
	 * Setters de la clase
	 ******/
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
