package com.company.training.object.train.logic;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.training.object.train.bean.Train;

public class TrainLogic {
	
	
	public Train findTrain(ArrayList<Train> trains) {
		
	
	@SuppressWarnings("resource")
 Scanner sc = new Scanner(System.in);
	
	System.out.println("Введите номер поезда: ");
	
	while(!sc.hasNextInt()) {
		System.out.println("Введите номер поезда: ");
		sc.next();
	}
	
	int number = sc.nextInt();
	
	Train train = null;
	
	for(int i = 0; i < trains.size(); i++) {
		if(number == trains.get(i).getTrainNumber()) {
			train = trains.get(i);
						
		}
	}
     return train;
	
	}
	
	public ArrayList<Train> sortedByTrainNumber(ArrayList<Train> trains) {
		
		for(int i = trains.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
			
			Train current = trains.get(j);
			Train next = trains.get(j + 1);
			
			if(current.getTrainNumber() > next.getTrainNumber()) {
				trains.remove(j);
				trains.add(j + 1, current);
				
			}
			}
		}
		return trains;
	}
	
	public ArrayList<Train> sortedByStationAndTime(ArrayList<Train> trains) {
		for(int i = trains.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
			
			String current = trains.get(j).getStation();
			String next = trains.get(j + 1).getStation();
			
			Train currentTrain = trains.get(j);

			
			if(current.compareTo(next) > 1) {
				trains.remove(j);
				trains.add(j + 1, currentTrain);
				
			}
			}
		}
		
		for(int i = 0; i < trains.size() - 1; i++) {
			String current = trains.get(i).getStation();
			String next = trains.get(i + 1).getStation();
			Train currentTrain = trains.get(i);
		if(current.compareTo(next) == 0) {
			if(trains.get(i).getDepartureTime().isAfter(trains.get(i + 1).getDepartureTime())) {
				trains.remove(i);
				trains.add(i + 1, currentTrain);
			}
		}
		}
		return trains;
	}
   

}
