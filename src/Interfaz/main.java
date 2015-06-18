package Interfaz;

import javax.swing.JFrame;

import java.io.*;

import sun.audio.*;

 
public class main extends JFrame{
    public main(){
    	
    	/*throw Exception
    	{
    		String sonido = "/home/wilson/CrazyRiverRide++/CrazyRiver/src/GOT.wav";
    		ImputStream in = new FileInputStream(sonido);
    		AudioStream audio = new AudioStream(in);
    	}*/
        //TITULO....
        setTitle("Crazy River Ride++");
        //CERRAR AL CLICKEAR EN LA CRUZ
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //TAMAÑO DE VENTANA
        setSize(1200,700);
        //LOCACION DE LA VENTANA ( CENTRO )
        setLocationRelativeTo(null);
        //NO SE REDIMENSIONE LA VENTANA
        setResizable(true);
        
        //AGREGAMOS A LA VENTANA UN NUEVO OBJETO QUE ES UNA CLASE LLAMADA TABLERO
        //QUE HEREDA DE LA CLASE JPANEL DE SWING Y QUE ES DONDE SE DIBUJARA
        //NUESTRO JUEGO
        add(new Tablero());
        // add(new menu());
         
         
        //HACEMOS VISIBLE NUESTRA VENTANA
        setVisible(true);
    }
    
    //METODO PRINCIPAL - SERA BUSCADO AL EJECUTAR UN PROGRAMA EN JAVA
    public static void main(String args[]){
    	//new main();
    	menu1 pene =  new menu1();
    	pene.setVisible(true);
       
    }
}



