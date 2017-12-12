package com.jason;

import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int pos = 0;
		int row = 3;
		int col = 5;
		int hp = 100;
		int d = 3;
		while(d !=0 ){
			System.out.print("Please enter a number 8,2,4,6分別為上下左右:");
		String dir = scanner.nextLine();

	d = Integer.parseInt(dir);

	switch(d){
	case 2:
	System.out.println("向下");
		if(pos/col < row-1){
		pos=pos+col;
		hp=hp-5;
		System.out.println("pos:"+pos);
		System.out.println("HP:"+hp);
		
		
	}else{
		hp=hp-30;
		System.out.println("HP:"+hp);
	}
	break;
	
	case 8:
		System.out.println("向上");
		if(pos/col>row+1){
			pos= pos-col;
		hp=hp-5;
		System.out.println("pos:"+pos);
		System.out.println("HP:"+hp);
		
	}else{
		hp=hp-30;
		System.out.println("HP:"+hp);
	}
	break;
	case 4:
	System.out.println("向左");
	if(pos % col != 0){
		pos=pos-1;
		hp=hp-5;
		System.out.println("pos:"+pos);
		System.out.println("HP:"+hp);
		
		
	}else{
		hp=hp-30;
		System.out.println("HP:"+hp);
	}
		break;
	case 6:
	System.out.println("向右");
	if(pos%col !=4){
		pos=pos+1;
		hp=hp-5;
		System.out.println("pos:"+pos);
			System.out.println("HP:"+hp);
		
	}else{
		hp=hp-30;
			System.out.println("HP:"+hp);
	}
		break;
	

case 0:
	System.out.println(" 結束 ");
	break;
	}
		}
	}
	}