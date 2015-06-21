package Utilities;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Time;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Objetos.PlayerShip;

public class Sonido {
	 LocalPath localPath= new LocalPath();
	
	public Sonido(){
		
	}
	public synchronized void run(String ruta,int tiempo){
		if (tiempo<=20) {
			try{
				URL url = Sonido.class.getResource(ruta);
				AudioClip clip = Applet.newAudioClip(url);
				clip.play();
				Thread.sleep(1000);
				clip.stop();
			}catch(Exception e){
				System.out.println("Error: "+e.getMessage());
			}
			
		} else {
			while(true){
				try{
					URL url = Sonido.class.getResource(ruta);
					AudioClip clip = Applet.newAudioClip(url);
					clip.play();
					Thread.sleep(1000*tiempo);
					clip.stop();
				}catch(Exception e){
					System.out.println("Error: "+e.getMessage());
				}
			}
		}
		
	}
	

}
