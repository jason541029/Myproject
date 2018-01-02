package com.jason.oo;

public class Student {
 int english;
	
	protected int math;
	int chinese;
	String name;
	 static int pass = 60;
   public Student()	{
}

	public Student(String nane, int english, int math, int chiness, String name){
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chiness;
	}
	public Student(String n, String name){
		this.name = name;
	}
	public void print(){
		System.out.println(english+"\t"	
				+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	
	
	
	
	
	
}
}