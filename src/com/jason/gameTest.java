package com.jason;

import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		while(d !=0 ){
			System.out.print("Please enter a number 8,2,4,6分別為上下左右:");
		String dir = scanner.nextLine();

	d = Integer.parseInt(dir);
	
	

		
		
	switch(d){
case 2:
	System.out.println("向下");
	break;
	
case 8:
	System.out.println("向上");
	break;
case 4:
	System.out.println("向左");
	break;
case 6:
	System.out.println("向右");
	break;

case 0:
	System.out.println(" 結束 ");
	break;
}
}
}
	}