package com.company.training.airline.bean;

import java.time.LocalTime;
import java.util.ArrayList;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести 
 эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Airline {
	private String destination;
	private int flightNumber;
	private String planeType;
	private LocalTime departureTime;
	private ArrayList<Days> departureDays;
	
	public enum Days {
	      MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	      
	   }
	
	public Airline(String destination, int flightNumber, String planeType, int hour, int minute, ArrayList<Days> departureDays) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = LocalTime.of(hour, minute);
		this.departureDays = departureDays;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public ArrayList<Days> getDepartureDays() {
		return departureDays;
	}

	public void setDepartureDays(ArrayList<Days> departureDays) {
		this.departureDays = departureDays;
	}
	
	public String toString() {
		return "Airline info: airline type = " + planeType + ", flight = " + flightNumber + ", destination is   " + destination + ", departure time is " + departureTime + ", departure days = " + findDepartureDays();
	}
	
	
public String findDepartureDays() {
	String days = "";
	for(Days day : departureDays) {
		days += day + " ";
	}
	return days;
}

}
