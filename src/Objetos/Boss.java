package Objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import Utilities.Aleatorio;
import Utilities.LocalPath;

import javax.swing.ImageIcon;

import Interfaz.Game;
import Utilities.Aleatorio;

public class Boss {
	public Aleatorio Rvida = new Aleatorio();
	private LocalPath local = new LocalPath();
	public int life;
	public int motion; // defensivo = 0, ofensivo = 1
	public int X ,Y;
	private Game game;
	private Image BOSS= new ImageIcon(local.getPath()+"Boss.png").getImage();;
	private final int WITH = 70;
	private final int HEIGHT = 85;
	private final int DIAMETER = 100;
	int xa = 1;
	
	public Boss(Game game){
		this.game = game;
		this.X = 420;
		this.life = Rvida.getNewRandon(100, 150);
	}
	
	public void move() {
		if (X + xa < 200)
			xa = 1;
		if (X + xa > game.getWidth() - DIAMETER-260)
			xa = -1;
		if(collision()){
			game.setBoss(false);

		}
		X = X + xa;

	}
	
	private boolean collision() {
		return game.nave1.getBounds().intersects(getBounds());
	}	
	public Rectangle getBounds() {
		return new Rectangle(X, Y, WITH +100, HEIGHT+100);
	}
	
	public void paint(Graphics2D g) 
	{
		g.drawImage(BOSS, X, Y, WITH +100, HEIGHT+100, null);
	}
	
	public void setLife(int type){
		if (type==1){
			if(life>0){
				life = life - 10;
			}else{
				game.setBoss(false);
				
			}
		}else if (type ==2){
			if(life>0){
				life = life - 20;
			}else{
				game.setBoss(false);
				
			}
		}else if(life<0){
			game.setBoss(false);
		}
	
	
	}
	public int getBoslife(){
		return life;
	}
	public void setlife2(int vida){
		this.life=vida;
		
	}
	
	
	
	
	public void defensiveMove(){
		
	}
	
	public void offensiveMove(){
		
	}
}


