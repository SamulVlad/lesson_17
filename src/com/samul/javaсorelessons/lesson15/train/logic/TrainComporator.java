package com.samul.javaсorelessons.lesson15.train.logic;

import java.util.Comparator;

import com.samul.javaсorelessons.lesson15.train.entity.Train;

public class TrainComporator implements Comparator<Train> {

	public final static int SORT_BY_TRAIN_NUMBER = 1;
	public final static int SORT_BY_DESTINATION_AND_TIME = 2;
	public int sortType;

	private TrainComporator() {
	}

	public TrainComporator(int sortType) {
		this.sortType = sortType;
	}

	@Override
	public int compare(Train o1, Train o2) {
		int result;

		if (this.sortType == 1) {
			result = o1.getTrainNumber().compareTo(o2.getTrainNumber());

		} else if (this.sortType == 2) {
			result = o1.getDestinationName().compareTo(o2.getDestinationName());
			if (result == 0) {
				result = o1.getDepatureTime().compareTo(o2.getDepatureTime());
			}

		} else {
			result = 0;
		}

		return result;

	}

}
