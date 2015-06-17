package Objetos;

public class Bullets {
	public int Ypos;
	public int Xpos;
	public int type;
	
	
public Bullets(int y,int x,int tipo){
	this.Xpos=y;
	this.Ypos=x;
	this.type=tipo;
	
}
	
	public int getYpos() {
		return Ypos;
	}
	public void setYpos(int ypos) {
		Ypos = ypos;
	}
	public int getXpos() {
		return Xpos;
	}
	public void setXpos(int xpos) {
		Xpos = xpos;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
