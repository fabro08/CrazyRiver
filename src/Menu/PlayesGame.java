package Menu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PlayesGame implements ActionListener{

	private JFrame ventana;
	private JButton btnSinglePlayer;
	private JButton btnMultiPlayer;
	private JButton btnExit;


	/**
	 * Create the application.
	 */
	public PlayesGame() {
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
		
		JPanel panel = new Fondos("monedas.jpg");
		panel.setBounds(0, 0, 898, 670);
		ventana.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setFont(new Font("Dialog", Font.BOLD, 30));;
		btnSinglePlayer.setBounds(291, 252, 326, 52);
		btnSinglePlayer.addActionListener(this);
		panel.add(btnSinglePlayer);
		
		btnMultiPlayer = new JButton("Multiplayer");
		btnMultiPlayer.setFont(new Font("Dialog", Font.BOLD, 30));
		btnMultiPlayer.setBounds(291, 384, 326, 52);
		btnMultiPlayer.addActionListener(this);
		panel.add(btnMultiPlayer);
		
		btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(PlayesGame.class.getResource("/Menu/salir.png")));
		btnExit.setBounds(810, 590, 50, 50);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		ventana.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSinglePlayer) {
			StartGame stat=new StartGame();
			ventana.setVisible(false);
			
		}
		if (e.getSource()==btnMultiPlayer) {
			System.out.println("Multijugador");
			
		}
		if (e.getSource()==btnExit) {
			System.exit(0);
			
		}
		
	}

}
