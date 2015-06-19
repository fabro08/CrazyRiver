package Objetos;

public class LifePackage {
	public boolean alive;
	boolean toxic;
	public int quantity;
	int posX, posY;
	
	
	public LifePackage(int quantity, int posX){
		this.alive = true;
		this.toxic = false;
		this.quantity = quantity;
		this.posX = posX;
		this.posY = 0;
	}
	
	public boolean itsalive(){
		return alive;
	}
	
	public void disappears(){
		kill();		
	}
	
	public void makeToxic(){
		this.toxic = true;
	}
	
	public void kill(){
		this.alive = false;
	}
	
	public void mover(){
		
	}
	/********
	 * Getters de la clase
	 ********/
	public int getQuantity() {
		return quantity;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	/********
	 * Setters de la clase
	 ********/
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
