package Sockets;

import java.net.*;
import java.io.*;

import javax.swing.JFrame;

import org.omg.CORBA.PUBLIC_MEMBER;

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

	int x = 0;
	private boolean shoot=false;
	

	JFrame frame = new JFrame();
	// SERVIDOR
	Game game = new Game();

	public void initServer(int choose) {
		if (choose==0){

			
			frame.add(game);
			frame.setSize(900,700);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			while (true) {
				game.move(0,2,false);
				game.repaint();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else{
			
			
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
					 shoot = true;
				 }
					
			

				 else {
					float f = Float.parseFloat(MensajeCliente);

					int pos = (int) Math.round(f);

					frame.add(game);
					frame.setSize(900, 700);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					while (pos != x) {
						x = pos;

						game.move(x, 1,shoot);
						game.repaint();
												try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					

					}
					shoot=false;

				}

			}
			

		} catch (Exception e){

			System.out.println("Se ha producido el siguiente error: "+ e.getMessage());

		}
		
		

	}

}
}