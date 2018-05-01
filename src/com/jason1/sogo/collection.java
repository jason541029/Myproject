package com.jason1.sogo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(9);
System.out.println(list);
Set<Integer> set = new HashSet<>();
set.add(4);
set.add(7);

set.add(9);

set.add(4);

System.out.println(set);
Set<String> set2 = new HashSet<>();
set2.add("123");
set2.add("358");
set2.add("978");
set2.add("123");
System.out.println(set2);

Map<String,String> stocks = new TreeMap<>();
stocks.put("2330", "TSCM");
stocks.put("2454", "MEDIATEK");
stocks.put("2317", "HONHAI");
System.out.println(stocks);



		
	}

}
