package Utilities;

import Interfaz.Game;


public class Clock extends Thread{
	public int time = 0;
	Thread hilo;
	Game game;
	String objeto;
	
	public Clock(Game game, String objeto, int time){
		this.objeto = objeto;
		this.game = game;
		this.time = time;
	}
	
	public void run(){
		if (objeto == "boss"){
			createBoss();
		}
		else if (objeto == "kami"){
			createKami();
		}
		else if (objeto == "puente"){
			createBridge();
		}
		else if (objeto == "basica"){
			createBasic();
		}
		else if (objeto == "life"){
			createLife();
		}
		else if (objeto == "fuel"){
			createFuel();
		}
		else if (objeto == "gas"){
			quitFuel();
		}
	}
	
	public void createBoss(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.setBoss(true);
		}
	}
	public void createKami(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.setEnemis(true);
		}
	}
	public void createBridge(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.setPuente(true);
		}
	}
	public void createBasic(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.NaBasic = true;
		}
	}
	public void createLife(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.setVida(true);
		}
	}
	public void createFuel(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.fuel = true;
		}
	}
	public void quitFuel(){
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.nave1.fuel = game.nave1.fuel - 2;
		}
		
	}
}