package Grafos;

import java.util.ArrayList;

/**
 * Clase Camino Corto
 * @author Steven, Fabricio, Arturo, Wilson
 * @category Estructura Distribuida
 * @version 1.0
 */
//La clase CaminoCorto tiene todos objetos y metodos para crear una ruta(camino mas corto recorriendo todo el grafo)
public class CaminoCorto {
	//Objeto de tipo Entero llamado matrizAdyacencia
	private int[][] matrizAdyacencia;
	//Objeto de tipo ArrayList llamado ruta
	private ArrayList<Integer> ruta;
	
	/**
	 * Construstor de la clase
	 * Clase de tipo CaminoCorto
	 * @param matriz (Entero)
	 */
	public CaminoCorto(int[][] matriz){
		//Se le asigna a objeto matrizAdyacencia el valor de matriz
		this.matrizAdyacencia=matriz; 
		//Se le asigna a objeto ruta 
		this.ruta=new ArrayList<Integer>();
	}
	
	/**
	 * 
	 * @param inicio
	 */
	public void calcularRuta(int inicio) {
		ruta.clear();
		if (inicio==0) {
			ruta.add(inicio);
			calcularRutaDespues(inicio);
			ruta.add(matrizAdyacencia.length-1);
		} else {
			//calcularRutaAntes(inicio);
			ruta.add(inicio);
			calcularRutaDespues(inicio);
			ruta.add(0);
			calcularRutaAntes(inicio);
			ruta.add(matrizAdyacencia.length-1);
		}
	}
	
	/**
	 * 
	 * @param inicio
	 */
	private void calcularRutaDespues(int inicio) {
		for (int i = inicio; i <matrizAdyacencia.length-2;) {
			for (int j = inicio; j <matrizAdyacencia.length-1 ;j++) {
				if (matrizAdyacencia[i][j]==1) {
					ruta.add(j);
					i=j;
				} 
			}
		}
	}
	
	/**
	 * 
	 * @param inicio
	 */
	public void calcularRutaAntes(int inicio) {
		for (int i = 0; i <inicio-1;) {
			for (int j = 0; j <inicio ;j++) {
				if (matrizAdyacencia[i][j]==1) {
					ruta.add(j);
					i=j;
				} 
			}
		}
	}
	
	/**
	 * 
	 */
	public void imprimirRuta(){
		for (int i = 0; i < ruta.size(); i++) {
			System.out.println(ruta.get(i));
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int[][] getMatrizAdyacencia() {
		return matrizAdyacencia;
	}
	
	/**
	 * 
	 * @param matrizAdyacencia
	 */
	public void setMatrizAdyacencia(int[][] matrizAdyacencia) {
		this.matrizAdyacencia = matrizAdyacencia;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Integer> getRuta() {
		return ruta;
	}
	
	/**
	 * 
	 * @param ruta
	 */
	public void setRuta(ArrayList<Integer> ruta) {
		this.ruta = ruta;
	}
	

	

}
