package Objetos;

public class City {
	public boolean fuel;
	public boolean dome;
	public int posX;
	public int posY;
	
	public City(int intFuel, int intDome, int posX){
		if (intFuel == 0){
			this.fuel = false;
		} else {
			this.dome = true;
		}
		if (intDome == 0){
			this.dome = false;
		} else {
			this.dome = true;
		}
		this.posX = posX;
		this.posY = 0;		
	}
	
	public void move(){
		
	}
	
	/******
	 * Getters de la clase
	 ******/
	public boolean hasFuel() {
		return fuel;
	}
	public boolean hasDome() {
		return dome;
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
	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}
	public void setDome(boolean dome) {
		this.dome = dome;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
