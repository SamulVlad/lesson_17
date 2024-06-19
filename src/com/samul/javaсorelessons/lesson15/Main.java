package com.samul.javaсorelessons.lesson15;

import java.util.Date;
import java.util.Scanner;

import com.samul.javaсorelessons.lesson15.train.entity.Train;
import com.samul.javaсorelessons.lesson15.train.entity.TrainStation;
import com.samul.javaсorelessons.lesson15.train.logic.Menu;

public class Main {

	public static void main(String[] args) {
		TrainStation trs = new TrainStation();

		trs.addTrain(new Train("Gomel", "GM120", new Date(0, 0, 0, 10, 10)));
		trs.addTrain(new Train("Mogilev", "MG130", new Date(0, 0, 0, 11, 15)));
		trs.addTrain(new Train("Grodno", "GR140", new Date(0, 0, 0, 12, 30)));
		trs.addTrain(new Train("Brest", "BR150", new Date(0, 0, 0, 13, 20)));
		trs.addTrain(new Train("Brest", "BR151", new Date(0, 0, 0, 13, 55)));
		trs.addTrain(new Train("Vitebsk", "VT160", new Date(0, 0, 0, 14, 55)));
		trs.addTrain(new Train("Brest", "BR153", new Date(0, 0, 0, 13, 45)));

		Menu menu = new Menu(trs);
		
		do {
			menu.showMenu();
		} while (menu.chooseAndDoAction() != false);

	}

}
