package com.jason;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		System.out.println("請輸入一個數");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for ( n=1;n>0;n++){
			System.out.println("*");
			break;
			
		}
	}
}
