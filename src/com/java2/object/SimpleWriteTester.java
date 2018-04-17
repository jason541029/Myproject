package com.java2.object;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class SimpleWriteTester {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream("data.txt");
		out.println("Jason");
		out.flush();
		out.close();
	}

}
