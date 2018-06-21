package com.jason;

import java.util.Scanner;

public class DateOfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 334;
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i<month.length;i++){
			if(n <= month[i]){
			System.out.println(i+1+"月"+n+"日");
			break;
		}else{
			n=n-month[i];
			}
		}
		}

	
}
