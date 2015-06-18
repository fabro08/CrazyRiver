package Objetos;

public class PersecutorShip {
	int life;
	public boolean alive;
	public int posX;
	public int posY;
	
	public PersecutorShip(){
		this.life = 4;
		this.alive = true;
		this.posX = 0;
		this.posY = 0;
	}
	
	public void removesLife(){
		if (life == 4){
			life = life-4;
		} else {
			kill();
		}
	}

	private void kill() {
		life = 0;
		alive = false;
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void shoot(){
		
	}
	
	/**
	 * Metodo que cambia las coordenadas de la nave, ocacionando el movimiento
	 */
	public void mover(){
		
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
