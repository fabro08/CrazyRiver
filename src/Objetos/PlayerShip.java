package Objetos;

public class PlayerShip {
	
	public int life;
	public int fuel;
	public int bullets;
	public int Btype; //Esta variable es para saber que tipo de bala tiene
	public int posX;
	public int posY;
	
	public PlayerShip (int vida,int combustible,int balas,int typo){
		this.life= vida;
		this.fuel=combustible;
		this.bullets = balas;
		this.Btype = typo;
		this.posX = 600;
		this.posY = 600;
	}
	
	/*********
	 * 
	 * Getters del objeto nave
	 * 
	 ********/
	public int getLife(){
		return life;	
	}
	public int getFuel(){
		return fuel;	
	}
	public int getbullets(){
		return bullets;	
	}
	public int getBtype(){
		return Btype;	
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	/*********
	 * 
	 * Setters del objeto nave
	 * 
	 ********/
	public void setLife(int vida){
		this.life= vida;
	}
	public void setFuel(int combustible){
		this.fuel=combustible;
	}
	public void  setBullet(int balas){
		this.bullets=balas;
	}
	public void setBulleType(int tipoB){
		this.Btype=tipoB;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
