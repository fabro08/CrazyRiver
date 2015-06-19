package Sockets;

import java.net.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Cliente {
	Socket cliente;

	BufferedReader entrada,teclado;
	PrintStream salida;
	public void IniciarCliente(String texto, String ip, int dirpuerto){
		try{
			cliente = new Socket(ip,dirpuerto);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			
			
			salida = new PrintStream(cliente.getOutputStream());
			salida.println(texto);
			
			String msg = entrada.readLine();		
			System.out.println(msg);
			
			entrada.close();
			//teclado.close();
			salida.close();
			cliente.close();
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
}
	