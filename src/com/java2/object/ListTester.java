package com.java2.object;
import java.util.List;
import java.util.ArrayList;
public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> cards = new ArrayList<>();
cards.add(12);
cards.add(5);
cards.add(3);
System.out.println("removing number:" +cards.remove(0));
System.out.println(cards.size());
System.out.println(cards.get(1));

	}

}
