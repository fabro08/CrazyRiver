package Utilities;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Utilities.LocalPath;

public class Fondos extends JPanel {
	

	public ImageIcon imagenFondo1;
	LocalPath local=new LocalPath();

	public Fondos(String ruta) {
		
		super();
		initialize();
		imagenFondo1= new ImageIcon(local.getPath()+ruta);
		setSize(imagenFondo1.getIconWidth(),imagenFondo1.getIconHeight());
	}
	
	protected void paintComponent (Graphics g){
		Dimension d= getSize();
		g.drawImage(imagenFondo1.getImage(), 0, 0, d.width, d.height,null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
	
	private void initialize(){
		this.setSize(2000,2000);
		this.setLayout(new GridBagLayout());
	}
	

}
