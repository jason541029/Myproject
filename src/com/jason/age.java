package com.jason;


import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		System.out.println("請輸入一個數");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 12){
			System.out.println("小學?");
		}else{
			 if (age < 15){
				 System.out.println("中學?");
			 }else{
				   if (age < 18){
					   System.out.println("高中?");
				   }else{	
					   System.out.println(".....");
					   
					       
				   }
			 }
			
		}
	}
}
