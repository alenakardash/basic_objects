package com.company.training.object;

import java.util.ArrayList;

import com.company.training.airline.bean.Airline;
import com.company.training.airline.bean.Airline.Days;
import com.company.training.airline.logic.AirlineLogic;
import com.company.training.airline.view.AirlineView;

public class AirlineDemo {

	public static void main(String[] args) {

		ArrayList<Airline> airlines = new ArrayList<Airline>();

		ArrayList<Days> departureDays1 = new ArrayList<Days>();
		ArrayList<Days> departureDays2 = new ArrayList<Days>();
		ArrayList<Days> departureDays3 = new ArrayList<Days>();
		ArrayList<Days> departureDays4 = new ArrayList<Days>();
		ArrayList<Days> departureDays5 = new ArrayList<Days>();

		departureDays1.add(Days.MONDAY);
		departureDays1.add(Days.SUNDAY);

		departureDays2.add(Days.TUESDAY);
		departureDays2.add(Days.WEDNESDAY);

		departureDays3.add(Days.MONDAY);

		departureDays4.add(Days.WEDNESDAY);

		departureDays5.add(Days.TUESDAY);
		departureDays5.add(Days.SATURDAY);

		Airline airline1 = new Airline("Milan", 1, "boeing", 13, 0, departureDays1);
		Airline airline2 = new Airline("Minsk", 2, "boeing", 16, 30, departureDays2);
		Airline airline3 = new Airline("Moskow", 3, "boeing", 18, 25, departureDays3);
		Airline airline4 = new Airline("Berlin", 4, "boeing", 10, 15, departureDays4);
		Airline airline5 = new Airline("Paris", 5, "boeing", 11, 55, departureDays5);

		airlines.add(airline1);
		airlines.add(airline2);
		airlines.add(airline3);
		airlines.add(airline4);
		airlines.add(airline5);

		AirlineLogic logic = new AirlineLogic();

		ArrayList<Airline> airlinesByDestination = new ArrayList<Airline>();

		airlinesByDestination = logic.findAirlinesByDestination(airlines, "Minsk");

		AirlineView view = new AirlineView();

		view.printAirlines(airlinesByDestination);

		ArrayList<Airline> airlinesByDayOfWeek = new ArrayList<Airline>();

		airlinesByDayOfWeek = logic.findAirlinesByDayOfWeek(airlines, Days.MONDAY);

		System.out.println("");

		view.printAirlines(airlinesByDayOfWeek);

		ArrayList<Airline> airlinesByDayAndLaterThanTime = new ArrayList<Airline>();

		airlinesByDayAndLaterThanTime = logic.findAirlinesByDayOfWeekAndLaterThanTime(airlines, Days.MONDAY, 15, 0);

		System.out.println("");

		view.printAirlines(airlinesByDayAndLaterThanTime);
	}

}
