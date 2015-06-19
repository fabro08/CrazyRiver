package Interfaz;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Tablero extends JPanel implements Runnable{
    private Image background;
    private Image angrybird;
    private Image bart;
    private Thread hilo;
    private int x,y;
    private final int DELAY=5;
    private JButton boton;
    
    /*public void ventana(){
        setTitle("Crazy River Ride++");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,700);
        setLocationRelativeTo(null);
        setResizable(true);
    	
    	
    }*/
    
    public Tablero(){
    	
    	//boton.setText("Search");
		//boton.setBounds(200, 200, 200, 30);
		//boton.addActionListener((ActionListener) this);
        setBackground(Color.white);
        setDoubleBuffered(true);
 

        
        background = new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/background.jpg").getImage();
        angrybird = new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/angrybird.png").getImage();
        bart= new ImageIcon("/media/Respaldo/Java/CrazyRiver/src/img/images.jpg").getImage();
        //angrybird= new ImageIcon(getClass().getResource("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/angrybird.jpg"));
        //background = new ImageIcon(this.getClass().getResource("/home/wilson/CrazyRiverRide++/CrazyRiver/src/img/background.jpg")).getImage();
       
        x=0;
        y=0;
    }
    
    @Override
    public void addNotify(){
        super.addNotify();
        hilo = new Thread(this); 
        hilo.start();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(background, 0,0, null);
        g2.drawImage(angrybird,x,y, null);
        g2.drawImage(bart,x+500,y+200, null);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        //this.add(boton);
    }
    
    public void ciclo(){
        x += 1;
        if ( x > (950+1) ){
            x = 0;
        }
    }
    
    @Override
    public void run() {
        while(true){
           ciclo();
           repaint();
            try{
                Thread.sleep(DELAY);
            }catch(InterruptedException err){
                System.out.println(err);
            }
        }
    }
    
    
}


