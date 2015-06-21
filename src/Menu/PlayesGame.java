package Menu;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;


import Utilities.Fondos;
import Utilities.LocalPath;

public class PlayesGame implements ActionListener{
	private LocalPath local=new LocalPath();
	private StartGame iniStart=new StartGame();
	private JFrame ventana;
	private JButton btnSinglePlayer;
	private JButton btnMultiPlayer;
	private JButton btnExit;
	private JButton btnHelp;

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
		
		JPanel panel = new Fondos("fon.jpg");
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
		btnExit.setIcon(new ImageIcon(PlayesGame.class.getResource("/img/salir.png")));
		btnExit.setBounds(810, 590, 50, 50);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(790, 10, 100, 50);
		btnHelp.addActionListener(this);
		panel.add(btnHelp);
		
		ventana.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSinglePlayer) {
			ventana.setVisible(false);
			iniStart.setGame(1);
			iniStart.run();
			
		}
		else if (e.getSource()==btnMultiPlayer) {
			ventana.setVisible(false);
			iniStart.setGame(2);
			iniStart.run();
		}
		else if (e.getSource()==btnExit) {
			System.exit(0);
		}
		else if (e.getSource()==btnHelp) {
			File path = new File (local.getPath()+"html5up-directive/index.html");
			try {
				Desktop.getDesktop().open(path);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}

}
