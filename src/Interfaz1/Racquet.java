package Interfaz1;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
	int x = 0;
	int xa = 0;
	private Game2 game;
	private final int Y = 445;
	private final int WITH = 90;
	private final int HEIGHT = 20;

	public Racquet(Game2 game) {
		this.game= game;	
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x,Y ,WITH, HEIGHT);
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A||e.getKeyCode() == KeyEvent.VK_J)
			xa = -5;
		if (e.getKeyCode() == KeyEvent.VK_D||e.getKeyCode() == KeyEvent.VK_L)
			xa = 5;
	}public Rectangle getBounds() {
		return new Rectangle(x, Y, WITH, HEIGHT);
	}

	public int getTopY() {
		return Y - HEIGHT;
	}
}
