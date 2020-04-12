package com.company.training.airline.view;

import java.util.ArrayList;

import com.company.training.airline.bean.Airline;

public class AirlineView {
	
	public void printAirlines(ArrayList<Airline> airlines) {
		for(Airline airline : airlines) {
			System.out.println(airline.toString());
		}
	}

}
