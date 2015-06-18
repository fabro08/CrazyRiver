package Objetos;

public class Reward {
	public boolean alive;
	public int points;
	public int posX;
	public int posY;
	
	public Reward(int points, int posX){
		this.alive = true;
		this.points = points;
		this.posX = posX;
		this.posY = 0;
		
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void disappear(){
		alive = false;
	}
	
	public void move(){
		/*
		 * Overwrite
		 */
	}
	
	/******
	 * Getters de la clase
	 ******/
	public int getPoints() {
		return points;
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
	public void setPoints(int points) {
		this.points = points;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	

}
