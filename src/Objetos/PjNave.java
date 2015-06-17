package Objetos;

public class PjNave {
	
	public int life;
	public int fuel;
	public int bullets;
	public int Btype; //Esta variable es saber si tiene un tipo especial de bala True y False bala Normal
	
	public PjNave (int vida,int combustible,int balas,int typo){
		this.life= vida;
		this.fuel=combustible;
		this.bullets = balas;
		this.Btype = typo;
		
	}
	
	/*********
	 * 
	 * Tetodos Geters del objeto nave
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
	/*********
	 * 
	 * Tetodos Geters del objeto nave
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
	
}
