package com.jason.oo;

public class Student {

	int english;
	int math;
	int chinese;
	String name;
	public Student(String nane, int english, int math, int chiness){
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chiness;
	}
	public Student(String n){
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