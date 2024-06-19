package com.samul.javaсorelessons.lesson15.train.entity;

import java.util.Date;
import java.util.Objects;

public class Train {
	private String destinationName;
	private String trainNumber;
	private Date depatureTime;
	
	public Train(String destinationName, String trainNumber, Date depatureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.depatureTime = depatureTime;
	}
	
	public String getTrainNumber() {
		return trainNumber;
	}
	

	public String getDestinationName() {
		return destinationName;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depatureTime, destinationName, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depatureTime, other.depatureTime)
				&& Objects.equals(destinationName, other.destinationName)
				&& Objects.equals(trainNumber, other.trainNumber);
	}


}
