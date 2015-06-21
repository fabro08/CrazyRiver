package Grafos;

import java.util.ArrayList;
//Inicio de la clase Nodo
/**
 * Clase Nodo de un grafo
 * @author Steven, Fabricio, Arturo, Wilson
 * @category Estructura Distribuida
 * @version 1.0
 */
//Clase nodo de un grafo contiene los metodos objetos nesesarios para el manejo de la misma
public class Nodo {
	//Objeto de tipo Object llamado dato ( del nodo)
	public Object dato;
	//Objeto de tipo Double llamado ejeX (posicion en la pantalla)
	public int ejeX;
	//Objeto de tipo Double llamado ejeY (posicion en la pantalla)
	public int ejeY;
	//Objeto de tipo Boolean llamado domo (domo del nodo)
	public boolean domo;
	//Objeto de tipo Boolean llamado combustible (combustible del nodo)
	public boolean combustible;
	//Objeto de tipo Boolean llamado visitado (visita del nodo)
	public boolean visitado;
	//Objeto de tipo Boolean llamado nodoFinal (tipo de nodo)
	public boolean nodoFinal;
	
	/**
	 * Construstor de la clase
	 * Clase de tipo Nodo
	 * @param datoN (Tipo Object)
	 * @param ejeXN (Tipo Double)
	 * @param ejeYN (Tipo Double)
	 * @param domoN (Tipo Boolean)
	 * @param combustibleN (Tipo Boolean)
	 */
	public Nodo(Object datoN, int ejeXN,int ejeYN, boolean domoN ,boolean combustibleN, boolean nodoFinalN){
		//Se le asigna a objeto dato el valor de datoN(dato del nuevo nodo)
		this.dato=datoN;
		//Se le asigna a objeto ejeX el valor de ejeXN(posicion en la pantalla)
		this.ejeX=ejeXN;
		//Se le asigna a objeto ejeY el valor de ejeYN(posicion en la pantalla)
		this.ejeY=ejeYN;
		//Se le asigna a objeto domo el valor de domoN(posee domo)
		this.domo=domoN;
		//Se le asigna a objeto combustible el valor de combustibleN(posee combustible)
		this.combustible=combustibleN;
		//Se le asigna a objeto visitado el valor de visitadoN(visita)
		this.visitado=false;
		//Se le asigna a objeto nodoFinal el valor de nodoFinalN(tipo nodo)
		this.nodoFinal=nodoFinalN;
		
	}
	
	/**
	 * Clase getDato: Obtiene el valor del objeto dato del nodo
	 * Clase de tipo Object
	 * @return dato(tipo Object)
	 */
	public Object getDato() {
		//Devuelve el valor del objeto dato del nodo
		return this.dato;
	}
	
	/**
	 * Clase setDato: Asigna al objeto dato un nuevo valor
	 * Clase de tipo Void
	 * @param dato(tipo Object)
	 */
	public void setDato(Object dato) {
		//Asigna el nuevo valor al objeto dato
		this.dato = dato;
	}

	/**
	 * Clase getVisitado: Obtiene el valor del objeto visitado del nodo
	 * Clase de tipo Boolean
	 * @return visito(tipo Boolean)
	 */
	public Boolean getVisitado() {
		//Devuelve el valor del objeto visitado del nodo
		return this.visitado;
	}
	
	/**
	 * Clase setVisitado: Asigna al objeto visitado un nuevo valor
	 * Clase de tipo Void
	 * @param visitado(tipo Boolean)
	 */
	public void setVisitado(boolean visitado) {
		//Asigna el nuevo valor al objeto visitado
		this.visitado = visitado;
	}
	
	/**
	 * Clase getEjeX: Obtiene el valor del objeto ejeX del nodo
	 * Clase tipo Double
	 * @return ejeX(tipo Double)
	 */
	public int getEjeX() {
		//Devuelve el valor del objeto ejeX del nodo
		return ejeX;
	}
	
	/**
	 * Clase setEjeX: Asigna al objeto ejeX un nuevo valor
	 * Clase de tipo Void
	 * @param ejeX (tipo Double)
	 */
	public void setEjeX(int ejeX) {
		//Asigna el nuevo valor al objeto ejeX
		this.ejeX = ejeX;
	}
	
	/**
	 * Clase getEjeY: Obtiene el valor del objeto ejeY del nodo
	 * Clase tipo Double
	 * @return ejeY(tipo Double)
	 */
	public int getEjeY() {
		//Devuelve el valor del objeto ejeY del nodo
		return ejeY;
	}
	
	/**
	 * Clase setEjeY: Asigna al objeto ejeY un nuevo valor
	 * Clase de tipo Void
	 * @param ejeY (tipo Double)
	 */
	public void setEjeY(int ejeY) {
		//Asigna el nuevo valor al objeto ejeY
		this.ejeY = ejeY;
	}
	
	/**
	 * Clase getDomo: Obtiene el valor del objeto domo del nodo
	 * Clase de tipo Boolean
	 * @return domo (tipo Boolean)
	 */
	public boolean getDomo() {
		//Devuelve el valor del objeto domo del nodo
		return domo;
	}
	
	/**
	 * Clase setDomo: Asigna al objeto domo un nuevo valor
	 * Clase de tipo Void
	 * @param domo (tipo Boolean)
	 */
	public void setDomo(boolean domo) {
		//Asigna el nuevo valor al objeto domo
		this.domo = domo;
	}
	
	/**
	 * Clase getCombustible: Obtiene el valor del objeto combustible del nodo
	 * Clase de tipo Boolean
	 * @return combustible(tipo Boolean)
	 */
	public boolean getCombustible() {
		//Devuelve el valor del objeto combustible del nodo
		return combustible;
	}
	
	/**
	 * Clase setCombustible: Asigna al objeto combustible un nuevo valor
	 * Clase de tipo Void
	 * @param combustible(tipo Boolean)
	 */
	public void setCombustible(boolean combustible) {
		//Asigna el nuevo valor al objeto combustible
		this.combustible = combustible;
	}

	/**
	 * Clase getNodoFinal
	 * Clase de tipo Boolean
	 * @return nodoFinal(tipo Boolean)
	 */
	public boolean getNodoFinal() {
		//Devuelve el valor del objeto nodoFinal
		return nodoFinal;
	}

	/**
	 * Clase setNodoFinal
	 * Clase de tipo Void
	 * @param nodoFinal (tipo Boolean)
	 */
	public void setNodoFinal(boolean nodoFinal) {
		//Asigna el nuevo valor al objeto nodoFinal
		this.nodoFinal = nodoFinal;
	}
	
	
}
//Fin clase Nodo