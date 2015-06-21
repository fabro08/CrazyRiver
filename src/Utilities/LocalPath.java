package Utilities;

import java.io.File;
import java.io.IOException;

public class LocalPath {
	String path;
	String root;
	File dir;
	
	
	public LocalPath(){
		dir=new File(".");
		try{
			root=dir.getCanonicalPath();
			path= dir.getCanonicalPath()+"/src/img/";
		}catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public String getPath(){
		return path;
		
	}
	public String getRoot(){
		return root;
	}

}
