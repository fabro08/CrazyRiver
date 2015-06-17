package Grafos;

import java.util.ArrayList;

public class Grafo {
	public ArrayList<Nodo> listaNodo;
	
	public Grafo(){
		listaNodo=new ArrayList<Nodo>();
	}
	
	public void adjuntarNodo(Nodo nodo){
		listaNodo.add(nodo);
	}
	
	public void crearEnlaces(Object nombreNodoPadre, Object nombreNodoHijo){
		Nodo padre = buscarNodo(nombreNodoPadre);
		Nodo hijo=buscarNodo(nombreNodoHijo);
		if (padre!= null&&hijo!=null){
			padre.setVecinos(hijo);
		}
	}
	
	public Nodo buscarNodo(Object nombreNodo){
		Nodo auxiliar = null;
		for(int i=0; i<listaNodo.size();i++){
			if(((String)nombreNodo).equalsIgnoreCase((String)listaNodo.get(i).getDato())){
				return listaNodo.get(i);
			}
		}
		return auxiliar;
	}
}
