package Grafos;

import java.util.ArrayList;

public class Nodo {
	
	public Object dato;
	public ArrayList<Nodo> vecinos;
	public Boolean visitado = false;
	
	public Nodo(Object datoN){
		this.dato=datoN;
		vecinos=new ArrayList<Nodo>();
	}
}
