package Interfaz;
import Objetos.*;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Game extends JPanel {
	
	 private Image background= new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/background.jpg").getImage();;
	 public boolean bala= false;
	 public PlayerShip nave1 = new PlayerShip(this);
     public KamikazeShip kamik = new KamikazeShip(this);
     public Bridge puente =  new Bridge(this);
     
     public boolean KamiEnemy= true;// Variable que va a adecir si se activa un enemigo
     public boolean Puente= false;
     

	 

 /** 
 * Constructor
 * */
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
	}
	
	public void move(int x, int choose, boolean shoot) {
		int cont=0;
		nave1.move(x,choose,shoot);
		
		if(puente.getPosY()<800&& Puente==true){
			puente.move();
		}
		if(kamik.getPosY()<800 && KamiEnemy==true){
			kamik.move();
		}
		while(cont < nave1.balas.size()){
			if (cont < nave1.balas.size()){
				nave1.balas.get(cont).move();
			} else {
				cont = 0;
			}
			cont++;
		}
	}

	@Override
	public void paint(Graphics g) {
		int cont = 0;
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, 0,0, null);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawString("LIFE", 10, 30);
		g2d.drawString("FUEL", 10, 60);
		g2d.drawString(String.valueOf(nave1.getLife()), 50, 30);
		g2d.drawString(String.valueOf(nave1.getFuel()), 50, 60);
		nave1.paint(g2d);
		if (Puente==true){
			puente.paint(g2d);
		}
		if(KamiEnemy==true){
			kamik.paint(g2d);
		}
		while(cont < nave1.balas.size()){
			if (cont < nave1.balas.size()){
				nave1.balas.get(cont).paint(g2d);
			} else {
				cont = 0;
			}
			cont++;
		}
	}
	
	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	
	public boolean getKamyEnemy(){
		return KamiEnemy;	
	}
	public void setEnemis(boolean condicion){
		this.KamiEnemy=condicion;
	}
	public boolean getBridge(){
		return Puente;
	}
	
	public void setPuente(boolean condicion){
		this.Puente=condicion;
	}
	


}