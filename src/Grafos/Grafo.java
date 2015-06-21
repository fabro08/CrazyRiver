package Grafos;

import java.util.ArrayList;

//Inicia la Clase Grafo
/**
 * Clase Grafo
 * @author Steven, Fabricio, Arturo, Wilson
 * @category Estructura Distribuida
 * @version 1.0
 */
//La clase Grafo tiene todos objetos y metodos para crear un grafo 
public class Grafo {
	//Objeto de tipo Entero llamado nodosMaximos
    private int nodosMaximos;
    //Objeto de tipo Nodo llamado ListaNodos(Arreglo de nodos: contiene los nodos del grafo)
	public ArrayList<Nodo> listaNodos;
	//Objeto de tipo Entero llamado matrizAdyacenciaDirijida(Arreglo de tipo matriz de aristas: matriz de adyacencia)
	public int matrizAdyacencia[][];
	//Objeto de tipo Entero llamado cantidadNodos(contiene la cantidad de nodos del grafo)
	public int cantidadNodos;
	//Objeto de tipo Entero llamado cantidadAristas(contiene la cantidad de Aristas del grafo)
	public int cantidadAristas;
	//Objeto de tipo Arista llamado ListaAristas(Arreglo de Aristas: contiene las Aristas del grafo)
	public ArrayList<Arista> listaAristas;
	
	private Nodo auxNodo;
	private Arista auxArista;
	
	/**
	 * Clase Grafo(constructor de la clase)
     * Clase de tipo Grafo
	 * @param cantidadN (tipo Entero)
	 */
	public Grafo(int cantidadN){
        //Se le asigna a objeto nodosMaximos el valor de datoN(dato del nuevo nodo)
        nodosMaximos=cantidadN;
        //Asigna el tamaño del arreglo de los grafos(nodos)
		listaNodos= new ArrayList<Nodo>();
		//Asigna el tamaño del arreglo de los grafos(aristas)
		listaAristas=new ArrayList<Arista>();
        //crea la matriz Dirijida y le da un tamaño
		matrizAdyacencia=new int[nodosMaximos][nodosMaximos];
        //Recorre las filas
        for (int i = 0; i < nodosMaximos; i++) {
            //Recorre las columnas
            for (int j = 0; j <nodosMaximos; j++) {
                //asigna el valor de 0 en cada matriz
                matrizAdyacencia[i][j]=0;
            }
        }
	}
	
	/**
	 * Clase insertarNodo(inserta un nodo en el grafo)
     * Clase de tipo void
	 * @param datoN (tipo Object)
	 * @param ejeX (tipo Double)
	 * @param ejeY (tipo Double)
	 * @param domo (tipo Boolean)
	 * @param combustible (tipo Boolean)
	 */
	public void insertarNodo(Object datoN,int ejeX,int ejeY,boolean domo, boolean combustible,boolean nodoFinal){
        //verifica que el grafo no este lleno
        if (cantidadNodos <= nodosMaximos) {
            //Agrega el nodo al grafo
            auxNodo= new Nodo(datoN,ejeX,ejeY,domo,combustible,nodoFinal);
            listaNodos.add(auxNodo);
            cantidadNodos++;
        }
        // si esta lleno
        else{
            //muestra mensaje de error
            System.out.println("Error: Grafo LLeno");
        }
	}
    
