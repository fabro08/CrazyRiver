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
	
	public Object dato;
	public Boolean visitado = false;
	
	/**
	 * Construstor de la clase
	 * Clase de tipo Nodo
	 * @param datoN (dato del nuevo nodo)
	 */
	public Nodo(Object datoN){
		//Se le asigna a objeto dato el valor de datoN(dato del nuevo nodo)
		this.dato=datoN;
	}
	
	/**
	 * Obtiene el valor del objeto dato del nodo
	 * Clase de tipo Object
	 * @return dato del nodo
	 */
	public Object getDato() {
		//Devuelve el valor del objeto dato del nodo
		return this.dato;
	}
	
	/**
	 * Asigna al objeto dato un nuevo valor
	 * Clase de tipo Void
	 * @param dato (nuevo valor del dato a asignar)
	 */
	public void setDato(Object dato) {
		//Asinga el nuevo valor al objeto dato
		this.dato = dato;
	}

	/**
	 * Obtiene el valor del objeto visitado del nodo
	 * Clase de tipo Boolean
	 * @return visita del nodo
	 */
	public Boolean getVisitado() {
		//Devuelve el valor del objeto visitado del nodo
		return this.visitado;
	}
	
	/**
	 * Asigna al objeto visitado un nuevo valor
	 * Clase de tipo Void
	 * @param visitado (nuevo valor de la visita)
	 */
	public void setVisitado(Boolean visitado) {
		//Asinga el nuevo valor al objeto visitado
		this.visitado = visitado;
	}
	
	
}
//Fin clase Nodo