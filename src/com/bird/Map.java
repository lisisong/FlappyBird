package com.bird;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Map extends MyFrame{
	static Image BACK = GameUtil.getImage("pic/back.jpg");
	private int size=10;
	private Bird b=new Bird(this);
	Stone[] s=new Stone[size];
	public void stop(){
		super.flag=false;
	}
	
	public void load(){
		this.addKeyListener(new Key());
		new NewStoneThread().start();
		
	}
	public void paintBack(Graphics g){
		g.drawImage(BACK, 0, 0,null);
	}
	public void paint(Graphics g){
		
		paintBack(g);
		for(int i=0;i<size;i++){
			
			if(s[i]!=null){	
				s[i].move(g,b);
				b.move(g);
			}
		}
	}
	class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			if(32==e.getKeyCode());{
				b.setMove();
			}
			
		}
	}
	class NewStoneThread extends Thread{
		public void run(){
			for(int i=0;i<size;i++){
				s[i]=new Stone();
				if(i==size-1){
					i=0;
				}
				try{
				Thread.sleep(5000);
				}
				catch(Exception e){
					
				}
			}
		}
	}
}
