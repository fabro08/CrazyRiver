package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Sockets.Servidor;

public class StartGame implements ActionListener{

	private JFrame ventana;
	private JButton btnPlayGame;
	private JButton btnExit;


	/**
	 * Create the application.
	 */
	public StartGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setBounds(0, 0, 900, 700);
		ventana.setTitle("Crazy River Ride ++");
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JPanel panel = new Fondos("puki.jpg");
		panel.setBounds(0, 0, 898, 670);
		ventana.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnPlayGame = new JButton("Play Game");
		btnPlayGame.setFont(new Font("Dialog", Font.BOLD, 30));
		btnPlayGame.setBounds(298, 318, 323, 64);
		btnPlayGame.addActionListener(this);
		panel.add(btnPlayGame);
		
		btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(StartGame.class.getResource("/Menu/salir.png")));
		btnExit.setBounds(810, 590, 50, 50);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		ventana.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnPlayGame) {
			Servidor  aServidor = new Servidor();
			aServidor.initServer();

			
		}
		if (e.getSource()==btnExit) {
			System.exit(0);
			
		}
		
	}
}
