package com.bird;

import java.awt.Graphics;
import java.awt.Image;

public class Stone {
	static Image ZhuZi = GameUtil.getImage("pic/ZhuZi.png");
	private int high=(int)(Math.random()*300);
	private int low=(int)(200+Math.random()*200)+high;
	private int move=780;
	int temp=move;
	public void move(Graphics g,Bird b){
		
		if(move>=355&&move<=450){
			b.setDie(high,low);
		}else{
			b.setDie(0,600);
		}
		g.drawImage(ZhuZi,move,-600+high,null);
		g.drawImage(ZhuZi,move,low,null);
		move=move-1;
	}
}
