package Interfaz;

import Grafos.CrearGrafos;
import Objetos.*;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.ObjectInputStream.GetField;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Utilities.Aleatorio;
import Utilities.Clock;
import Utilities.Create;

public class Game extends JPanel {
	// private Image background= new
	// ImageIcon("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/background.jpg").getImage();;
	public Aleatorio random = new Aleatorio();
	public Backgraund campo = new Backgraund(this);
	public boolean bala = false;
	public PlayerShip nave1 = new PlayerShip(this);

	public KamikazeShip kamik = new KamikazeShip(this);
	public Bridge puente = new Bridge(this);
	public Boss jefe = new Boss(this);
	public BasicEnemyShip Nbasic = new BasicEnemyShip(this);
	public LifePackage vida = new LifePackage(this);
	public FuelPackage combustible = new FuelPackage(this);
	public ProBulletsPackage paqPro = new ProBulletsPackage(this);
	public Points puntos = new Points(this);
	public Clock tiempoJefe = new Clock(this, "boss", 60);
	public Clock tiempoKami = new Clock(this, "kami",random.getNewRandon(9, 13));
	public Clock tiempoSalud = new Clock(this, "life",15 );
	public Clock valorLevel = new Clock(this, "level", 65);
	public Clock icono1 = new Clock(this, "icono1", 2);
	public Clock icono2 = new Clock(this, "icono2", 2);
	public Clock icono3 = new Clock(this, "icono3", 5);
	public Clock icono4 = new Clock(this, "icono4", 4);
	public Clock icono5 = new Clock(this, "icono5", 4);
	public Clock tiempoMuni = new Clock(this, "muniPro", random.getNewRandon(25, 35));
	public Clock tiempoBenemy = new Clock(this, "basica", random.getNewRandon(10, 55));
	public Clock tiempogas = new Clock(this,"gas",random.getNewRandon(10, 35));
	public Clock tiempoPuente = new Clock(this,"puente",random.getNewRandon(40, 55));         
	public Map mapitaMap = new Map(this);
	public IconPlayer iconito = new IconPlayer(this);
	
	public int valor = 1;
	public int Xicon = 12;
	public int Yicon = 505;

	public boolean KamiEnemy = false;// Nave Kamikase
	public boolean NaBasic = false;// Nave Basica
	public boolean Puente = false;// Puente
	public boolean Boss = false;// Jefes
	public boolean Pvida = false;// paquete de vida
	public boolean fuel = false;// paquetes de combustibles
	public boolean ProPaq = false;// paquete de balas pro
	public boolean Puntos  = true;
	
