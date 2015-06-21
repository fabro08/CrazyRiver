package Grafos;

import java.util.ArrayList;

public class CaminoCorto {
	private int[][] matrizAdyacencia;
	private ArrayList<Integer> ruta;
	
	public CaminoCorto(int[][] matriz){
		this.matrizAdyacencia=matriz;
		this.ruta=new ArrayList<Integer>();
	}
	
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

	public void imprimirRuta(){
		for (int i = 0; i < ruta.size(); i++) {
			System.out.println(ruta.get(i));
		}
	}

	public int[][] getMatrizAdyacencia() {
		return matrizAdyacencia;
	}

	public void setMatrizAdyacencia(int[][] matrizAdyacencia) {
		this.matrizAdyacencia = matrizAdyacencia;
	}

	public ArrayList<Integer> getRuta() {
		return ruta;
	}

	public void setRuta(ArrayList<Integer> ruta) {
		this.ruta = ruta;
	}
	

	

}
