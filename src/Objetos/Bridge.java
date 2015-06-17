package Objetos;

public class Bridge {
	public int life;
	public boolean alive;
	
	public Bridge(int life){
		this.life = life;
		this.alive = true;
	}
	/**
	 * Metodo que reduce la vida del puente por cada disparo
	 */
	public void removesLife(){
		if (life < 1)
			life--;
		else{
			life = 0;
			alive = false;
		}
	}
	/**
	 * Metodo que cambia la vida del puente a false, indicando que debe desaparecer
	 */
	public void kill(){
		alive = false;		
	}
	
	/**
	 * Funcion que retorna si el puente sigue con vida	
	 * @return - booleano indicando si el puente sigue con vida
	 */
	public boolean itsAlive() {
		return alive;
	}
	
	/*********
	 * 
	 * Getters del objeto Bridge
	 * 
	 ********/
	public int getLife() {
		return life;
	}

	/*********
	 * 
	 * Setters del objeto Bridge
	 * 
	 ********/
	public void setLife(int life) {
		this.life = life;
	}

}
