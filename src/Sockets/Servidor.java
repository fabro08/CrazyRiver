package Sockets;

import java.net.*;
import java.io.*;

import javax.swing.JFrame;

import Interfaz.Game;

/**
 * 
 *
 * 
 * @author Jorge V
 */

public class Servidor {

	int puerto = 5009;

	ServerSocket Conexion;

	Socket CreaSocket;

	DataOutputStream salida;

	String MensajeCliente;

	int x =0;
		
	JFrame frame = new JFrame();
	// SERVIDOR
	Game game = new Game();
	

	public void initServer() {
		BufferedReader entrada;
		
		try {
			Conexion = new ServerSocket(puerto);
			CreaSocket = new Socket();

			System.out.println("Esperando conexion:");

			CreaSocket = Conexion.accept();

			// Inicia el socket, ahora esta esperando una conexión por parte del
			// cliente

			System.out.println("Un cliente se ha conectado.");

			// Canales de entrada y salida de datos

			while (true) {
				entrada = new BufferedReader(new InputStreamReader(
						CreaSocket.getInputStream()));

				salida = new DataOutputStream(CreaSocket.getOutputStream());

				// Recepcion de mensaje

				MensajeCliente = entrada.readLine();

				if (MensajeCliente.equals("dispara")) {
					
				} else {
					float f = Float.parseFloat(MensajeCliente);

					int pos = (int)Math.round(f);
				
					frame.add(game);
					frame.setSize(900,700);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					while (pos!=x){	
						x=pos;
					
						game.move(x);
						game.repaint();
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
						
					}

				}
					
					
				
			
			
		
			
		} catch (Exception e)

		{

			System.out.println("Se ha producido el siguiente error: "
					+ e.getMessage());

		}
		}


	public boolean Dispara() {
		
		System.out.println("disparando");
		return true;
	}
	
		
	

	public void setMover(int pos)  {
		
		
		
//		JFrame frame = new JFrame("CRAZY RIVER RIDE++");
//		Game game = new Game();
//		frame.add(game);
//		frame.setSize(900,700);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		while (true){	
//			x=pos;
//			game.move(x);
//			game.repaint(x);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			setMover(x);
//			
//		}
//		//System.out.println("maaa5");
		
		
	



	}

	
	

}