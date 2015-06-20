package Grafos;

public class Arista {
	public int inicio;
	public int fin;
	public double ejeX;
	public double ejeY;
	public int peso;
	public boolean dirijida;
	
	public Arista(int inicioN, int finN, int pesoN, double ejeXN, double ejeYN, boolean dirijidaN){
		this.inicio=inicioN;
		this.fin=finN;
		this.peso=pesoN;
		this.ejeX=ejeXN;
		this.ejeY=ejeYN;
		this.dirijida=dirijidaN;
		
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public double getEjeX() {
		return ejeX;
	}

	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	public double getEjeY() {
		return ejeY;
	}

	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isDirigida() {
		return dirijida;
	}

	public void setDirigida(boolean dirigida) {
		this.dirijida = dirigida;
	}
	
}
