package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;

public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VendingMachine vm = new VendingMachine();
FileReader fr;
try {
	fr = new FileReader("Vending.txt");
	BufferedReader in = new BufferedReader(fr);
	String line = in.readLine();
	String[] tokens = line.split(",")
}
	}

}
