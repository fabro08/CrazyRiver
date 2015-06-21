package Utilities;

import java.util.ArrayList;

import Interfaz.Game;
import Objetos.KamikazeShip;

import java.util.Random;
import java.util.stream.IntStream;


public class Clock2 extends Thread{
	public int rand;
	Random rando = new Random();
	public int time = 0;
	Thread hilo;
	int limit;
	Game game;
	KamikazeShip kamiship;
	public ArrayList<KamikazeShip> Kami = new ArrayList<KamikazeShip>();
	private boolean Condition = false;
	
	public Clock2(Game game, int limit){
		this.game = game;
		this.limit = limit;
	}
	
	public void run(){
		while (true){
			try {
				Thread.sleep(1000*limit);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			kamiship = new KamikazeShip(game, random());
			Kami.add(kamiship);
			
	
		}
		
	}
	
	public void resetTime(){
		this.time = 0;
	}
	
	public boolean Condicion(){
		return Condition;
	}
	
	public int random(){
		rand = rando.nextInt(640);
		if (rand > 200 && rand < 640)
			return rand;
		else {
			random();
		return rand;
		}
		
	}
}
