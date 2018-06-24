package com.java2.oo;

import java.util.ArrayList;

public class Bingo {
	public static void main(String[] args) {
		
	int[][]card = new int[5][5];
	ArrayList<Integer> play = new ArrayList<Integer>();
			boolean valid =  false;
	int tmp = 0;
	
	
	for(int row = 0; row<card.length; row++) {
		while(valid) {
			tmp = (int)(Math.random()*15)+1;//0-15亂數包刮15
			if(!play.contains(tmp)) {
				valid = true;
				play.add(tmp);
			}
		}
		card[row][0]= tmp;
        valid = false;
	}
	}
}