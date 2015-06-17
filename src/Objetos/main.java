package Objetos;

import javax.swing.JFrame;

 
public class main extends JFrame{
    public main(){
        //TITULO
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
        //add(new Tablero());
        
        //HACEMOS VISIBLE NUESTRA VENTANA
        setVisible(true);
    }
    
    //METODO PRINCIPAL - SERA BUSCADO AL EJECUTAR UN PROGRAMA EN JAVA
    public static void main(String args[]){
        new main();
    }
}



