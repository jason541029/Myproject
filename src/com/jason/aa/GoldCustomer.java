package com.jason.aa;

public class GoldCustomer extends SilverCustomer {
	int returnmoney;
	public GoldCustomer (int amount){
		super(amount);
	}
	@Override
		public void print(){
			int total = (int)(amount*(1-discount));
			returnmoney = (int)(amount*(discount));
			System.out.println(amount+"\t"+total+"\t"+returnmoney);
		
	}

}
