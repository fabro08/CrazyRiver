package Grafos;

import java.util.ArrayList;

public class Pila extends ArrayList {

	public Pila(){
		super();
	}
	
	public void agregarNodo(Nodo nodo){
		if(!this.contains(nodo)&&nodo.visitado!=true){
			add(nodo);
			mostrarContenido();
		}
	}
	public Nodo obtenerNodo(){
		Nodo auxiliar =null;
		if(!this.isEmpty()&&this!=null){
			auxiliar=(Nodo)this.get(this.size() -1);
			this.remove(this.size() -1);
		}
		return auxiliar;
	}
	
	public void mostrarContenido(){
		System.out.println("[");
		for(int i=0; i< this.size()-1;i++){
			System.out.print(((Nodo)this.get(i)).getDato());
		}
		System.out.println("]");
	}
}
