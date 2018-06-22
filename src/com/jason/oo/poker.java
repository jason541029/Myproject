package com.jason.oo;

import java.util.Random;

public class poker {

	Random random = new Random();
	int[]cards = new int[52];
	String flowers = "SHDC";
			public poker() {
				for(int i =0;i<cards.length;i++) {
					cards[i] = i;
					System.out.println((i % 13) + 1 +""+(flowers.charAt((i/13))));
				}
		
	}

}
