package Menu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sonido {
	
	public Sonido(String ruta,int tiempo){
		while(true){
			try{
				URL url = Sonido.class.getResource(ruta);
				AudioClip clip = Applet.newAudioClip(url);
				//AudioClip clip2 = Applet.newAudioClip(url);
				clip.play();
				Thread.sleep(tiempo*1000);
				//clip2.loop();
				//Thread.sleep(20000);
				//clip2.stop();

			}catch(Exception e){
				System.out.println("Error: "+e.getMessage());
			}
		}
	}
	

}
