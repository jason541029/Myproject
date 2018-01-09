package fina;

public class Ticket {
	String date;
	String time;
	String start;
	String off;
	int price;
	
	public Ticket (String date,String time,String  start,String off,int price ){
this.price = price;
this.date = date;
this.time = time;
this.start = start;
this.off = off;
}
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+off+"\t"+price);
	}
}
