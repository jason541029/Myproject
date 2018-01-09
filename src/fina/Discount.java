package fina;

public class Discount extends Ticket {

	public Discount(String date, String time, String start, String off, int price) {
		super(date, time, start, off, price);
		super.price=(int)(price*( 2*0.85f));
	}
	
	

}
