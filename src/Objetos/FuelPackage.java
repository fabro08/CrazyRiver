package Objetos;

public class FuelPackage {
	public boolean alive;
	public int quantity;
	
	public FuelPackage(int quantity){
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

	public int getQuantity() {
		return quantity;
	}
}
