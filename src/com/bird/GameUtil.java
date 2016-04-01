package com.bird;

import java.awt.Image;

import java.io.IOException;

import javax.imageio.ImageIO;

public class GameUtil {

	public static Image getImage(String path){
		try{
			return ImageIO.read(MyFrame.class.getClassLoader().getResourceAsStream(path));
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	

}

/*public class GameUtil {
	private GameUtil(){}
	public static BufferedImage getImage(String str){
		File f=new File(str);
		BufferedImage bi=null;
		try{
			bi=ImageIO.read(f);
		}
		catch(Exception e){
			
		}
		return bi;
	}
	
}*/