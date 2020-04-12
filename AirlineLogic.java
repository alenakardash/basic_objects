package com.company.training.airline.logic;

import java.time.LocalTime;
import java.util.ArrayList;

import com.company.training.airline.bean.Airline;
import com.company.training.airline.bean.Airline.Days;

public class AirlineLogic {
	
	public ArrayList<Airline> findAirlinesByDestination(ArrayList<Airline> airlines, String destination) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		int count = 0;
		
		for(Airline airline : airlines) {
			if(airline.getDestination().equals(destination)) {
				result.add(airline);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There are no airlines for " + destination + " destination");
		}
			
		
		return result;
	}
	
	public ArrayList<Airline> findAirlinesByDayOfWeek(ArrayList<Airline> airlines, Days dayOfWeek) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		int count = 0;
		
		for(Airline airline : airlines) {
			if(ifContainsDepartureDay(airline.getDepartureDays(), dayOfWeek)) {
				result.add(airline);
			}
		}
		
		if (count == 0) {
			System.out.println("There are no airlines on " + dayOfWeek);
		}
		return result;
				
	}
	
	public boolean ifContainsDepartureDay(ArrayList<Days> departureDays, Days dayOfWeek) {
		
		for(Days day : departureDays) {
			if(day.equals(dayOfWeek)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Airline> findAirlinesByDayOfWeekAndLaterThanTime(ArrayList<Airline> airlines, Days dayOfWeek, int hour, int minutes) {
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		ArrayList<Airline> airlinesByDayOfWeek = findAirlinesByDayOfWeek(airlines, dayOfWeek);
		
		int count = 0;
		
		LocalTime time = LocalTime.of(hour, minutes);
		
		for(Airline airline : airlinesByDayOfWeek) {
						
			if(airline.getDepartureTime().compareTo(time) > 0) {
				result.add(airline);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no airlines later than " + time + " on " + dayOfWeek);
		}
		return result;
	}
	

}
