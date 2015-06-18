package Objetos;

public class PlayerShip {
	
	public int life;
	public boolean alive;
	public int fuel;
	public int proBullets, diffusionBullets, mayhemBullets;
	public int posX;
	public int posY;
	
	public PlayerShip (int vida,int combustible){
		this.life= vida;
		this.fuel=combustible;
		this.proBullets = this.diffusionBullets = this.mayhemBullets = 0;
		this.posX = 600;
		this.posY = 600;
	}
	
	public void removesLife(int less){
		if (life < less){
			life = life-less;
		}
		else if(life >= less){
			kill();	
		}	
	}
	
	public void kill(){
		life = 0;
		alive = false;
	}
	
	public void shoot(int bullet){
		if (bullet == 2){
			if (proBullets > 0)
				//Dispara bala Pro
				proBullets--;
		}
		else if (bullet == 3){
			if (diffusionBullets > 0)
				//Dispara bala Difusion
				diffusionBullets--;
		}
		else if (bullet == 4){
			if (mayhemBullets > 0)
				//Dispara bala Mayhem
				mayhemBullets--;
		}
		else {
			//Dispara bala basica
		}
		
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
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public int getProBullets() {
		return proBullets;
	}
	public int getDiffusionBullets() {
		return diffusionBullets;
	}
	public int getMayhemBullets() {
		return mayhemBullets;
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
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public void setProBullets(int proBullets) {
		this.proBullets = proBullets;
	}
	public void setDiffusionBullets(int diffusionBullets) {
		this.diffusionBullets = diffusionBullets;
	}
	public void setMayhemBullets(int mayhemBullets) {
		this.mayhemBullets = mayhemBullets;
	}
	
}
