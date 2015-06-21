package Utilities;

import javax.swing.Icon;

import Grafos.CrearGrafos;
import Grafos.Grafo;
import Interfaz.Game;
import Objetos.IconPlayer;

public class Clock extends Thread {
	public int time = 0;
	Thread hilo;
	Game game;
	String objeto;
	int conta = 1;
	IconPlayer iconPlayer = new IconPlayer(game);
	int valorX = 500;
	int valorY = 500;
	int valorLevel = 1;

	public Clock(Game game, String objeto, int time) {
		this.objeto = objeto;
		this.game = game;
		this.time = time;
	}

	public void run() {

		if (objeto == "icono1") {
			createPosShip(1);
		}
		if (objeto == "icono2") {
			createPosShip(2);
		}
		if (objeto == "icono3") {
			createPosShip(3);
		}
		if (objeto == "icono4") {

			createPosShip(4);
		}

		if (objeto == "icono5") {
			createPosShip(5);
		}

		if (objeto == "level") {
			createLevel();
			System.out.println("aaaa");

		}
		if (objeto == "boss") {
			createBoss();
		} else if (objeto == "kami") {
			createKami();
		} else if (objeto == "puente") {
			createBridge();
		} else if (objeto == "basica") {
			createBasic();
		} else if (objeto == "life") {
			createLife();
		} else if (objeto == "fuel") {
			createFuel();
		} else if (objeto == "gas") {
			quitFuel();
		}
		else if (objeto == "muniPro"){
			muniPro();
		}

	}
	private void muniPro() {
		while (true){
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {e.printStackTrace();}
			game.setPaqBalas(true);
		}
	}

	public void createPosShip(int valor) {

		CrearGrafos grafos = new CrearGrafos(valor);

		for (int i = 0; i < grafos.getRecorrido().size() - 1; i++) {
			// while (true){
			try {
				Thread.sleep(1000 * time);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			game.setposIcon(grafos.getRecorrido().get(i).x, grafos
					.getRecorrido().get(i).y);
			System.out.println(valor);

			System.out.println(grafos.getRecorrido().get(i).x);
			System.out.println(grafos.getRecorrido().get(i).y);

			// System.out.println(grafos.getRecorrido().get(i).x);
			// System.out.println(grafos.getRecorrido().get(i).y);

			// System.out.println(valorX);
			// System.out.println(valorY);

		}

	}

	public void createBoss() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.setBoss(true);
		}
	}

	public void createLevel() {
		while (conta < 6) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.setValorBoss(conta);
			conta++;
		}

	}

	public void createKami() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.setEnemis(true);
		}
	}

	public void createBridge() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.setPuente(true);
		}
	}

	public void createBasic() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.NaBasic = true;
		}
	}

	public void createLife() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.setVida(true);
		}
	}

	public void createFuel() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.fuel = true;
		}
	}

	public void quitFuel() {
		while (true) {
			try {
				Thread.sleep(1000 * time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			game.nave1.fuel = game.nave1.fuel - 2;
		}

	}
}