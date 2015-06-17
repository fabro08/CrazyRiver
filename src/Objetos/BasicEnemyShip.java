package Objetos;

public class BasicEnemyShip {
	public int life;
	public int shipType;
	public boolean alive;
	public int posX;
	public int posY;
	
	public BasicEnemyShip(int life, int shipType){
		this.life = life;
		this.shipType = shipType;
	}
	
	/**
	 * Metodo que reduce la vida de las naves basicas por cada disparo
	 */
	public void removesLife(){
		if (life < 2){
			life = life-2;
		}
		else{
			life = 0;
			alive = false;
		}
	}
	
	/**
	 * Metodo que cambia la vida de la nave a false, indicando que debe desaparecer
	 */
	public void kill(){
		alive = false;		
	}
	
	/**
	 * Funcion que retorna si la nave sigue con vida	
	 * @return - booleano indicando si la nave sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}
	
	/**
	 * Funcion para realizar el disparo
	 */
	public void shoot(){
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	/**
	 * Funcion que mueve la nave
	 */
	public void mover(){
		
	}

}
