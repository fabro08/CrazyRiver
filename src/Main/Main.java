package Main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Grafos.Grafo;
import Grafos.Nodo;
import Menu.Principal;
import Menu.Sonido;
import Menu.StartGame;
import Sockets.Servidor;

/**
 * Created by steven on 17/06/15.
 */
public class Main {
    public static void main(String[] args) {
    	//Servidor aServidor = new Servidor();
    	//aServidor.initServer(0); 
    	Principal menu =  new Principal();
    	//Sonido sonidito=new Sonido("sonidoFondo.wav",60);
    	File miDir = new File (".");
    	try{
    		System.out.println(miDir.getCanonicalPath());
    	}catch(IOException e) {
			e.printStackTrace();
    	}
    	
		/*System.out.println("Se crea el grafo\n");
		Grafo gri=new Grafo(3);

		System.out.println("Se insertan nodos en el grafo\n");
		gri.insertarNodo("City 1",20.6,30.7,true,true);
		gri.insertarNodo("City 2",30.5,67.8,false,true);
		gri.insertarNodo("City 3",50.9,70.8,false,false);

		System.out.println("Se imprime el grafo");
		gri.imprimirNodos();

		System.out.println(" ");

		System.out.println("Se insertan aristas mixtas en el grafo\n");
		gri.insertarArista(0, 1,2,30.7,50.6,false);
		gri.insertarArista(0, 2,4,12.7,6.9,true);
		gri.insertarArista(1, 2,5,78.8,50,true);
		
		System.out.println("Se imprime la matriz mixta del grafo");
		gri.imprimirMatrizAdyacencia();
		
		gri.imprimirAristas();
		
		
		Nodo[] lista=gri.getListaNodos();
		System.out.print(lista[1].getVisitado());*/
		
	

    }
}
