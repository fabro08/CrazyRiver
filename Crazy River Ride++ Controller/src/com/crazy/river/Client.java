package com.crazy.river;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * Clase utilizada para crear el mando remoto en Android 
 * @author fabricio
 *
 */
public class Client extends Activity implements SensorEventListener,OnClickListener {
	float  x;
	Sensor gira;
	private Socket socket;
	PrintWriter out;
	PrintWriter out1;
	PrintWriter out2;
	int pos=0;
	int tmp=0;
	int bullet = 1;
	private static final int SERVERPORT = 5009;
	private static final String SERVER_IP = "192.168.100.14";

	@Override
	/**
	 * Al crear iniciar
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		/**
		 * Se inicia el hilo del cliente
		 */
		new Thread(new ClientThread()).start();
		/**
		 * Se establecen acciones
		 */
		View boton = findViewById(R.id.myButton);
		View cambia1 = findViewById(R.id.radio0);
		View cambia2 = findViewById(R.id.radio1);
		View cambia3 = findViewById(R.id.radio2);
		View cambia4 = findViewById(R.id.radio3);
		
		
		
		boton.setOnClickListener(this);
		cambia1.setOnClickListener(this);
		cambia2.setOnClickListener(this);
		cambia3.setOnClickListener(this);
		cambia4.setOnClickListener(this);
		
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

	
	}
	/**
	 * Para crear accion de menu
	 */
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	/**
	 * En caso de tener una accion con boton
	 */
	public void onClick(View view) {
		if (view.getId() == findViewById(R.id.myButton).getId()){ //Envia dispara y reproduce sonido
						try {
				MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido);
				mp.start();
				out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				out1.println("dispara");
				out1.flush();
		
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		
			
		}
		/**
		 * Para cambiar el tipo de armas 
		 */
		else if (view.getId() == findViewById(R.id.radio0).getId()){
			try {
				out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				out1.println("arma1");
				out1.flush();
		
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else if (view.getId() == findViewById(R.id.radio1).getId()){
			try {
				out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				out1.println("arma2");
				out1.flush();
		
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else if (view.getId() == findViewById(R.id.radio2).getId()){
			try {
				out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				out1.println("arma3");
				out1.flush();
		
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else if (view.getId() == findViewById(R.id.radio3).getId()){
			try {
				out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				out1.println("arma4");
				out1.flush();
		
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
 /**
  * Para crear el hilo
  * @author fabricio
  *
  */
	class ClientThread implements Runnable {

		
		private volatile boolean stopFlag = false;
		public void run() {

			try {
				InetAddress serverAddr = InetAddress.getByName(SERVER_IP);

				socket = new Socket(serverAddr, SERVERPORT);
				
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			while(!stopFlag){
                try {
              
                	 tmp = (int)Math.round(x);
            	if (pos == tmp){
            		
            	}
            	else{ 
            		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
                    out.println(pos);
                    out.flush();
                    pos = tmp;
                    Thread.sleep(1);
            		
            	}
           
                
                } catch(Exception e){
                	 	 e.printStackTrace();
                }
                

		}

	}
	}
    /**
     * Datos a tomar por el acelerometro
     */
	protected void onResume() {
		super.onResume();
		SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
		List<Sensor> sensors = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
		if (sensors.size() > 0) // dispositivo android tiene acelerometro
		{
			sm.registerListener(this, sensors.get(0),
					SensorManager.SENSOR_DELAY_GAME);
		}
	}

	protected void onPause() {
		SensorManager mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		mSensorManager.unregisterListener(this, gira);
		super.onPause();
	}

	protected void onStop() {
		SensorManager mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		mSensorManager.unregisterListener(this, gira);
		super.onStop();
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		//this.x = event.values[SensorManager.DATA_X];
		this.x = event.values[SensorManager.DATA_X];

	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}
}