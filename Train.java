package com.company.training.object.train.bean;

import java.time.LocalTime;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в массив из пяти 
элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, 
номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
*/

public class Train {
	
	private String station;
	private int trainNumber;
	private LocalTime departureTime;
	
	public Train(String station, int number, int hour, int minute) {
		
		this.station = station;
		trainNumber = number;
		departureTime = LocalTime.of(hour, minute);
		}
	
	public void setStation(String station) {
		this.station = station;
	}
	
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public void departureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	
	public String getStation() {
		return station;
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	

}
