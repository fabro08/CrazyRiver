package Grafos;

import java.util.ArrayList;

public class CrearGrafos {
	
	//Objeto de tipo Entero llamado level
	private int level;
	//Objeto de tipo Grafo llamado grafo
	private Grafo grafo;
	
	private ArrayList<Arista> Aristas;
	private ArrayList<Nodo> Nodos;
	private int[][] Matriz;
	private CaminoCorto ruta;
	private ArrayList<Integer> rutaCorta;
	private ArrayList<Posiciones> recorrido= new ArrayList<Posiciones> ();
	private Posiciones aux;
	
	
	/**
	 * Clase CrearGrafo 
	 * Constructor de la clase
	 * @param levelN
	 */
	public CrearGrafos(int levelN){
		//Se le asigna a objeto level el valor de levelN
		this.level=levelN;
		//llamada al metodo crear
		crear(level);
	}
	
	/**
	 * Clase crear
	 * Clase de tipo void
	 * @param nodos (tipo  Entero)
	 */
	private void crear(int nodos){
		//verifica que el nivel sea 1
		if (nodos==1) {
			
			//Crea un grafo de 3 nodos
			grafo=new Grafo(3);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City1", 12, 505, false, false, false);
			grafo.insertarNodo("City2", 120, 615, false, false, false);
			grafo.insertarNodo("City3", 120, 505, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 65, 560, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(1, 2, 1, 120, 560, true);
			grafo.insertarArista(0, 2, 1, 65, 505, true);
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.calcularRuta(0);
			rutaCorta=ruta.getRuta();
			
			recorridos();
			
		}
		//verifica que el nivel sea 2
		else if (nodos==2) {
			
			//Crea un grafo de 5 nodos
			grafo=new Grafo(5);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City0", 12, 505, false, false, false);
			grafo.insertarNodo("City1", 120, 505, false, false, false);
			grafo.insertarNodo("City2", 120, 615, false, false, false);
			grafo.insertarNodo("City3", 12, 615, false, false, false);
			grafo.insertarNodo("City4", 65, 560, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 65, 505, false);
			grafo.insertarArista(1, 2, 1, 120, 560, false);
			grafo.insertarArista(2, 3, 1, 65, 615, false);
			grafo.insertarArista(3, 4, 30, 30, 590, true);	
			grafo.insertarArista(3, 0, 1, 12, 560, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 4, 30, 30, 535, true);
			grafo.insertarArista(1, 4, 90, 90, 535, true);
			grafo.insertarArista(2, 4, 90, 90, 590, true);
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.calcularRuta(0);
			rutaCorta=ruta.getRuta();
			
			recorridos();
		}
		//verifica que el nivel sea 3
		else if (nodos==3) {
			
			//Crea un grafo de 7 nodos
			grafo=new Grafo(7);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City0", 25, 495, false, false, false);
			grafo.insertarNodo("City1", 105, 495, false, false, false);
			grafo.insertarNodo("City2", 125, 560, false, false, false);
			grafo.insertarNodo("City3", 105, 625, false, false, false);
			grafo.insertarNodo("City4", 25, 625, false, false, false);
			grafo.insertarNodo("City5", 5, 560, false, false, false);
			grafo.insertarNodo("City6", 65, 560, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 65, 495, false);
			grafo.insertarArista(1, 2, 1, 115, 530, false);
			grafo.insertarArista(2, 3, 1, 115, 590, false);
			grafo.insertarArista(3, 4, 1, 65, 625, false);
			grafo.insertarArista(4, 5, 1, 15, 590, false);
			grafo.insertarArista(5, 6, 1, 35, 560, true);	
			grafo.insertarArista(5, 0, 1, 15, 530, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 6, 1, 45, 530, true);		
			grafo.insertarArista(1, 6, 1, 85, 530, true);		
			grafo.insertarArista(2, 6, 1, 95, 560, true);		
			grafo.insertarArista(3, 6, 1, 85, 590, true);		
			grafo.insertarArista(4, 6, 1, 45, 590, true);		
				
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.calcularRuta(0);
			rutaCorta=ruta.getRuta();
			
			recorridos();
		}
		//verifica que el nivel sea 4
		else if (nodos==4) {
			
			//Crea un grafo de 9 nodos
			grafo=new Grafo(9);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City0", 13,500, false, false, false);
			grafo.insertarNodo("City1", 63, 530, false, false, false);
			grafo.insertarNodo("City2", 115, 500, false, false, false);
			grafo.insertarNodo("City3", 130, 560, false, false, false);
			grafo.insertarNodo("City4", 115, 625, false, false, false);
			grafo.insertarNodo("City5", 63, 625, false, false, false);
			grafo.insertarNodo("City6", 13, 625, false, false, false);
			grafo.insertarNodo("City7", 0, 560, false, false, false);
			grafo.insertarNodo("City8", 60, 560, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 36, 500, false);
			grafo.insertarArista(1, 2, 1, 90, 500, false);
			grafo.insertarArista(2, 3, 1, 120, 530, false);
			grafo.insertarArista(3, 4, 1, 120, 590, false);
			grafo.insertarArista(4, 5, 1, 90, 625, false);
			grafo.insertarArista(5, 6, 1, 36, 625, false);
			grafo.insertarArista(6, 7, 1, 5, 590, false);
			grafo.insertarArista(7, 8, 1, 30, 560, true);
			grafo.insertarArista(7, 0, 1, 5, 530, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 8, 1, 35, 530, true);
			grafo.insertarArista(1, 8, 1, 63, 530, true);
			grafo.insertarArista(2, 8, 1, 93, 530, true);
			grafo.insertarArista(3, 8, 1, 100, 560, true);
			grafo.insertarArista(4, 8, 1, 93, 590, true);
			grafo.insertarArista(5, 8, 1, 63, 625, true);
			grafo.insertarArista(6, 8, 1, 35, 590, true);
			
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.calcularRuta(0);
			rutaCorta=ruta.getRuta();
			
			recorridos();
		}
		//verifica que el nivel sea 5
		else if (nodos==5) {
			
			//Crea un grafo de 11 nodos
			grafo=new Grafo(11);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City0", 0, 0, false, false, false);
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, false);
			grafo.insertarNodo("City4", 0, 0, false, false, false);
			grafo.insertarNodo("City5", 0, 0, false, false, false);
			grafo.insertarNodo("City6", 0, 0, false, false, false);
			grafo.insertarNodo("City7", 0, 0, false, false, false);
			grafo.insertarNodo("City8", 0, 0, false, false, false);
			grafo.insertarNodo("City9", 0, 0, false, false, false);
			grafo.insertarNodo("City10", 0, 0, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 0, 0, false);
			grafo.insertarArista(1, 2, 1, 0, 0, false);
			grafo.insertarArista(2, 3, 1, 0, 0, false);
			grafo.insertarArista(3, 4, 1, 0, 0, false);
			grafo.insertarArista(4, 5, 1, 0, 0, false);
			grafo.insertarArista(5, 6, 1, 0, 0, false);
			grafo.insertarArista(6, 7, 1, 0, 0, false);
			grafo.insertarArista(7, 8, 1, 0, 0, false);
			grafo.insertarArista(8, 9, 1, 0, 0, false);
			grafo.insertarArista(9, 0, 1, 0, 0, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 10, 1, 0, 0, true);
			grafo.insertarArista(1, 10, 1, 0, 0, true);
			grafo.insertarArista(2, 10, 1, 0, 0, true);
			grafo.insertarArista(3, 10, 1, 0, 0, true);
			grafo.insertarArista(4, 10, 1, 0, 0, true);
			grafo.insertarArista(5, 10, 1, 0, 0, true);
			grafo.insertarArista(6, 10, 1, 0, 0, true);
			grafo.insertarArista(7, 10, 1, 0, 0, true);
			grafo.insertarArista(8, 10, 1, 0, 0, true);
			grafo.insertarArista(9, 10, 1, 0, 0, true);
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.calcularRuta(0);
			rutaCorta=ruta.getRuta();
			
			recorridos();
			
		}//si no
		else {
			//Muestra mensaje Error
			System.out.println("Error");
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public ArrayList<Arista> getAristas() {
		return Aristas;
	}

	public void setAristas(ArrayList<Arista> aristas) {
		Aristas = aristas;
	}

	public ArrayList<Nodo> getNodos() {
		return Nodos;
	}

	public void setNodos(ArrayList<Nodo> nodos) {
		Nodos = nodos;
	}

	public int[][] getMatriz() {
		return Matriz;
	}

	public void setMatriz(int[][] matriz) {
		Matriz = matriz;
	}

	public CaminoCorto getRuta() {
		return ruta;
	}

	public void setRuta(CaminoCorto ruta) {
		this.ruta = ruta;
	}


	public ArrayList<Integer> getRutaCorta() {
		return rutaCorta;
	}

	public void setRutaCorta(ArrayList<Integer> rutaCorta) {
		this.rutaCorta = rutaCorta;
	}
	
	public void recorridos(){
		for (int i = 0; i < rutaCorta.size(); i++) {
			aux= new Posiciones(Nodos.get(i).ejeX,Nodos.get(i).ejeY);
			recorrido.add(aux);
			aux=new Posiciones(Aristas.get(i).ejeX, Aristas.get(i).ejeY);
			recorrido.add(aux);
		}
	}

	public ArrayList<Posiciones> getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(ArrayList<Posiciones> recorrido) {
		this.recorrido = recorrido;
	}

	public Posiciones getAux() {
		return aux;
	}

	public void setAux(Posiciones aux) {
		this.aux = aux;
	}
	
	

}
