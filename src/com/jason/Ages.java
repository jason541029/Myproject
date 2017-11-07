package com.jason;

import java.util.Scanner;

public class Ages {
	public static void main(String[] args) {
		System.out.println("請問誰年齡最大");
		System.out.println("(1)周杰倫");
		System.out.println("(2)華晨宇");
		System.out.println("(3)梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		
		if (age == 3){
			
				 System.out.println("currect");
			 }else{
					   System.out.println("mistake");

		 
	}
}

	
}