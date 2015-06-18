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
	 private Image background= new ImageIcon("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/background.jpg").getImage();;
	 public boolean bala= false;
	 
	 PlayerShip nave1 = new PlayerShip(this);
	 BasicBullets basica = new BasicBullets(this);

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
	
	private void move() {
		nave1.move();
		//basica.move();
		 	//nave1.shoot(1);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		//g2d.drawImage(background, 0,0, null);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		nave1.paint(g2d);
		if(bala){
		basica.paint(g2d);
		}
	}
	
	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("CRAZY RIVER RIDE++");
		Game game = new Game();
		
		frame.add(game);
		frame.setSize(900,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}