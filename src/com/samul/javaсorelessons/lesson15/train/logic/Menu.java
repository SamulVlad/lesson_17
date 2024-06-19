package com.samul.javaсorelessons.lesson15.train.logic;

import java.util.Scanner;

import com.samul.javaсorelessons.lesson15.train.entity.Train;
import com.samul.javaсorelessons.lesson15.train.entity.TrainStation;
import com.samul.javaсorelessons.lesson15.train.view.TrainView;

public class Menu {
	private TrainStation trainStation;
	
	private Menu() {
	}

	public Menu(TrainStation trainStation) {
		this.trainStation = trainStation;
	}

	public boolean chooseAndDoAction() {
		Scanner sc = new Scanner(System.in);
		int i;

		i = sc.nextInt();

		if (i == 1) {
			TrainView.printTrainsInfo(trainStation);
			return true;
		} else if (i == 2) {
			TrainStationLogic.sortTrainsByNumber(trainStation);
			return true;
		} else if (i == 3) {
			TrainStationLogic.sortTrainsByDestinationAndTime(trainStation);
			return true;
		} else if (i == 4) {

			System.out.print("Enter train number: ");
			String trNum = sc.next();
			Train train = TrainStationLogic.findTrainByNumber(trNum, trainStation);
			if (train != null) {
				TrainView.printTrainInfo(train);
			} else {
				System.out.println("No such train number!");
			}
			return true;
			
		} else if (i == 0) {
			return false;
		} else {
			System.out.println("Do right choice");
			return true;
		}

	}

	public static void showMenu() {
		System.out.println("\n\n++++++++++++++ MENU ++++++++++++++++++++");
		System.out.println("1. Print trains");
		System.out.println("2. Sort trains by number");
		System.out.println("3. Sort trains by destination and time");
		System.out.println("4. Print train information");
		System.out.println("0. Exit");
		System.out.print(">>");

	}

}
