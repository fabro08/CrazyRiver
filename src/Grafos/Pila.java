package Grafos;

import java.util.ArrayList;

public class Pila extends ArrayList {

	public Pila(){
		super();
	}
	
	public void agregarNodo(Nodo nodo){
		if(!this.contains(nodo)&&nodo.visitado!=true){
			agregar(nodo);
			mostrarContenido();
		}
	}
	public void obtenerNodo(){

	}
}
