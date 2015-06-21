package Utilities;

import Sockets.Servidor;

public class Hilos extends Thread  {
	private Sonido auiSonido;

	private Servidor servidor;
	
	private int tipo;

	public Hilos(int tipo) {
		super();
		this.tipo=tipo;
	}

	
	public void run() {
		
		if (tipo==1) {
			auiSonido=new Sonido();
			auiSonido.run("sonidoFondo.wav", 86);
		}
		else if (tipo==2) {
			servidor=new Servidor();
			servidor.initServer(0);

		}
		else {
			servidor=new Servidor();
			servidor.initServer(1);
		}
		
	}

}
