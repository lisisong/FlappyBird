package com.bird;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	 boolean flag=true;
	public void launch(){
		setSize(800,600);
		setVisible(true);
		new PaintThread().start();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	Image dbBuffer;
	 public void update(Graphics g){      
		   dbBuffer = createImage(getWidth(),getHeight());
		   Graphics graImage = dbBuffer.getGraphics();
		   paint(graImage);
		   graImage.dispose();                    
		   g.drawImage(dbBuffer,0,0,null);
	 }  
	
	class PaintThread extends Thread{
		public void run(){
			while(flag){
				repaint();
				try{
					Thread.sleep(10);
				}
				catch(Exception e){
				
				}
			}
		}
	}
}