	/***************
	 * Constructor
	 ***************/
	public Game() {
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				nave1.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				nave1.keyPressed(e);
			}
		});
		setFocusable(true);
		tiempoJefe.start();
		tiempoKami.start();
		tiempoSalud.start();
		tiempoMuni.start();
		valorLevel.start();
		tiempoBenemy.start();
		tiempogas.start();
		tiempoPuente.start();

		if (getValorBoss() == 1) {

			icono1.start();
		} else if (getValorBoss() == 2) {
			icono2.start();
		} else if (getValorBoss() == 3) {
			icono3.start();
		} else if (getValorBoss() == 4) {
			icono4.start();
		} else if (getValorBoss() == 5) {
			icono5.start();
		}
		// KamiArray.start();
	}

	/*
	 * Funcion madre encargada de llamar los movimientos de los objetos
	 */

	public void move(int x, int choose, boolean shoot, int arma) {

		int cont = 0;
		nave1.move(x, choose, shoot, arma);
		iconito.move(getPosIconX(), getPosIconY());

		if (Boss == false) {
			campo.move();

		}

		if (campo.getPosY() >= 0) {
			campo.setPosY(-900);
		}
		if (Boss == true) {
			jefe.move();

		}
		if (puente.getPosY() < 800 && Puente == true) {
			puente.move();
		}
		if (kamik.getPosY() < 800 && KamiEnemy == true) {
			kamik.move();
		}
		if (Nbasic.getPosY() < 800 && NaBasic == true) {
			Nbasic.move();
		}
		if (vida.getPosY() < 800 && Pvida == true) {
			vida.move();
		}
		if (combustible.getPosY() < 800 && fuel == true) {
			combustible.move();
		}
		if (paqPro.getPosY() < 800 && ProPaq == true) {
			paqPro.move();
		}

		while (cont < nave1.balas.size()) {
			if (cont < nave1.balas.size()) {
				nave1.balas.get(cont).move();
			} else {
				cont = 0;
			}
			cont++;
		}
		while (cont < nave1.pro.size()) {
			if (cont < nave1.pro.size()) {
				nave1.pro.get(cont).move();
			} else {
				cont = 0;
			}
			cont++;
		}

		while (cont < nave1.difusion.size()) {
			if (cont < nave1.difusion.size()) {
				nave1.difusion.get(cont).move();

			} else {
				cont = 0;
			}
			cont++;
		}
		while (cont < nave1.mayhem.size()) {
			if (cont < nave1.mayhem.size()) {
				nave1.mayhem.get(cont).move();

			} else {
				cont = 0;
			}
			cont++;
		}
	}

	/***********************
	 * Funcion de dibijar madre esta llama a la dibujar de cada objeto y lo pone
	 * en pantalla
	 **********************/

	@Override
	public void paint(Graphics g) {
		int cont = 0;
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		campo.paint(g2d);
		mapitaMap.paint(g2d);
		iconito.paint(g2d);
		g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("Verdana", Font.BOLD, 15));
		g2d.drawString(String.valueOf(nave1.getLife()), 60, 30);
		g2d.drawString(String.valueOf(nave1.getFuel()), 60, 60);
		g2d.drawString(String.valueOf(nave1.getProBullets()), 125, 90);
		g2d.drawString(String.valueOf(nave1.getDiffusionBullets()), 125, 120);
		g2d.drawString(String.valueOf(nave1.getMayhemBullets()), 125, 150);
		g2d.drawString(String.valueOf(getValorBoss()), 125, 180);
		g2d.drawString(String.valueOf(getValorBoss()), 125, 180);

		g2d.drawString("LIFE:", 10, 30);
		g2d.drawString("FUEL:", 10, 60);
		g2d.drawString("PROBULLETS:", 10, 90);
		g2d.drawString("DIFFUSION:", 10, 120);
		g2d.drawString("MAYHEM:", 10, 150);
		g2d.drawString("LEVEL:", 10, 180);

		nave1.paint(g2d);
		if (Boss == true) {
			jefe.paint(g2d);
		}
		if (Puente == true) {
			puente.paint(g2d);
		}
		if (KamiEnemy == true) {
			kamik.paint(g2d);
		}
		if (NaBasic == true) {
			Nbasic.paint(g2d);
		}
		if (Pvida == true) {
			vida.paint(g2d);
		}
		if (fuel == true) {
			combustible.paint(g2d);
		}
		if (ProPaq == true) {
			paqPro.paint(g2d);
		}

		while (cont < nave1.balas.size()) {
			if (cont < nave1.balas.size()) {
				nave1.balas.get(cont).paint(g2d);
			} else {

				cont = 0;
			}
			cont++;
		}
		while (cont < nave1.pro.size()) {
			if (cont < nave1.pro.size()) {
				nave1.pro.get(cont).paint(g2d);
			} else {
				cont = 0;
			}
			cont++;
		}
		while (cont < nave1.difusion.size()) {
			if (cont < nave1.difusion.size()) {
				nave1.difusion.get(cont).paint(g2d);
			} else {
				cont = 0;
			}
			cont++;
		}
		while (cont < nave1.mayhem.size()) {
			if (cont < nave1.mayhem.size()) {
				nave1.mayhem.get(cont).paint(g2d);
			} else {
				cont = 0;
			}
			cont++;

		}
	}

	public void gameOver() {
		nave1.kill();
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over",
				JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}

	public boolean getKamyEnemy() {
		return KamiEnemy;
	}

	public void setEnemis(boolean condicion) {
		this.KamiEnemy = condicion;
		kamik.setPosY(0);
	}

	public boolean getBridge() {
		return Puente;
	}

	public void setPuente(boolean condicion) {
		this.Puente = condicion;
	}

	public boolean getBoss() {
		return Boss;
	}

	public void setBoss(boolean condicion) {
		this.Boss = condicion;
	}

	/*
	 * Funciones del objeto paquete de vida
	 */

	public boolean getVida() {
		return Pvida;
	}

	public void setVida(boolean condicion) {
		this.Pvida = condicion;
	}

	/*
	 * Funciones del objeto paquete de Combustible
	 */

	public boolean getfuel() {
		return fuel;
	}

	public void setfuel(boolean condicion) {
		this.fuel = condicion;
	}

	/*
	 * Funciones del objeto paquete de balas pro
	 */

	public boolean getBalPro() {
		return Pvida;
	}

	public void setPaqBalas(boolean condicion) {
		this.ProPaq =condicion;
		this.paqPro.setPosY(-65);
	}

	public void setValorBoss(int valor) {
		this.valor = valor;

	}

	public int getValorBoss() {
		return valor;

	}

	public void setposIcon(int x, int y) {
		this.Xicon = x;
		this.Yicon = y;
	}

	public int getPosIconX() {
		return Xicon;

	}

	public int getPosIconY() {
		return Yicon;
	}

}