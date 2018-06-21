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
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}

	

