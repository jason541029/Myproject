package com.jason;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[] = {51 ,23 ,6 ,65 ,15};

int k ,tmp ,time;
k = n.length-1;

for(int i=0 ; i<=k-1 ; i++){
	if(n[i] > n[i+1]);
	{
		tmp=n[i]; n[i]=n[i+1]; n[i+1]=tmp;
		time = i;
		
	}

k =time;
		

}
for(int num : n)
	System.out.println(num+" ");
	}
}