	/**
	 * Clase insertarArisra(inserta una Arista en el grafo)
     * Clase de tipo void
	 * @param inicio (tipo Entero)
	 * @param fin (tipo Entero)
	 * @param peso (tipo Entero)
	 * @param ejeX (tipo Double)
	 * @param ejeY (tipo Double)
	 * @param dirijida (tipo Boolean)
	 */
    public void insertarArista(int inicio, int fin,int peso,int ejeX, int ejeY, boolean dirijida){
    	//Verifica que la arista exista y que sea no dirigida
        if (inicio <= nodosMaximos && fin <= nodosMaximos && dirijida==false) {
            //Agrega la arista al grafo
        	auxArista=new Arista(inicio,fin,peso,ejeX,ejeY,dirijida);
        	listaAristas.add(auxArista);
            matrizAdyacencia[inicio][fin]=1;
            matrizAdyacencia[fin][inicio]=1;
        } 
        //Verifica que la arista exista y que sea dirigida
        else if(inicio <= nodosMaximos && fin <= nodosMaximos && dirijida==true) {
        	//Agrega la arista al grafo
        	auxArista=new Arista(inicio,fin,peso,ejeX,ejeY,dirijida);
        	listaAristas.add(auxArista);
            matrizAdyacencia[inicio][fin]=1;
        }
        //si no existe
        else {
            // muestra mensaje error 
            System.out.println("Error: fuera del rango de la matriz ");
        }
    }
    
    /**
     * Clase imprimirNodos
     * Clase de tipo void
     */
    public void imprimirNodos(){
        //Recorre los nodos del grafo
        for (int i = 0; i < listaNodos.size(); i++) {
        	if(listaNodos.get(i)!=null){
                //imprime los nodos
        		System.out.println(listaNodos.get(i).getDato());
        	}
        }
    }
    
    /**
     * Clase imprimirAristas
     * Clase de tipo void
     */
    public void imprimirAristas(){
        //Recorre las Aristas del grafo
        for (int i = 0; i < listaAristas.size(); i++) {
        	if(listaAristas.get(i)!=null){
                //imprime las Aristas
        		System.out.println("("+listaAristas.get(i).getInicio()+" , "+listaAristas.get(i).getFin()+")");
        	}
        }
    }
    
    /**
     * Clase imprimir matriz adyacencia dirijida
     * Clase de tipo void
     */
    public void imprimirMatrizAdyacencia(){
        //Recorre la matriz
        for (int i = 0; i < nodosMaximos; i++) {
            System.out.print("[");
            for (int j = 0; j <nodosMaximos ; j++) {
                //imprime la matriz
                System.out.print(" " + matrizAdyacencia[i][j]);
            }
            System.out.print("]\n");
        }
    }
    
    /**
     * Clase getNodosMaximos: Obtiene el valor del objeto nodosMaximos
     * Clase de tipo Entero
     * @return nodosMaximos(tipo Entero)
     */
    public int getNodosMaximos() {
    	//Devuelve el valor del objeto nodosMaximos
		return nodosMaximos;
	}

    /**
     * Clase getListaNodos: Obtiene el valor del objeto listaNodos
     * Clase de tipo Nodo
     * @return listaNodos (tipo Nodo)
     */
	public ArrayList<Nodo> getListaNodos() {
		//Devuelve el valor del objeto listaNodos
		return listaNodos;
	}

	/**
	 * Clase getMatrizAdyacencia: Obtiene el valor del objeto matrizAdyacencia
     * Clase de tipo Entero
	 * @return matrizAdyacencia (tipo Entero)
	 */
	public int[][] getMatrizAdyacencia() {
		//Devuelve el valor del objeto matrizAdyacencia
		return matrizAdyacencia;
	}

	/**
	 * Clase getCantidadNodos: Obtiene el valor del objeto cantidadNodos
     * Clase de tipo Entero
	 * @return cantidadNodos (tipo Entero)
	 */
	public int getCantidadNodos() {
		//Devuelve el valor del objeto cantidadNodos
		return cantidadNodos;
	}

	/**
	 * Clase getCantidadAristas: Obtiene el valor del objeto cantidadAristas
     * Clase de tipo Entero
	 * @return cantidadAristas (tipo Entero)
	 */
	public int getCantidadAristas() {
		//Devuelve el valor del objeto cantidadAristas
		return cantidadAristas;
	}

	/**
	 * Clase getListaAristas: Obtiene el valor del objeto listaAristas
     * Clase de tipo Arista
	 * @return listaAristas (tipo Arista)
	 */
	public ArrayList<Arista> getListaAristas() {
		//Devuelve el valor del objeto listaAristas
		return listaAristas;
	}
}
//Fin clase Grafo