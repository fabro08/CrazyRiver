package Utilities;

import java.util.ArrayList;
import Interfaz.Game;
import Objetos.BasicEnemyShip;
import Objetos.Boss;
import Objetos.FuelPackage;
import Objetos.KamikazeShip;
import Objetos.LifePackage;

public class Create extends Thread{
	int time = 0;
	Aleatorio rand;
	String object;
	Game game;
	public ArrayList<Boss> arrayBoss = new ArrayList<Boss>();
	public ArrayList<KamikazeShip> arrayKamikaze= new ArrayList<KamikazeShip>();
	public ArrayList<BasicEnemyShip> arrayBasic = new ArrayList<BasicEnemyShip>();
	public ArrayList<FuelPackage> arrayFuel = new ArrayList<FuelPackage>();
	public ArrayList<LifePackage> arrayLife = new ArrayList<LifePackage>();
	public Boss boss;
	public KamikazeShip kami;
	public BasicEnemyShip basic;
	public FuelPackage fuel;
	public LifePackage life;

	public Create(Game game, String object, int time){
		this.game = game;
		this.object = object;
		this.time = time;
	}
	public void run(){
		if (object == "Boss"){
			createBoos();
		} else if (object == "kami") {
			createKami();
		} else if (object == "basic") {
			createBoos();
		} else if (object == "fuel") {
			createFuel();
		} else if (object == "life") {
			createLife();
		}
	}
	public void createLife() {
	
	}
	public void createKami() {
		Aleatorio ale = new Aleatorio();
		while (true){
			try {
				Thread.sleep(1000*time);
				int x = ale.getNewRandon(200, 640);
				System.out.println(x);
				kami = new KamikazeShip(game, x);
				arrayKamikaze.add(kami);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	public void createBoos() {
		
	}
	public void createFuel() {	
	}
	
}