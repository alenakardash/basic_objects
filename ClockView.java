package com.company.training.object.time.view;

public class ClockView {
	
	public void printTime(int hours, int minutes, int seconds) {
		
		String hour = "" + hours;
		
		if (hours < 10) {
			hour = "0" + hour;
			
		}
		
		String minute = "" + minutes;
		
		if (minutes < 10) {
			minute = "0" + minute;
		}
		
		String second = "" + seconds;
		
		if (seconds < 10) {
			second = "0" + second;
		}
			
		System.out.println(hour + " : " + minute + " : " + second);
	}

}
