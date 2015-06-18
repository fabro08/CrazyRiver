package Main;

import java.util.ArrayList;

import Grafos.Grafo;
import Menu.MenuPrincipal;

/**
 * Created by steven on 17/06/15.
 */
public class Main {
    public static void main(String[] args) {
    	
    	MenuPrincipal nemu = new MenuPrincipal();

		/*System.out.println("Se crea el grafo\n");
		Grafo gri=new Grafo(5);

		System.out.println("Se insertan nodos en el grafo\n");
		gri.insertarNodo("City 1");
		gri.insertarNodo("City 2");
		gri.insertarNodo("City 3");
		gri.insertarNodo("City 4");
		gri.insertarNodo("City 5");

		System.out.println("Se imprime el grafo");
		gri.imprimirNodos();

		System.out.println(" ");

		System.out.println("Se insertan aristas dirijidas en el grafo\n");
		gri.insertarAristaDirijida(0, 1);
		gri.insertarAristaDirijida(0, 4);
		gri.insertarAristaDirijida(1, 0);
		gri.insertarAristaDirijida(1, 2);
		gri.insertarAristaDirijida(1, 3);
		gri.insertarAristaDirijida(2, 4);
		gri.insertarAristaDirijida(3, 4);
		gri.insertarAristaDirijida(4, 1);

		System.out.println("Se imprime la matriz dirijida del grafo");
		gri.imprimirMatrizAdyacenciaDirijida();

		System.out.println(" ");

		System.out.println("Se insertan aristas no dirijidas en el grafo\n");
		gri.insertarAristaNoDirijida(0, 1);
		gri.insertarAristaNoDirijida(0, 4);
		gri.insertarAristaNoDirijida(1, 0);
		gri.insertarAristaNoDirijida(1, 2);
		gri.insertarAristaNoDirijida(1, 3);
		gri.insertarAristaNoDirijida(2, 4);
		gri.insertarAristaNoDirijida(3, 4);
		gri.insertarAristaNoDirijida(4, 1);

		System.out.println("Se imprime la matriz no dirijida del grafo");
		gri.imprimirMatrizAdyacenciaNoDirijida();*/

        /*ArrayList<Integer>[][] matrix = new ArrayList[2][2];
        matrix[0][0]=new ArrayList<Integer>();
        matrix[0][1]=new ArrayList<Integer>();
        matrix[1][0]=new ArrayList<Integer>();
        matrix[1][1]=new ArrayList<Integer>();
        matrix[0][0].add(1);
        matrix[0][0].add(2);
        matrix[0][0].add(3);
        matrix[0][1].add(4);
        matrix[0][1].add(5);
        matrix[0][1].add(6);
        matrix[1][0].add(7);
        matrix[1][0].add(8);
        matrix[1][0].add(9);
        matrix[1][1].add(10);
        matrix[1][1].add(11);
        matrix[1][1].add(12);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j <matrix.length ; j++) {
                System.out.print("[");
                if(matrix[i][j]!=null){
                    for (int k = 0; k <matrix[i][j].size(); k++) {
                        System.out.print(" " + matrix[i][j].get(k));
                    }
                    System.out.print("]");
                }
            }
            System.out.print("]\n");
        }
		for (int k = 0; k <matrix[0][0].size(); k++) {
     		System.out.print(" " + matrix[0][0].get(k));
     	}*/

    }
}
