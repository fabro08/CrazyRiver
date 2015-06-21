package Utilities;

import java.util.Random;

public class Aleatorio {
	Random rando = new Random();
	int rand,result, begin, end;
	public Aleatorio(){
	}
	
	public int getNewRandon(int begin, int end){
		this.begin = begin;
		this.end = end;	
		rand = rando.nextInt(end);
		if (rand >=  begin & rand <= end){
			result = rand;
		}
		else {
			result = end-rand;
		}
		return result;
	}
	

}