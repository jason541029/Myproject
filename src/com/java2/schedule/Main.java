package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
		List<Course>courses = new ArrayList<>();
		public Main() {
			readCourses();
			
			
		}
		private void readCourses() {
			// TODO Auto-generated method stub
			try {
				BufferedReader in  = new BufferedReader(new FileReader(("schedule.txt")));
				String line = in.readLine();
				while(line!=null);
				String[]tokens = line.split(",");
			String id = tokens[0];
			String name = tokens[1];
			int weekDay = Integer.parseInt(tokens[2]);
			int hour = Integer.parseInt(tokens[3]);
			int duration = Integer.parseInt(tokens[4]);
			Course c  = new Course(id ,name,weekDay,hour,duration);
			courses.add(c);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
		}
	

