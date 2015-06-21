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
	 * Clase getInicio
	 * Clase tipo Entero
	 * @return inicio(Entero)
	 */
	public int getInicio() {
		//Devuelve el valor del objeto inicio
		return inicio;
	}
	
	/**
	 *  Clase setInicio
	 *  Clase tipo Void
	 * @param inicio(Entero)
	 */
	public void setInicio(int inicio) {
		//Asigna un nuevo valor al objeto inicio
		this.inicio = inicio;
	}

	/**
	 * Clase getFin
	 * Clase tipo Entero
	 * @return fin (Entero)
	 */
	public int getFin() {
		//Devuelve el valor del objeto fin
		return fin;
	}

	/**
	 * Clase setFin
	 * Clase tipo Void
	 * @param fin (Entero)
	 */
	public void setFin(int fin) {
		//Asigna un nuevo valor al objeto fin
		this.fin = fin;
	}

	/**
	 * Clase getEjeX
	 * Clase tipo Double
	 * @return ejeX (Double)
	 */
	public double getEjeX() {
		//Devuelve el valor del objeto ejeX
		return ejeX;
	}

	/**
	 * Clase setEjeX
	 * Clase tipo Void
	 * @param ejeX (Double)
	 */
	public void setEjeX(double ejeX) {
		//Asigna un nuevo valor al objeto ejeX
		this.ejeX = ejeX;
	}

	/**
	 * Clase getEjeY
	 * Clase tipo Double
	 * @return ejeY (Double)
	 */
	public double getEjeY() {
		//Devuelve el valor del objeto ejeY
		return ejeY;
	}

	/**
	 * Clase setEjeY
	 * Clase tipo Void
	 * @param ejeY (Double)
	 */
	public void setEjeY(double ejeY) {
		//Asigna un nuevo valor al objeto ejeY
		this.ejeY = ejeY;
	}

	/**
	 * Clase getPeso
	 * Clase tipo Entero
	 * @return peso (Entero)
	 */
	public int getPeso() {
		//Devuelve el valor del objeto peso
		return peso;
	}

	/**
	 * Clase setPeso
	 * Clase tipo Void
	 * @param peso (Entero)
	 */
	public void setPeso(int peso) {
		//Asigna un nuevo valor al objeto peso
		this.peso = peso;
	}

	/**
	 * Clase getDirijida
	 * Clase tipo Boolean
	 * @return dirijida (Boolean)
	 */
	public boolean getDirigida() {
		//Devuelve el valor del objeto dirijida
		return dirijida;
	}

	/**
	 * Clase setDirijida
	 * Clase tipo Void
	 * @param dirijida (Boolean)
	 */
	public void setDirijida(boolean dirijida) {
		//Asigna un nuevo valor al objeto dirijida
		this.dirijida = dirijida;
	}
	
}
