package Grafos;

import java.util.ArrayList;

/**
 * 
 * @author steven
 *
 */
public class Grafo {
    private int nodosMaximos;
	public Nodo listaNodos[];
	public int matrizAdyacenciaDirijida[][];
	public int matrizAdyacenciaNoDirijida[][];
	public int cantidad;
	
	/**
	 * 
	 */
	public Grafo(int cantidadN){
        nodosMaximos=cantidadN;
		listaNodos= new Nodo[nodosMaximos];
		matrizAdyacenciaDirijida=new int[nodosMaximos][nodosMaximos];
        for (int i = 0; i < nodosMaximos; i++) {
            for (int j = 0; j <nodosMaximos; j++) {
                matrizAdyacenciaDirijida[i][j]=0;
            }
        }
        matrizAdyacenciaNoDirijida=new int[nodosMaximos][nodosMaximos];
        for (int i = 0; i < nodosMaximos; i++) {
            for (int j = 0; j <nodosMaximos; j++) {
                matrizAdyacenciaNoDirijida[i][j]=0;
            }
        }

	}
	
	public void insertarNodo(Object datoN){
        if (cantidad <= nodosMaximos) {
            listaNodos[cantidad++]= new Nodo(datoN);
        }
        else{
            System.out.println("Error: Grafo LLeno");
        }
	}

    public void insertarAristaDirijida(int inicio, int fin){
        if (inicio <= nodosMaximos && fin <= nodosMaximos) {
            matrizAdyacenciaDirijida[inicio][fin]=1;
        }
        else {
            System.out.println("Error: fuera del rango de la matriz ");
        }
    }
    
    public void insertarAristaNoDirijida(int inicio, int fin){
        if (inicio <= nodosMaximos && fin <= nodosMaximos) {
            matrizAdyacenciaNoDirijida[inicio][fin]=1;
            matrizAdyacenciaNoDirijida[fin][inicio]=1;
        }
        else {
            System.out.println("Error: fuera del rango de la matriz ");
        }
    }

    public void imprimirNodos(){
        for (int i = 0; i < listaNodos.length; i++) {
        	if(listaNodos[i]!=null){
        		System.out.println(listaNodos[i].getDato());
        	}
        }
    }
    
    public void imprimirMatrizAdyacenciaDirijida(){
        for (int i = 0; i < nodosMaximos; i++) {
            System.out.print("[");
            for (int j = 0; j <nodosMaximos ; j++) {
                System.out.print(" " + matrizAdyacenciaDirijida[i][j]);
            }
            System.out.print("]\n");
        }
    }
    
    public void imprimirMatrizAdyacenciaNoDirijida(){
        for (int i = 0; i < nodosMaximos; i++) {
            System.out.print("[");
            for (int j = 0; j <nodosMaximos ; j++) {
                System.out.print(" " + matrizAdyacenciaNoDirijida[i][j]);
            }
            System.out.print("]\n");
        }
    }
}
