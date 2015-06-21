package Menu;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Utilities.Fondos;

public class Principal implements ActionListener  {

	private JFrame ventana;
	private JButton btnStart ;
	private JButton btnExit;
	

	/**
	 * Create the application.
	 */
	public Principal() {
		super();
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
		
		
		JPanel panel = new Fondos("fon.jpg");
		panel.setBounds(0, 0, 898, 670);
		ventana.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnStart = new JButton("Start Game");
		btnStart.setFont(new Font("Dialog", Font.BOLD, 20));
		btnStart.setBounds(356, 396, 173, 47);
		btnStart.setBackground(new Color(135, 206, 250));
		btnStart.setForeground(new Color(255, 255, 240));
		btnStart.addActionListener(this);
		panel.add(btnStart);
		
		JLabel lblNewLabel = new JLabel("Crazy River Ride ++ es un juego de estrategia en el cual la nave tiene diferentes ");
		lblNewLabel.setBounds(23, 36, 632, 24);
		panel.add(lblNewLabel);
		
		JLabel lblTiposDeArmas = new JLabel("tipos de armas la cuales se encuentran durante el juego, debe destruir todo");
		lblTiposDeArmas.setBounds(23, 67, 632, 15);
		panel.add(lblTiposDeArmas);
		
		JLabel lblLoQueSe = new JLabel("lo que se encuentre a su paso, tambien encontrara paquetes de vida y combustible.");
		lblLoQueSe.setBounds(23, 94, 632, 15);
		panel.add(lblLoQueSe);
		
		btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(Principal.class.getResource("/img/salir.png")));
		btnExit.setBounds(810, 590, 50, 50);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		ventana.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnStart) {
			PlayesGame jugador=new PlayesGame();
			ventana.setVisible(false);
			
			
		}
		if (e.getSource()==btnExit) {
			System.exit(0);
			
			
		}
	}
}
