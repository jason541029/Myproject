package com.jason;


public class Text {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++){
		for (int n = 2; n <= 5; n++){
			
				System.out.print(n + " x "+1 + " = "+(i*n)+"\t");
				if ((n*i) < 10){
					System.out.println();
				}
				
			}
	
				
				
		}
	}
}
