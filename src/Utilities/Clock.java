package Utilities;


public class Clock extends Thread{
	public int time = 0;
	Thread hilo;
	int limit;
	
	public Clock(int limit){
		this.limit = limit;
	}
	
	public void run(){
		while (time < limit){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time++;
			System.out.println(time);
		}
		
	}
	
	public void resetTime(){
		this.time = 0;
	}
	

}
