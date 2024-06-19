package com.samul.javaсorelessons.lesson15.train.logic;

import java.util.Collections;

import com.samul.javaсorelessons.lesson15.train.entity.Train;
import com.samul.javaсorelessons.lesson15.train.entity.TrainStation;

public class TrainStationLogic {

	public static void sortTrainsByDestinationAndTime(TrainStation param) {
	
		TrainComporator tc = new TrainComporator(TrainComporator.SORT_BY_DESTINATION_AND_TIME);
		Collections.sort(param.getTrains(), tc);
	
	}

	public static void sortTrainsByNumber(TrainStation param) {
	
		TrainComporator tc = new TrainComporator(TrainComporator.SORT_BY_TRAIN_NUMBER);
		Collections.sort(param.getTrains(), tc);
	
	}

	public static Train findTrainByNumber(String trainNumber, TrainStation trainStation) {
		
		for (Train elem : trainStation.getTrains()) {
			if(elem.getTrainNumber().equalsIgnoreCase(trainNumber)) {
				return elem;
			}
		}
		
		return null;
	}

}
