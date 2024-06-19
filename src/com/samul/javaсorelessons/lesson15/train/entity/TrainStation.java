package com.samul.javaсorelessons.lesson15.train.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainStation {
	private List<Train> trains = new ArrayList<Train>();

	public TrainStation() {
	}

	public TrainStation(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public void addTrain(Train train) {
		this.trains.add(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainStation other = (TrainStation) obj;
		return Objects.equals(trains, other.trains);
	}
	

}
