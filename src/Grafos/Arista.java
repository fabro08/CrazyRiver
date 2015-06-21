package Grafos;
/**
 * Clase Arista
 * @author Steven, Fabricio, Arturo, Wilson
 * @category Estructura Distribuida
 * @version 1.0
 */
//La clase Arista tiene todos objetos y metodos para crear una Arista 
public class Arista {
	//Objeto de tipo Entero llamado inicio (inicio de la Arista)
	public int inicio;
	//Objeto de tipo Entero llamado fin (fin de la Arista)
	public int fin;
	//Objeto de tipo Double llamado ejeX (posicion en la pantalla)
	public double ejeX;
	//Objeto de tipo Double llamado ejeY (posicion en la pantalla)
	public double ejeY;
	//Objeto de tipo Entero llamado peso (peso de la Arista)
	public int peso;
	//Objeto de tipo Boolean llamado dijirida (direccion de la Arista)
	public boolean dirijida;
	
	/**
	 * Construstor de la clase
	 * Clase de tipo Arista
	 * @param inicioN (Tipo Entero)
	 * @param finN (Tipo Entero)
	 * @param pesoN (Tipo Entero)
	 * @param ejeXN (Tipo Double)
	 * @param ejeYN (Tipo Double)
	 * @param dirijidaN (Tipo Boolean)
	 */
	public Arista(int inicioN, int finN, int pesoN, double ejeXN, double ejeYN, boolean dirijidaN){
		//Se le asigna a objeto inicio el valor de inicioN
		this.inicio=inicioN;
		//Se le asigna a objeto fin el valor de finN
		this.fin=finN;
		//Se le asigna a objeto peso el valor de pesoN
		this.peso=pesoN;
		//Se le asigna a objeto ejeX el valor de ejeXN
		this.ejeX=ejeXN;
		//Se le asigna a objeto ejeY el valor de ejeYN
		this.ejeY=ejeYN;
		//Se le asigna a objeto dirijida el valor de dirijidaN
		this.dirijida=dirijidaN;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getInicio() {
		return inicio;
	}
	
	/**
	 * 
	 * @param inicio
	 */
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	/**
	 * 
	 * @return
	 */
	public int getFin() {
		return fin;
	}

	/**
	 * 
	 * @param fin
	 */
	public void setFin(int fin) {
		this.fin = fin;
	}

	/**
	 * 
	 * @return
	 */
	public double getEjeX() {
		return ejeX;
	}

	/**
	 * 
	 * @param ejeX
	 */
	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	/**
	 * 
	 * @return
	 */
	public double getEjeY() {
		return ejeY;
	}

	/**
	 * 
	 * @param ejeY
	 */
	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}

	/**
	 * 
	 * @return
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isDirigida() {
		return dirijida;
	}

	/**
	 * 
	 * @param dirigida
	 */
	public void setDirigida(boolean dirigida) {
		this.dirijida = dirigida;
	}
	
}
