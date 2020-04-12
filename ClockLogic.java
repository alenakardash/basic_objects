package com.company.training.object.time.logic;

import com.company.training.object.time.bean.Clock;

public class ClockLogic {
	
	public int getChangedTimeInSec(Clock currentTime, int hours, int minutes, int seconds) {
		int currentTimeInSec = currentTime.getHours() * 3600 + currentTime.getMinutes() * 60 + currentTime.getSeconds();
		
		int changedTimeInSec;
		int hoursToSec = 0;
		int minutesToSec = 0;
		
		if (hours >= 0) {
			hoursToSec = hours * 3600;
		}
		
		if (minutes >= 0) {
			minutesToSec = minutes * 60;
		}
		
		if (seconds < 0) {
			seconds = 0;
		}

		
		changedTimeInSec = currentTimeInSec + hoursToSec + minutesToSec + seconds;
		
		return changedTimeInSec;
	}
	
	public int getHoursFromSec(int timeInSec) {
		int hours = timeInSec / 3600;
		
		if(hours == 24) {
			hours = 0;
		}
		
		if (hours % 24 > 0) {
			hours = hours % 24;
			
		}
		return hours;
	}
	
	public int getMinutesFromSec(int timeInSec) {
		int minutes = timeInSec % 3600 / 60;
		return minutes;
	}
	
	public int getSeconds(int timeInSec) {
		int seconds = timeInSec % 60;
		return seconds;
	}

}
