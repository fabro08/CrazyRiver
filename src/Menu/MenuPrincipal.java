package Menu;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MenuPrincipal extends JFrame implements ActionListener {
	
	public Image imagenFondo;
	public URL ruta;
	public JButton boton;
	public JButton boton3;
	
	
	
	public MenuPrincipal() {
		this.setBounds(0, 0, 800, 600);
		this.setTitle("Crazy River Ride ++");
		
		this.setLocationRelativeTo(null);
		
		ruta=this.getClass().getResource("/Menu/fondo.jpg");
		imagenFondo= new ImageIcon(ruta).getImage();
		
		boton=new JButton();
		boton.setText("Iniciar");
		boton.addActionListener(this);
		
		boton3=new JButton();
		boton3.setText("Fin");
		boton3.addActionListener(this);
		
		panel.add(boton);
		panel.add(boton3);
		
		Container contenedor= getContentPane();
		contenedor.add(panel);
		this.setVisible(true);
		
		
		
		
	}
	public JPanel panel=new JPanel(){
		public void paintComponent(Graphics g){
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);

		}
	};
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton) {
			System.out.println("Hola");
			
		}
		if (e.getSource()==boton3) {
			System.out.println("Chao");
			
		}
	}

}






