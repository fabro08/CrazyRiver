package Grafos;

import java.util.ArrayList;


public class Grafo {
	private final int NODOSMAXIMOS=20;
	public Nodo listaNodos[];
	public int matrizAdyacencia[][];
	public int cantidad;
	
	public Grafo(){
		listaNodos= new nodo[NODOSMAXIMOS];
		matrizAdyacencia=new int[NODOSMAXIMOS][NODOSMAXIMOS];
        cantidad=0;
        for (int i = 0; i < NODOSMAXIMOS; i++) {
            for (int j = 0; j <NODOSMAXIMOS ; j++) {
                matrizAdyacencia[i][j]=0;
            }
        }

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
