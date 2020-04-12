package com.company.training.object;

import java.util.ArrayList;

import com.company.training.object.train.bean.Train;
import com.company.training.object.train.logic.TrainLogic;
import com.company.training.object.train.view.TrainView;

public class TrainDemo {
	
	public static void main(String[] args) {
		
	    Train tr1 = new Train("Сочи", 323, 3, 30);
	    Train tr2 = new Train("Сыктывкар", 500, 1, 0);
	    Train tr3 = new Train("Сыктывкар", 501, 2, 25);
	    Train tr4 = new Train("Сочи", 100, 16, 30);
	    Train tr5 = new Train("Минск", 222, 14, 55);
	    Train tr6 = new Train("Минск", 225, 14, 45);
	    
	  ArrayList<Train> trains = new ArrayList<>();  
	    trains.add(tr1);
	    trains.add(tr2);
	    trains.add(tr3);
	    trains.add(tr4);
	    trains.add(tr5);
	    trains.add(tr6);
	    
	    TrainLogic trLogic = new TrainLogic();
	    
	    Train foundTrain = trLogic.findTrain(trains);
	    
	    System.out.println("Поиск поезда по номеру");
	    System.out.println("");
	    
	    TrainView trView = new TrainView();

	    trView.printTrainInfo(foundTrain);
	    
	    System.out.println("");
	    System.out.println("Сортировка поездов по номеру");
	    System.out.println("");
	    
	    ArrayList<Train> sorted = trLogic.sortedByTrainNumber(trains);
	    
	    trView.printArray(sorted);
	    
	    System.out.println("");
	    System.out.println("Сортировка поездов по станции и времени");
	    System.out.println("");
	    
	    ArrayList<Train> sortedByStationAndTime = trLogic.sortedByStationAndTime(trains);
	    
	    trView.printArray(sortedByStationAndTime);
	   
	}

}
