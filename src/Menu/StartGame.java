package Menu;

import Utilities.Hilos;

public class StartGame {
	private Hilos sonido;
	private Hilos local;
	private Hilos control;
	private int game=0;
	
	public StartGame(){
		sonido = new Hilos(1);
		local = new Hilos(2);
		control=new Hilos(3);
	}
	
	public void run(){
		if (game==1) {
			sonido.start();
			local.start();
		} else {
			sonido.start();
			control.start();
		}
	}

	public void setGame(int game) {
		this.game = game;
	}
	
}
