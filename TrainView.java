package com.company.training.object.train.view;

import java.util.ArrayList;

import com.company.training.object.train.bean.Train;

public class TrainView {
	
	public void printTrainInfo(Train tr) {
		
		if (tr != null) {
		System.out.println("Поезд номер " + tr.getTrainNumber() + " отправляется со станции " + tr.getStation());
		System.out.println("Время отправления " + tr.getDepartureTime());
		}
		else {
			System.out.println("Такого поезда не существует");
		}
	}
	
	public void printArray(ArrayList<Train> trains) {
		for(int i = 0; i < trains.size(); i++) {
			printTrainInfo(trains.get(i));
		}
	}

}
