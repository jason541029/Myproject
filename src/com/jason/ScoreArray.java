package com.jason;

public class ScoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int scores [][] = new int[5][3];
		scores[0][0] = 55;
		scores[0][1] = 63;
		scores[0][2] = 55;
		scores[1][0] = 69;
		scores[1][1] = 47;
		scores[1][2] = 55;
		scores[3][0] = 44;
		scores[3][1] = 55;
		scores[3][2] = 67;
		scores[4][0] = 22;
		scores[4][1] = 33;
		scores[4][2] = 95;
				
		for (int i=0; i<5;i++){
			System.out.print(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+ "\t");
			int average = (scores[i][0]+scores[i][1]+scores[i][2])/3;
	if (average<60){
		System.out.println(average+"*");
	}else{
		System.out.println(average);
	}
		}
	}

}
