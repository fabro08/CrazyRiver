package Objetos;

public class Boss {
	public boolean alive;
	public int life;
	public int motion; // defensivo = 0, ofensivo = 1
	public int posX, posY;
	
	public Boss(int life, int posX){
		this .alive = true;
		this.life = life;
		this.motion = 0;
		this.posX = posX;
		this.posY = 0;
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void removesLife(int less){
		if (life > less)
			life = life - less;
		else
			kill();	
	}
	
	public void kill(){
		life = 0;
		alive = false;
	}
	
	public void move(int motion){
		if (motion == 0)
			defensiveMove();
		else 
			offensiveMove();		
	}
	
	public void defensiveMove(){
		
	}
	
	public void offensiveMove(){
		
	}
}


