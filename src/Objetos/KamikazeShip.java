package Objetos;

import javax.sound.midi.VoiceStatus;

public class KamikazeShip {
	public int life;
	public boolean alive;
	public int posX;
	public int posY;
	
	public KamikazeShip(){
		this.life = 2;
		this.alive = true;
		this.posX = 0;
		this.posY = 0;
	}
	
	public void removesLife(){
		kill();
		
	}

	public void kill(){
		life = 0;
		alive = false;	
	}
	
	public boolean itsAlive(){
		return alive;
	}
	
	public void move(){
		
	}
	/******
	 * Getters de la clase
	 ******/
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	/******
	 * Setters de la clase
	 * 
	 ******/
	public void setPosX(int posX) {
		this.posX = posX;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}
}
