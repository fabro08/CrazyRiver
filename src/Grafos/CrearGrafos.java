package Grafos;

public class CrearGrafos {
	
	//Objeto de tipo Entero llamado level
	private int level;
	//Objeto de tipo Grafo llamado grafo
	private Grafo grafo;
	
	private Arista[] Aristas;
	private Nodo[] Nodos;
	private int[][] Matriz;
	private CaminoCorto ruta;
	private double ejeX;
	private double ejeY;
	
	
	/**
	 * Clase CrearGrafo 
	 * Constructor de la clase
	 * @param levelN
	 */
	public CrearGrafos(int levelN,double ejeXN,double ejeYN){
		this.ejeX=ejeXN;
		this.ejeY=ejeYN;
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
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 0, 0, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 2, 1, 0, 0, true);
			grafo.insertarArista(1, 2, 1, 0, 0, true);
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.getRuta();
			
		}
		//verifica que el nivel sea 2
		else if (nodos==2) {
			
			//Crea un grafo de 5 nodos
			grafo=new Grafo(5);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, false);
			grafo.insertarNodo("City4", 0, 0, false, false, false);
			grafo.insertarNodo("City5", 0, 0, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 0, 0, false);
			grafo.insertarArista(1, 2, 1, 0, 0, false);
			grafo.insertarArista(2, 3, 1, 0, 0, false);
			grafo.insertarArista(3, 0, 1, 0, 0, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 4, 1, 0, 0, true);
			grafo.insertarArista(1, 4, 1, 0, 0, true);
			grafo.insertarArista(2, 4, 1, 0, 0, true);
			grafo.insertarArista(3, 4, 1, 0, 0, true);	
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.getRuta();
		}
		//verifica que el nivel sea 3
		else if (nodos==3) {
			
			//Crea un grafo de 7 nodos
			grafo=new Grafo(7);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, false);
			grafo.insertarNodo("City4", 0, 0, false, false, false);
			grafo.insertarNodo("City5", 0, 0, false, false, false);
			grafo.insertarNodo("City6", 0, 0, false, false, false);
			grafo.insertarNodo("City7", 0, 0, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 0, 0, false);
			grafo.insertarArista(1, 2, 1, 0, 0, false);
			grafo.insertarArista(2, 3, 1, 0, 0, false);
			grafo.insertarArista(3, 4, 1, 0, 0, false);
			grafo.insertarArista(4, 5, 1, 0, 0, false);
			grafo.insertarArista(5, 0, 1, 0, 0, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 6, 1, 0, 0, true);		
			grafo.insertarArista(1, 6, 1, 0, 0, true);		
			grafo.insertarArista(2, 6, 1, 0, 0, true);		
			grafo.insertarArista(3, 6, 1, 0, 0, true);		
			grafo.insertarArista(4, 6, 1, 0, 0, true);		
			grafo.insertarArista(5, 6, 1, 0, 0, true);		
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.getRuta();
		}
		//verifica que el nivel sea 4
		else if (nodos==4) {
			
			//Crea un grafo de 9 nodos
			grafo=new Grafo(9);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, false);
			grafo.insertarNodo("City4", 0, 0, false, false, false);
			grafo.insertarNodo("City5", 0, 0, false, false, false);
			grafo.insertarNodo("City6", 0, 0, false, false, false);
			grafo.insertarNodo("City7", 0, 0, false, false, false);
			grafo.insertarNodo("City8", 0, 0, false, false, false);
			grafo.insertarNodo("City9", 0, 0, false, false, true);
			
			//inserta aristas inicio,fin,posiciones, no dirijida
			grafo.insertarArista(0, 1, 1, 0, 0, false);
			grafo.insertarArista(1, 2, 1, 0, 0, false);
			grafo.insertarArista(2, 3, 1, 0, 0, false);
			grafo.insertarArista(3, 4, 1, 0, 0, false);
			grafo.insertarArista(4, 5, 1, 0, 0, false);
			grafo.insertarArista(5, 6, 1, 0, 0, false);
			grafo.insertarArista(6, 7, 1, 0, 0, false);
			grafo.insertarArista(7, 0, 1, 0, 0, false);
			
			//inserta aristas inicio,fin,posiciones, dirijida
			grafo.insertarArista(0, 8, 1, 0, 0, true);
			grafo.insertarArista(1, 8, 1, 0, 0, true);
			grafo.insertarArista(2, 8, 1, 0, 0, true);
			grafo.insertarArista(3, 8, 1, 0, 0, true);
			grafo.insertarArista(4, 8, 1, 0, 0, true);
			grafo.insertarArista(5, 8, 1, 0, 0, true);
			grafo.insertarArista(6, 8, 1, 0, 0, true);
			grafo.insertarArista(7, 8, 1, 0, 0, true);
			
			//Obtiene las aristas y las guarda
			Aristas=grafo.getListaAristas();
			
			//Obtiene los nodos y los guarda
			Nodos=grafo.getListaNodos();
			
			//Obtiene la matriz y la guarda
			Matriz=grafo.getMatrizAdyacencia();
			
			//Calcula la ruta
			ruta= new CaminoCorto(Matriz);
			ruta.getRuta();
		}
		//verifica que el nivel sea 5
		else if (nodos==5) {
			
			//Crea un grafo de 11 nodos
			grafo=new Grafo(11);
			
			//inserta nodos al grafo con un nombre, posiciones, domo,combustible,inicio/final
			grafo.insertarNodo("City1", 0, 0, false, false, false);
			grafo.insertarNodo("City2", 0, 0, false, false, false);
			grafo.insertarNodo("City3", 0, 0, false, false, false);
			grafo.insertarNodo("City4", 0, 0, false, false, false);
			grafo.insertarNodo("City5", 0, 0, false, false, false);
			grafo.insertarNodo("City6", 0, 0, false, false, false);
			grafo.insertarNodo("City7", 0, 0, false, false, false);
			grafo.insertarNodo("City8", 0, 0, false, false, false);
			grafo.insertarNodo("City9", 0, 0, false, false, false);
			grafo.insertarNodo("City10", 0, 0, false, false, false);
			grafo.insertarNodo("City11", 0, 0, false, false, true);
			
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
			ruta.getRuta();
			
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

	public Arista[] getAristas() {
		return Aristas;
	}

	public void setAristas(Arista[] aristas) {
		Aristas = aristas;
	}

	public Nodo[] getNodos() {
		return Nodos;
	}

	public void setNodos(Nodo[] nodos) {
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

	public double getEjeX() {
		return ejeX;
	}

	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	public double getEjeY() {
		return ejeY;
	}

	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}
	
	
	

}
