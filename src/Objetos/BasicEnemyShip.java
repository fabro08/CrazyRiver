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
			kill();
		}
	}
	
	/**
	 * Metodo que mata la nave
	 */
	public void kill(){
		life = 0;
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
	
	/**
	 * Metodo que cambia las coordenadas de la nave, ocacionando el movimiento
	 */
	public void move(){
		
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
	
	

}
