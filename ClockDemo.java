package com.company.training.object;

import com.company.training.object.time.bean.Clock;
import com.company.training.object.time.logic.ClockLogic;
import com.company.training.object.time.view.ClockView;

public class ClockDemo {
	
	public static void main(String[] args) {
		Clock time = new Clock();
		
		time.setHours(23);
		time.setMinutes(1);
		time.setSeconds(1);
		
		
		ClockLogic logic = new ClockLogic();
		
		int updTimeInSec;
		updTimeInSec = logic.getChangedTimeInSec(time, 3, 1, 1);
		
		int updHours = logic.getHoursFromSec(updTimeInSec);
		int updMinutes = logic.getMinutesFromSec(updTimeInSec);
		int updSeconds = logic.getSeconds(updTimeInSec);
		
		ClockView view = new ClockView();
		
		view.printTime(updHours, updMinutes, updSeconds);
		
	}

}
