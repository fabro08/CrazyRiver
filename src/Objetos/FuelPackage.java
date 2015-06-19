package Objetos;

public class FuelPackage {
	public boolean alive;
	public int quantity;
	public int posX;
	public int posY;
	
	public FuelPackage(int quantity, int posX){
		this.alive = true;
		this.quantity = quantity;
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void disappear(){
		alive = false;
	}
	
	public void kill(){
		//Explosion
		alive = false;
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
	public void setPosX(int posX) {
		this.posX = posX;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
