package Grafos;

import java.util.ArrayList;

public class CaminoCorto {
	ArrayList<Integer>[][] matrizFloyd;
	public CaminoCorto(){

	}

	public void iniciarMatrizFloyd(int tamano) {
		matrizFloyd = new ArrayList[tamano][tamano];
		for (int i = 0; i <matrizFloyd.length ; i++) {
			for (int j = 0; j <matrizFloyd.length ; j++) {
				matrizFloyd[i][j]=new ArrayList<Integer>();
			}
		}
	}

	public void floyd(int[][] matrizAdyacencia){

	}

}
