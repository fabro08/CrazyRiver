package Grafos;

import java.util.ArrayList;

/**
 * Clase Nodo de un grafo
 * @author Steven, Fabricio, Arturo, Wilson
 * @category Estructura Distribuida
 * @version 1.0
 */
//Clase nodo de un grafo contiene los metodos objetos nesesarios para el manejo de la misma
public class Nodo {
	
	public Object dato;
	public ArrayList<Nodo> vecinos;
	public Boolean visitado = false;
	
	/**
	 * Construstor de la clase
	 * @param datoN
	 */
	public Nodo(Object datoN){
		this.dato=datoN;
		vecinos=new ArrayList<Nodo>();
	}
	
	/**
	 * 
	 * @return
	 */
	public Object getDato() {
		return this.dato;
	}
	
	/**
	 * 
	 * @param dato
	 */
	public void setDato(Object dato) {
		this.dato = dato;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Nodo> getVecinos() {
		return this.vecinos;
	}
	
	/**
	 * 
	 * @param vecinos
	 */
	public void setVecinos(Nodo vecinosN) {
		this.vecinos.add(vecinosN);
	}
	
	/**
	 * 
	 * @return
	 */
	public Boolean getVisitado() {
		return this.visitado;
	}
	
	/**
	 * 
	 * @param visitado
	 */
	public void setVisitado(Boolean visitado) {
		this.visitado = visitado;
	}
	
	
}
