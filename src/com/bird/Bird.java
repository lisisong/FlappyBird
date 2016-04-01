package com.bird;

import java.awt.Graphics;
import java.awt.Image;



public class Bird {
	static Image[] BAOZHA=new Image[16];
	private Map map=null;
	Bird(Map map){
		this.map=map;
	}
	
	static{
		for(int i=1;i<=16;i++){
			 BAOZHA[i-1]=GameUtil.getImage("baozha/e"+i+".gif");
		}
	}
	static Image GAMEOVER = GameUtil.getImage("pic/gameover.png");
	static Image BIRD = GameUtil.getImage("pic/bird.png");
	static Image SHIT = GameUtil.getImage("pic/shit.jpg");
	int x=400;
	int y=300;
	int dieHigh=0;
	int dieLow=800;
	long count=0;
	int count1=0;
	boolean flag=true;
	public void move(Graphics g){
		if(!(y>=dieHigh-15&&y<=dieLow-15)){
			flag=false;
			if(count1>=16){map.stop();
				g.drawImage(GAMEOVER, 200, 170, null);
				}else if(count1<=16){
				g.drawImage(BAOZHA[count1],400,y,null);
			}
			count1++;	
		}
		if(flag){
			g.drawImage(BIRD,400,y,null);
			if(count%3==0){
				y++;
			}
			count++;
		}
	}
	public void setMove(){
		y-=40;
	}
	public void setDie(int high,int low){
		dieHigh=high;
		dieLow=low;
	}
	
}
