package com.jason;

public class BubleSort {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		int n[] = {51 ,23 ,6 ,65 ,15};
		
			for (int i=0; i<n.length-1;i++){
				for (int j=i+1;j<n.length; j++){
					System.out.println(i+","+j);
					if (n[i]>n[j]){
						int tmp = n[i];
						n[i] = n[j];
							n[j] = tmp;
						}
					}
		
			}
			for(int num : n)
				System.out.println(num+" ");
				}
			}
