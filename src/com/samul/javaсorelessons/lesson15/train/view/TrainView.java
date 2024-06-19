package com.samul.javaсorelessons.lesson15.train.view;

import com.samul.javaсorelessons.lesson15.train.entity.Train;
import com.samul.javaсorelessons.lesson15.train.entity.TrainStation;

public class TrainView {

	public static void printTrainInfo(Train train) {
		String result;
		result = "Train №: " + train.getTrainNumber()
				+ " | Destination: " + train.getDestinationName()
				+ " | Depature time: " + train.getDepatureTime().getHours() + ":" + train.getDepatureTime().getMinutes();
				
		System.out.println(result);
		
	}

	public static void printTrainsInfo(TrainStation trainStation) {
		
		System.out.println("-------------------------------------------------");
		System.out.printf("|%7s\t|%10s\t|%10s\t|\n", "Train №", "Destination","Dep. time");
		System.out.println("-------------------------------------------------");
	
		for (Train elem : trainStation.getTrains()) {
			System.out.printf("|%7s\t|%10s\t|%tT\t|\n", elem.getTrainNumber(), elem.getDestinationName(),elem.getDepatureTime());
		}
	
		System.out.println("-------------------------------------------------");
	}

}
