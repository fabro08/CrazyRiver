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
	int arma =1;
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
				game.move(0,2,false,0);
				game.repaint();
				try {
					Thread.sleep(15);
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
					
				 else if(MensajeCliente.equals("arma1")){
					 arma = 1;
				 }
				 else if(MensajeCliente.equals("arma2")){
					 arma = 2;
				 }
				 else if(MensajeCliente.equals("arma3")){
					 arma = 3;
				 }
				 else if(MensajeCliente.equals("arma4")){
					 arma = 4;
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
						
						game.move(x, 1,shoot,arma);
						game.repaint();
												try {
							Thread.sleep(15);
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