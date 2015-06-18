package Objetos;

public class Bridge {
	public int life;
	public boolean alive;
	public int posX;
	public int posY;
	
	public Bridge(int life){
		this.life = life;
		this.alive = true;
		this.posX = 100;
		this.posY = 0;
	}
	
	/**
	 * Funcion que retorna si el puente sigue con vida	
	 * @return - booleano indicando si el puente sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}
	/**
	 * Metodo que reduce la vida del puente por cada disparo
	 */
	public void removesLife(){
		if (life < 1)
			life--;
		else{
			kill();
		}
	}
	/**
	 * Metodo que cambia la vida del puente a false, indicando que debe desaparecer
	 */
	public void kill(){
		this.life = 0;
		this.alive = false;		
	}
	
	public void move(){
		
	}

	
	/*********
	 * 
	 * Getters del objeto Bridge
	 * 
	 ********/
	public int getLife() {
		return life;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}

	/*********
	 * 
	 * Setters del objeto Bridge
	 * 
	 ********/
	public void setLife(int life) {
		this.life = life;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

}
